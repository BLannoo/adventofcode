package com.blannoo.adventofcode.day12;

import com.blannoo.adventofcode.utils.FileUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Day12Challenge {
    private FileUtil fileUtil = new FileUtil();

    public long silver(String fileName) {
        List<List<Integer>> hubs = getHubs(fileName);

        return new Neighbourhood(0, hubs).size();
    }

    private List<List<Integer>> getHubs(String fileName) {
        return fileUtil.getBufferedReader(fileName)
                .lines()
                .map(this::parse)
                .collect(Collectors.toList());
    }

    private List<Integer> parse(String description) {
        String[] neighbours = description.split("<->")[1].split(",");
        return Arrays.stream(neighbours)
                .map(a -> Integer.parseInt(a.trim()))
                .collect(Collectors.toList());
    }

    public long golden(String fileName) {
        List<List<Integer>> hubs = getHubs(fileName);

        Set<Integer> allPrograms = IntStream.range(0, hubs.size()).boxed().collect(Collectors.toSet());

        int groupCount = 0;
        while (!allPrograms.isEmpty()) {
            Set<Integer> assignedPrograms = new Neighbourhood(allPrograms.iterator().next(), hubs).getNeighbours();
            allPrograms.removeAll(assignedPrograms);
            groupCount++;
        }

        return groupCount;
    }
}

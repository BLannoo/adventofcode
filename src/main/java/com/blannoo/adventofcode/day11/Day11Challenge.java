package com.blannoo.adventofcode.day11;

import com.blannoo.adventofcode.utils.FileUtil;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Day11Challenge {
    private FileUtil fileUtil = new FileUtil();

    long silver(String fileName) throws IOException {
        List<Direction> inputs = getDirections(fileName);
        return determineDistance(inputs);
    }

    long golden(String fileName) throws IOException {
        List<Direction> inputs = getDirections(fileName);
        return IntStream.range(0, inputs.size())
                .mapToLong(index -> determineDistance(inputs.subList(0, index)))
                .max()
                .orElse(0);
    }

    private long determineDistance(List<Direction> inputs) {
        Map<Direction, Integer> directionCounts = countDirections(inputs);

        int horizontal = Math.abs(directionCounts.entrySet()
                .stream()
                .mapToInt(entry -> entry.getKey().getHorizontal() * entry.getValue())
                .sum());

        double vertical = Math.abs(directionCounts.entrySet()
                .stream()
                .mapToDouble(entry -> entry.getKey().getVertical() * entry.getValue())
                .sum());

        if (vertical < horizontal) {
            return horizontal;
        }
        return Math.round(vertical + 0.5 * horizontal);
    }

    private List<Direction> getDirections(String fileName) throws IOException {
        String[] inputs = fileUtil.getBufferedReader(fileName)
                .readLine()
                .split(",");

        return Arrays.stream(inputs)
                .map(Direction::parse)
                .collect(Collectors.toList());
    }

    private HashMap<Direction, Integer> countDirections(List<Direction> directions) {
        HashMap<Direction, Integer> directionCounts = new HashMap<>();

        for (Direction direction : directions) {
            Integer oldCount = Optional.ofNullable(directionCounts.get(direction)).orElse(0);
            directionCounts.put(direction, oldCount + 1);
        }
        return directionCounts;
    }
}

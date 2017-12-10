package com.blannoo.adventofcode.day2;

import com.blannoo.adventofcode.utils.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Day2Challenge {

    private FileUtil fileUtil = new FileUtil();

    long runSilverChallenge(String inputFileName) throws IOException {
        return checkSum(inputFileName, this::differenceMinMax);
    }

    long runGoldenChallenge(String inputFileName) {
        return checkSum(inputFileName, this::evenDivider);
    }

    private long checkSum(String inputFileName, ToLongFunction<String> lineEvaluator) {
        return fileUtil.getBufferedReader(inputFileName)
                .lines()
                .mapToLong(lineEvaluator)
                .sum();
    }

    private long evenDivider(String line) {
        List<Long> longs = lineToLongs(line).map(Long::parseLong).collect(Collectors.toList());
        for (int i = 0; i < longs.size(); i++) {
            long v1 = longs.get(i);
            for (int j = 0; j < longs.size(); j++) {
                if (i == j) {
                    continue;
                }
                long v2 = longs.get(j);
                if (v1 % v2 == 0) {
                    return v1 / v2;
                }
            }
        }
        throw new IllegalArgumentException("No even divider present in line: " + line);
    }

    private long differenceMinMax(String line) {
        long max = lineToLongs(line)
                .mapToLong(Long::parseLong)
                .max().orElse(0);
        long min = lineToLongs(line)
                .mapToLong(Long::parseLong)
                .min().orElse(0);
        return max - min;
    }

    private Stream<String> lineToLongs(String line) {
        return Arrays.stream(line.split("\t"));
    }
}

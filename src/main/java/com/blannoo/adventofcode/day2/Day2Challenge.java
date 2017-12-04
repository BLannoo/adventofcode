package com.blannoo.adventofcode.day2;

import java.io.*;
import java.util.Arrays;

class Day2Challenge {
    long runSilverChallenge(String inputFileName) throws IOException {

        final InputStream stream = this.getClass().getResourceAsStream(inputFileName);
        final InputStreamReader reader = new InputStreamReader(stream);
        final BufferedReader buffered = new BufferedReader(reader);

        return buffered.lines()
                .mapToLong(this::lineValue)
                .sum();
    }

    private long lineValue(String line) {
        long max = Arrays.stream(line.split("\t"))
                .mapToLong(Long::parseLong)
                .max().orElse(0);
        long min = Arrays.stream(line.split("\t"))
                .mapToLong(Long::parseLong)
                .min().orElse(0);
        return max - min;
    }
}

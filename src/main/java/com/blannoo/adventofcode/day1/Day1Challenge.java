package com.blannoo.adventofcode.day1;

import java.util.stream.IntStream;

class Day1Challenge {
    long run(String input) {
        return IntStream.range(0, input.length())
                .filter(i -> isSameAsNext(input, i))
                .map(i -> toInt(input, i))
                .sum();
    }

    private int toInt(String input, int i) {
        return Integer.parseInt("" + input.charAt(i));
    }

    private boolean isSameAsNext(String input, int i) {
        return input.charAt(i) == input.charAt((i + 1) % input.length());
    }
}

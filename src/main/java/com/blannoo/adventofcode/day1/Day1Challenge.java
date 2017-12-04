package com.blannoo.adventofcode.day1;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

class Day1Challenge {
    long runSilverChallenge(String input) {
        return run(input, i -> isSameAsNext(input, i));
    }

    long runGoldChallenge(String input) {
        return run(input, i -> isSameAsSteps(input, i, input.length()/2));
    }

    private long run(String input, IntPredicate intPredicate) {
        return IntStream.range(0, input.length())
                .filter(intPredicate)
                .map(i -> toInt(input, i))
                .sum();
    }

    private int toInt(String input, int i) {
        return Integer.parseInt("" + input.charAt(i));
    }

    private boolean isSameAsNext(String input, int i) {
        return isSameAsSteps(input, i, 1);
    }

    private boolean isSameAsSteps(String input, int i, int stepSize) {
        return input.charAt(i) == input.charAt((i + stepSize) % input.length());
    }
}

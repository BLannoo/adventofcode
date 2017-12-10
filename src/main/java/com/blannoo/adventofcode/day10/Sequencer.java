package com.blannoo.adventofcode.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Sequencer {
    List<Integer> generate(String rawInput) {
        List<Integer> integers = rawInput.chars()
                .boxed()
                .collect(Collectors.toList());
        integers.addAll(Arrays.asList(17, 31, 73, 47, 23));
        return integers;
    }
}

package com.blannoo.adventofcode.day10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Day10ChallengeTest {

    private static final List<Integer> MY_INPUT
            = Arrays.asList(31, 2, 85, 1, 80, 109, 35, 63, 98, 255, 0, 13, 105, 254, 128, 33);

    @Test
    public void example() throws Exception {
        List<Integer> example_input = Arrays.asList(3, 4, 1, 5);
        Assertions.assertThat(new Day10Challenge().silver(5, example_input)).isEqualTo(12);
    }

    @Test
    public void silver() throws Exception {
        Assertions.assertThat(new Day10Challenge().silver(256, MY_INPUT)).isEqualTo(6952);
    }
}

package com.blannoo.adventofcode.day10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class LoopTest {

    private Loop loop = new Loop(5);

    @Test
    public void example() throws Exception {
        Assertions.assertThat(loop.getLoop()).isEqualTo(Arrays.asList(0, 1, 2, 3, 4));

        loop.reverse(3, 0);
        Assertions.assertThat(loop.getLoop()).isEqualTo(Arrays.asList(2, 1, 0, 3, 4));

        loop.reverse(4, 3);
        Assertions.assertThat(loop.getLoop()).isEqualTo(Arrays.asList(4, 3, 0, 1, 2));

        loop.reverse(5, 1);
        Assertions.assertThat(loop.getLoop()).isEqualTo(Arrays.asList(3, 4, 2, 1, 0));
    }
}
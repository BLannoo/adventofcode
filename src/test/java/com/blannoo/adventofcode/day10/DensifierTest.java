package com.blannoo.adventofcode.day10;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class DensifierTest {

    private Densifier densifier = new Densifier();

    @Test
    public void test() throws Exception {
        List<Integer> example = asList(65, 27, 9, 1, 4, 3, 40, 50, 91, 7, 6, 0, 2, 5, 68, 22);

        // 64 -hex-> 40
        assertThat(densifier.sum(example)).isEqualTo("40");
    }
}
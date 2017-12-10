package com.blannoo.adventofcode.day10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class SequencerTest {
    @Test
    public void test() throws Exception {
        Assertions.assertThat(new Sequencer().generate("1,2,3"))
                .isEqualTo(Arrays.asList(49, 44, 50, 44, 51, 17, 31, 73, 47, 23));
    }
}
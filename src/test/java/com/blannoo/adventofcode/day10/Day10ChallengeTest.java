package com.blannoo.adventofcode.day10;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class Day10ChallengeTest {

    private static final List<Integer> MY_INPUT
            = asList(31, 2, 85, 1, 80, 109, 35, 63, 98, 255, 0, 13, 105, 254, 128, 33);

    private static final String MY_INPUT_RAW = "31,2,85,1,80,109,35,63,98,255,0,13,105,254,128,33";

    private Day10Challenge challenge = new Day10Challenge(new Sequencer());

    @Test
    public void silver() throws Exception {
        assertThat(challenge.silver(5, asList(3, 4, 1, 5))).isEqualTo(12);
        assertThat(challenge.silver(256, MY_INPUT)).isEqualTo(6952);
    }

    @Test
    public void golden() throws Exception {
        assertThat(challenge.golden("")).isEqualTo("a2582a3a0e66e6e86e3812dcb672a272");
        assertThat(challenge.golden("AoC 2017")).isEqualTo("33efeb34ea91902bb2f59c9920caa6cd");
        assertThat(challenge.golden("1,2,3")).isEqualTo("3efbe78a8d82f29979031a4aa0b16a9d");
        assertThat(challenge.golden("1,2,4")).isEqualTo("63960835bcdc130f0b66d7ff4f6a5a8e");
        assertThat(challenge.golden(MY_INPUT_RAW)).isEqualTo("28e7c4360520718a5dc811d3942cf1fd");
    }
}

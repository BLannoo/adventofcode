package com.blannoo.adventofcode.day12;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day12ChallengeTest {
    private Day12Challenge day12Challenge = new Day12Challenge();

    @Test
    public void silver() throws Exception {
        assertThat(day12Challenge.silver("/day12/example.txt")).isEqualTo(6);
        assertThat(day12Challenge.silver("/day12/challenge.txt")).isEqualTo(175);
    }

    @Test
    public void golden() throws Exception {
        assertThat(day12Challenge.golden("/day12/example.txt")).isEqualTo(2);
        assertThat(day12Challenge.golden("/day12/challenge.txt")).isEqualTo(213);
    }
}
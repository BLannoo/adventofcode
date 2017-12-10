package com.blannoo.adventofcode.day4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day4ChallengeTest {

    private Day4Challenge day4Challenge = new Day4Challenge();

    @Test
    public void silver() throws Exception {
        assertThat(day4Challenge.silver("/day4/silverExample.txt")).isEqualTo(2);
        assertThat(day4Challenge.silver("/day4/challenge.txt")).isEqualTo(337);
    }

    @Test
    public void golden() throws Exception {
        assertThat(day4Challenge.golden("/day4/goldenExample.txt")).isEqualTo(3);
        assertThat(day4Challenge.golden("/day4/challenge.txt")).isEqualTo(231);
    }
}
package com.blannoo.adventofcode.day13;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Day13ChallengeTest {
    private Day13Challenge day13Challenge = new Day13Challenge();

    @Test
    public void silver() throws Exception {
        Assertions.assertThat(day13Challenge.silver("/day13/example.txt")).isEqualTo(24);
        Assertions.assertThat(day13Challenge.silver("/day13/challenge.txt")).isEqualTo(1632);
    }
}
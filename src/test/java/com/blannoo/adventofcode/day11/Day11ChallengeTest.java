package com.blannoo.adventofcode.day11;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Day11ChallengeTest {
    private Day11Challenge day11Challenge = new Day11Challenge();

    @Test
    public void silver() throws Exception {
        Assertions.assertThat(day11Challenge.silver("/day11/example1.txt")).isEqualTo(3);
        Assertions.assertThat(day11Challenge.silver("/day11/example2.txt")).isEqualTo(0);
        Assertions.assertThat(day11Challenge.silver("/day11/example3.txt")).isEqualTo(2);
        Assertions.assertThat(day11Challenge.silver("/day11/example4.txt")).isEqualTo(3);
        Assertions.assertThat(day11Challenge.silver("/day11/ownExample1.txt")).isEqualTo(0);
        Assertions.assertThat(day11Challenge.silver("/day11/ownExample2.txt")).isEqualTo(8);
        Assertions.assertThat(day11Challenge.silver("/day11/challenge.txt")).isEqualTo(707);
    }
}
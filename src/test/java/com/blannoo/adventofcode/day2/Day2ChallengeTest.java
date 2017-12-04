package com.blannoo.adventofcode.day2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Day2ChallengeTest {
    private Day2Challenge day2Challenge = new Day2Challenge();

    @Test
    public void givenExample_WhenSilverRun_ThenReturn18() throws Exception {
        Assertions.assertThat(day2Challenge.runSilverChallenge("/day2/silverExample.txt")).isEqualTo(18);
    }

    @Test
    public void givenChallenge_WhenSilverRun_ThenReturnSolution() throws Exception {
        Assertions.assertThat(day2Challenge.runSilverChallenge("/day2/challenge.txt")).isEqualTo(53460);
    }

    @Test
    public void givenExample_WhenGoldenRun_ThenReturn9() throws Exception {
        Assertions.assertThat(day2Challenge.runGoldenChallenge("/day2/goldenExample.txt")).isEqualTo(9);
    }

    @Test
    public void givenChallenge_WhenGoldenRun_ThenReturnSolution() throws Exception {
        Assertions.assertThat(day2Challenge.runGoldenChallenge("/day2/challenge.txt")).isEqualTo(282);
    }
}

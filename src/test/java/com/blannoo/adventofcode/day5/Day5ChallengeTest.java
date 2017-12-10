package com.blannoo.adventofcode.day5;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Day5ChallengeTest {

    private Day5Challenge day5Challenge = new Day5Challenge();

    @Test
    public void silver() throws Exception {
        Assertions.assertThat(day5Challenge.silver("/day5/silverExample.txt")).isEqualTo(5L);
        Assertions.assertThat(day5Challenge.silver("/day5/challenge.txt")).isEqualTo(394829L);
    }

    @Test
    public void golden() throws Exception {
        Assertions.assertThat(day5Challenge.golden("/day5/silverExample.txt")).isEqualTo(10L);
        Assertions.assertThat(day5Challenge.golden("/day5/challenge.txt")).isEqualTo(31150702L);
    }
}
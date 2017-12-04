package com.blannoo.adventofcode.day1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class day1Test {
    private Day1Challenge day1Challenge = new Day1Challenge();

    @Test
    public void Given1122_WhenRun_Then2() throws Exception {
        Assertions.assertThat(day1Challenge.run(1122)).isEqualTo(0);
    }
}

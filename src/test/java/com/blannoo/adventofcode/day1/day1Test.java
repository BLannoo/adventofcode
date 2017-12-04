package com.blannoo.adventofcode.day1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class day1Test {
    private Day1Challenge day1Challenge = new Day1Challenge();

    @Test
    public void Given1122_WhenRun_Then2() throws Exception {
        Assertions.assertThat(day1Challenge.run(1122)).isEqualTo(2);
    }

    @Test
    public void Given1111_WhenRun_Then4() throws Exception {
        Assertions.assertThat(day1Challenge.run(1111)).isEqualTo(4);
    }

    @Test
    public void Given1234_WhenRun_Then0() throws Exception {
        Assertions.assertThat(day1Challenge.run(1234)).isEqualTo(0);
    }

    @Test
    public void Given91212129_WhenRun_Then9() throws Exception {
        Assertions.assertThat(day1Challenge.run(91212129)).isEqualTo(9);
    }
}

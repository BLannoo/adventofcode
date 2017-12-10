package com.blannoo.adventofcode.day4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {

    @Test
    public void equalsTest() throws Exception {
        assertThat(new Word("abcde").equals(new Word("ecdab"))).isTrue();
        assertThat(new Word("ioii").equals(new Word("oiii"))).isTrue();

        assertThat(new Word("abcde").equals(new Word("fghij"))).isFalse();
        assertThat(new Word("oiii").equals(new Word("iiii"))).isFalse();
    }
}
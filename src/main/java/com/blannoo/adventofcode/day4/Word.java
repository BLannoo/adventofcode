package com.blannoo.adventofcode.day4;

import java.util.Arrays;

public class Word {
    private String value;

    Word(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        if (value == null && word1.value == null) {
            return true;
        }
        if (value == null) {
            return false;
        }

        char[] chars = value.toCharArray();
        char[] chars1 = word1.value.toCharArray();

        if (chars.length != chars1.length) {
            return false;
        }

        Arrays.sort(chars);
        Arrays.sort(chars1);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

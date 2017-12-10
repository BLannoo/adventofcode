package com.blannoo.adventofcode.day4;

import com.blannoo.adventofcode.utils.FileUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Day4Challenge {
    private FileUtil fileUtil = new FileUtil();

    long silver(String fileName) {
        return fileUtil.getBufferedReader(fileName)
            .lines()
            .map(this::validate)
            .filter(Boolean::booleanValue)
            .count();
    }

    private boolean validate(String passphrase) {
        List<String> words = Arrays.asList(passphrase.split(" "));
        int phraseLength = words.size();
        int numberOfWords = new HashSet<>(words).size();
        return phraseLength == numberOfWords;
    }
}

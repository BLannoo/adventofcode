package com.blannoo.adventofcode.day4;

import com.blannoo.adventofcode.utils.FileUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

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

        List<String> words = Arrays.stream(passphrase.split(" "))
                .collect(Collectors.toList());

        return words.size() == new HashSet<>(words).size();
    }

    private boolean validateAnagram(String passphrase) {

        List<Word> words = Arrays.stream(passphrase.split(" "))
                .map(Word::new)
                .collect(Collectors.toList());

        return words.size() == new HashSet<>(words).size();
    }

    long golden(String fileName) {
        return fileUtil.getBufferedReader(fileName)
                .lines()
                .map(this::validateAnagram)
                .filter(Boolean::booleanValue)
                .count();
    }
}

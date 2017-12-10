package com.blannoo.adventofcode.day5;

import com.blannoo.adventofcode.utils.FileUtil;

import java.util.List;
import java.util.stream.Collectors;

class Day5Challenge {
    private FileUtil fileUtil = new FileUtil();

    long silver(String fileName) {
        return executor(fileName, new Linear());
    }

    long golden(String fileName) {
        return executor(fileName, new Conditional());
    }

    private long executor(String fileName, OffSetChanger linear) {
        List<Integer> instructions = fileUtil.getBufferedReader(fileName)
                .lines()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int currentPosition = 0;
        int steps = 0;
        while (currentPosition < instructions.size()) {
            Integer jump = instructions.get(currentPosition);
            instructions.set(currentPosition, linear.change(jump));
            currentPosition += jump;
            steps++;
        }
        return steps;
    }

    private interface OffSetChanger {
        Integer change(Integer value);
    }

    private class Linear implements OffSetChanger {
        @Override
        public Integer change(Integer value) {
            return value + 1;
        }
    }

    private class Conditional implements OffSetChanger {
        @Override
        public Integer change(Integer value) {
            if (value >= 3) {
                return value - 1;
            }
            return value + 1;
        }
    }
}

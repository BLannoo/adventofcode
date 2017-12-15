package com.blannoo.adventofcode.day13;

import com.blannoo.adventofcode.utils.FileUtil;

class Day13Challenge {
    private FileUtil fileUtil = new FileUtil();

    public long silver(String fileName) {
        return fileUtil.getBufferedReader(fileName)
                .lines()
                .map(this::create)
                .mapToInt(SecurityScanner::severity)
                .sum();
    }

    private SecurityScanner create(String s) {
        String[] values = s.split(":");
        return new SecurityScanner(Integer.parseInt(values[0].trim()), Integer.parseInt(values[1].trim()));
    }

    private class SecurityScanner {
        private final int depth;
        private final int range;

        SecurityScanner(int depth, int range) {
            this.depth = depth;
            this.range = range;
        }

        int severity() {
            if (depth % ((range-1) * 2) == 0) {
                return depth * range;
            }
            return 0;
        }

    }
}

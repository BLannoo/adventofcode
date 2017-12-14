package com.blannoo.adventofcode.day11;

import java.util.Arrays;

enum Direction {
    N("n", 1, 0),
    NE("ne", 0.5, 1),
    SE("se", -0.5, 1),
    S("s", -1, 0),
    SW("sw", -0.5, -1),
    NW("nw", 0.5, -1);

    private final String code;
    private final double vertical;
    private final int horizontal;

    Direction(String code, double vertical, int horizontal) {
        this.code = code;
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public static Direction parse(String s) {
        return Arrays.stream(values())
                .filter(direction -> direction.hasCode(s))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Not a Directional code"));
    }

    private boolean hasCode(String s) {
        return code.equals(s);
    }

    public double getVertical() {
        return vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }
}

package com.blannoo.adventofcode.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Coordinates {
    private final int x;
    private final int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (x != that.x) return false;
        return y == that.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    Coordinates next() {
        if (y == loop()) {
            return new Coordinates(x + 1, y);
        }
        if (x == -loop()) {
            return new Coordinates(x, y + 1);
        }
        if (y == -loop()) {
            return new Coordinates(x - 1, y);
        }
        if (x == loop()) {
            return new Coordinates(x, y - 1);
        }
        throw new IllegalStateException("Should never occur");
    }

    private int loop() {
        return Math.max(Math.abs(x), Math.abs(y));
    }

    List<Coordinates> getNeighbours() {
        return Stream.of(
                new Coordinates(-1, -1),
                new Coordinates(-1, 0),
                new Coordinates(-1, 1),
                new Coordinates(0, -1),
                new Coordinates(0, 1),
                new Coordinates(1, -1),
                new Coordinates(1, 0),
                new Coordinates(1, 1)
        )
                .map(this::add)
                .collect(Collectors.toList());
    }

    private Coordinates add(Coordinates delta) {
        return new Coordinates(x + delta.x, y + delta.y);
    }

    public int manhattan() {
        return Math.abs(x) + Math.abs(y);
    }
}

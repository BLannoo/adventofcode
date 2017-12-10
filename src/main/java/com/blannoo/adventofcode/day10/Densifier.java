package com.blannoo.adventofcode.day10;

import java.util.List;

class Densifier {
    String sum(List<Integer> integers) {
        int asInt = integers.stream()
                .mapToInt(i -> i)
                .reduce((left, right) -> left ^ right)
                .orElse(0);
        return String.format("%02x" , asInt);
    }
}

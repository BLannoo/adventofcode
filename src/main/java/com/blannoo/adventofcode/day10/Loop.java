package com.blannoo.adventofcode.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Loop {

    private final List<Integer> loop;

    Loop(int loopSize) {
        loop = IntStream.range(0, loopSize)
                .boxed()
                .collect(Collectors.toList());
    }

    int checkSum() {
        return loop.get(0) * loop.get(1);
    }

    void reverse(int length, int currentPosition) {
        int swapEnd = currentPosition + length - 1;
        for (int i = 0; i < length / 2; i++) {
            int index1 = (currentPosition + i) % loop.size();
            int index2 = (swapEnd - i) % loop.size();
            Collections.swap(loop, index1, index2);
        }
    }

    List<Integer> getLoop() {
        return new ArrayList<>(loop);
    }
}

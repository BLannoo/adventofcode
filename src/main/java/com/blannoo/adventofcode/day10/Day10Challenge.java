package com.blannoo.adventofcode.day10;

import java.util.List;

class Day10Challenge {

    int silver(int loopSize, List<Integer> knotLengths) {
        Loop loop = new Loop(loopSize);
        int currentPosition = 0;
        int skipSize = 0;
        for (Integer knotLength : knotLengths) {
            loop.reverse(knotLength, currentPosition);
            currentPosition += knotLength + skipSize;
            skipSize++;
        }
        return loop.checkSum();
    }
}

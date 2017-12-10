package com.blannoo.adventofcode.day10;

import java.util.List;

class Day10Challenge {

    private Sequencer sequencer;

    Day10Challenge(Sequencer sequencer) {
        this.sequencer = sequencer;
    }

    int silver(int loopSize, List<Integer> knotLengths) {
        Loop loop = new Loop(loopSize);
        loop.hash(knotLengths);
        return loop.checkSum();
    }

    String golden(String rawInput) {
        Loop loop = new Loop(256);
        List<Integer> knotLengths = sequencer.generate(rawInput);
        for (int i = 0; i < 64; i++) {
            loop.hash(knotLengths);
        }
        return loop.mapToDenseHash(new Densifier());
    }
}

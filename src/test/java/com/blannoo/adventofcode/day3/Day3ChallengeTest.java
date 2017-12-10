package com.blannoo.adventofcode.day3;

import org.junit.Test;

public class Day3ChallengeTest {
    @Test
    public void silver() throws Exception {
        int input = 289326;
        System.out.println("input: " + input);
        double lowerRoot = Math.floor(Math.sqrt(input));
        System.out.println("lowerRoot: " + lowerRoot);
        double outerRing = input - Math.pow(lowerRoot, 2.0);
        System.out.println("outerRing: " + outerRing);
        double afterOneSide = outerRing - lowerRoot - 1;
        System.out.println("afterOneSide: " + afterOneSide);
        double halfSide = lowerRoot / 2.0 - 0.5;
        double halfwaySecondSide = afterOneSide - halfSide;
        System.out.println("halfwaySecondSide: " + halfwaySecondSide);
        double answer = halfSide + halfwaySecondSide;
        System.out.println("answer: " + answer);
    }
}

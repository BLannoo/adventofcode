package com.blannoo.adventofcode.day3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;

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

    @Test
    public void golden() throws Exception {
        Assertions.assertThat(goldenChallenge(2)).isEqualTo(2);
        Assertions.assertThat(goldenChallenge(23)).isEqualTo(23);
        Assertions.assertThat(goldenChallenge(700)).isEqualTo(747);
        Assertions.assertThat(goldenChallenge(289326)).isEqualTo(295229);
    }

    private int goldenChallenge(int input) {
        HashMap<Coordinates, Integer> storage = new HashMap<>();
        Coordinates coordinates = new Coordinates(0, 0);
        int value = 1;
        storage.put(coordinates, value);
        while (value < input) {
            coordinates = coordinates.next();
            value = coordinates.getNeighbours()
                    .stream()
                    .filter(storage::containsKey)
                    .mapToInt(storage::get)
                    .sum();
            storage.put(coordinates, value);
        }
        return value;
    }
}

package com.blannoo.adventofcode.day3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CoordinatesTest {

    private Coordinates coordinates = new Coordinates(0, 0);

    @Test
    public void Given0_0_WhenNext_Then1_0() throws Exception {
        assertNextCoordinates(new Coordinates(1, 0));
        assertNextCoordinates(new Coordinates(1, -1));
        assertNextCoordinates(new Coordinates(0, -1));
        assertNextCoordinates(new Coordinates(-1, -1));
        assertNextCoordinates(new Coordinates(-1, 0));
        assertNextCoordinates(new Coordinates(-1, 1));
        assertNextCoordinates(new Coordinates(0, 1));
        assertNextCoordinates(new Coordinates(1, 1));
        assertNextCoordinates(new Coordinates(2, 1));
        assertNextCoordinates(new Coordinates(2, 0));
        assertNextCoordinates(new Coordinates(2, -1));
        assertNextCoordinates(new Coordinates(2, -2));
        assertNextCoordinates(new Coordinates(1, -2));
        assertNextCoordinates(new Coordinates(0, -2));
        assertNextCoordinates(new Coordinates(-1, -2));
        assertNextCoordinates(new Coordinates(-2, -2));
    }

    private void assertNextCoordinates(Coordinates nextCoordinates) {
        Assertions.assertThat(coordinates.next()).isEqualTo(nextCoordinates);
        coordinates = nextCoordinates;
    }

}
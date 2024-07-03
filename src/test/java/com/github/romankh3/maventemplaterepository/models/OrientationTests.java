package com.github.romankh3.maventemplaterepository.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrientationTests {

    @Test
    public void testOrientationToLeft() {
        Orientation ORIENTATION_NORTH = Orientation.N;
        assertEquals(Orientation.W, ORIENTATION_NORTH.turnLeft());
        Orientation ORIENTATION_WEST = Orientation.W;
        assertEquals(Orientation.S, ORIENTATION_WEST.turnLeft());
        Orientation ORIENTATION_SOUTH = Orientation.S;
        assertEquals(Orientation.E, ORIENTATION_SOUTH.turnLeft());
        Orientation ORIENTATION_EAST = Orientation.E;
        assertEquals(Orientation.N, ORIENTATION_EAST.turnLeft());
    }

    @Test
    public void testOrientationToRight() {
        Orientation ORIENTATION_NORTH = Orientation.N;
        assertEquals(Orientation.E, ORIENTATION_NORTH.turnRight());
        Orientation ORIENTATION_WEST = Orientation.W;
        assertEquals(Orientation.N, ORIENTATION_WEST.turnRight());
        Orientation ORIENTATION_SOUTH = Orientation.S;
        assertEquals(Orientation.W, ORIENTATION_SOUTH.turnRight());
        Orientation ORIENTATION_EAST = Orientation.E;
        assertEquals(Orientation.S, ORIENTATION_EAST.turnRight());
    }
}

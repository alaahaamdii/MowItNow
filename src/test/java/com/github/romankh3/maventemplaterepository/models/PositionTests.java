package com.github.romankh3.maventemplaterepository.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTests {

    @Test
    public void testPositionToLeftWithOrientationNorth() {
        Position position = new Position(0,0,Orientation.N);
        assertEquals(Orientation.W, position.getOrientation().turnLeft());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testPositionToRightWithOrientationNorth() {
        Position position = new Position(0,0,Orientation.N);
        assertEquals(Orientation.E, position.getOrientation().turnRight());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testPositionToLeftWithOrientationSouth() {
        Position position = new Position(0,0,Orientation.S);
        assertEquals(Orientation.E, position.getOrientation().turnLeft());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testPositionToRightWithOrientationSouth() {
        Position position = new Position(0,0,Orientation.S);
        assertEquals(Orientation.W, position.getOrientation().turnRight());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testPositionToLeftWithOrientationEast() {
        Position position = new Position(0,0,Orientation.E);
        assertEquals(Orientation.N, position.getOrientation().turnLeft());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testPositionToRightWithOrientationEast() {
        Position position = new Position(0,0,Orientation.E);
        assertEquals(Orientation.S, position.getOrientation().turnRight());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testPositionToLeftWithOrientationWest() {
        Position position = new Position(0,0,Orientation.W);
        assertEquals(Orientation.S, position.getOrientation().turnLeft());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testPositionToRightWithOrientationWest() {
        Position position = new Position(0,0,Orientation.W);
        assertEquals(Orientation.N, position.getOrientation().turnRight());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

}

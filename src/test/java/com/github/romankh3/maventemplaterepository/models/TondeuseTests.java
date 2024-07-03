package com.github.romankh3.maventemplaterepository.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TondeuseTests {

    @Test
    public void testMoveTondeuseForwardWithOrientationNorth() {
        Position position = new Position(0,0,Orientation.N);
        Pelouse pelouse = new Pelouse(0,2);
        Tondeuse tondeuse = new Tondeuse(position,pelouse);
        CommandType command = CommandType.valueOf("A");
        tondeuse.execute(command);
        assertEquals(Orientation.N, position.getOrientation());
        assertEquals(0, position.getX());
        assertEquals(1, position.getY());

    }
    @Test
    public void testMoveTondeuseToRightWithOrientationNorth() {
        Position position = new Position(0,0,Orientation.N);
        Pelouse pelouse = new Pelouse(1,0);
        Tondeuse tondeuse = new Tondeuse(position,pelouse);
        CommandType command = CommandType.valueOf("D");
        tondeuse.execute(command);
        assertEquals(Orientation.E, position.getOrientation());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testMoveTondeuseToLeftWithOrientationNorth() {
        Position position = new Position(0,0,Orientation.N);
        Pelouse pelouse = new Pelouse(1,0);
        Tondeuse tondeuse = new Tondeuse(position,pelouse);
        CommandType command = CommandType.valueOf("G");
        tondeuse.execute(command);
        assertEquals(Orientation.W, position.getOrientation());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }

    @Test
    public void testDontMoveTondeuseForwardWithOrientationNorth() {
        Position position = new Position(0,0,Orientation.N);
        Pelouse pelouse = new Pelouse(0,0);
        Tondeuse tondeuse = new Tondeuse(position,pelouse);
        CommandType command = CommandType.valueOf("A");
        tondeuse.execute(command);
        assertEquals(Orientation.N, position.getOrientation());
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }
}

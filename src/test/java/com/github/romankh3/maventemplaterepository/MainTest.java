package com.github.romankh3.maventemplaterepository;


import com.github.romankh3.maventemplaterepository.models.*;
import com.github.romankh3.maventemplaterepository.models.CommandType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit-level testing for {@link Main} object.
 */
public class MainTest {

    @Test
    public void testTurnLeft() {
        Tondeuse tondeuse = new Tondeuse(new Position(0, 0, Orientation.N), new Pelouse(5, 5));
        tondeuse.turnLeft();
        assertEquals(Orientation.W, tondeuse.getPosition().getOrientation());
        tondeuse.turnLeft();
        assertEquals(Orientation.S, tondeuse.getPosition().getOrientation());
        tondeuse.turnLeft();
        assertEquals(Orientation.E, tondeuse.getPosition().getOrientation());
        tondeuse.turnLeft();
        assertEquals(Orientation.N, tondeuse.getPosition().getOrientation());
    }

    @Test
    public void testTurnRight() {
        Tondeuse tondeuse = new Tondeuse(new Position(0, 0, Orientation.N), new Pelouse(5, 5));
        tondeuse.turnRight();
        assertEquals(Orientation.E, tondeuse.getPosition().getOrientation());
        tondeuse.turnRight();
        assertEquals(Orientation.S, tondeuse.getPosition().getOrientation());
        tondeuse.turnRight();
        assertEquals(Orientation.W, tondeuse.getPosition().getOrientation());
        tondeuse.turnRight();
        assertEquals(Orientation.N, tondeuse.getPosition().getOrientation());
    }

    @Test
    public void testMoveForward() {
        Tondeuse tondeuse = new Tondeuse(new Position(1, 1, Orientation.N), new Pelouse(5, 5));
        tondeuse.moveForward();
        assertEquals(1, tondeuse.getPosition().getX());
        assertEquals(2, tondeuse.getPosition().getY());
        tondeuse = new Tondeuse(new Position(1, 1, Orientation.E), new Pelouse(5, 5));
        tondeuse.moveForward();
        assertEquals(2, tondeuse.getPosition().getX());
        assertEquals(1, tondeuse.getPosition().getY());
    }

    @Test
    public void testMoveForwardBoundary() {
        Tondeuse tondeuse = new Tondeuse(new Position(1, 5, Orientation.N), new Pelouse(5, 5));
        tondeuse.moveForward();
        assertEquals(1, tondeuse.getPosition().getX());
        assertEquals(5, tondeuse.getPosition().getY());
        tondeuse = new Tondeuse(new Position(5, 1, Orientation.E), new Pelouse(5, 5));
        tondeuse.moveForward();
        assertEquals(5, tondeuse.getPosition().getX());
        assertEquals(1, tondeuse.getPosition().getY());
    }

    @Test
    public void testExecuteInstructions() {
        Pelouse pelouse = new Pelouse(5, 5);
        Tondeuse firstTondeuse = new Tondeuse(new Position(1, 2, Orientation.N), pelouse);
        String instructions1 = "GAGAGAGAA";
        for (char instruction : instructions1.toCharArray()) {
            CommandType command = CommandType.valueOf(String.valueOf(instruction));
            firstTondeuse.execute(command);
        }
        assertEquals(1, firstTondeuse.getPosition().getX());
        assertEquals(3, firstTondeuse.getPosition().getY());
        assertEquals(Orientation.N, firstTondeuse.getPosition().getOrientation());

        Tondeuse secondTondeuse = new Tondeuse(new Position(3, 3, Orientation.E), pelouse);
        String instructions2 = "AADAADADDA";
        for (char instruction : instructions2.toCharArray()) {
            CommandType command = CommandType.valueOf(String.valueOf(instruction));
            secondTondeuse.execute(command);
        }
        assertEquals(5, secondTondeuse.getPosition().getX());
        assertEquals(1, secondTondeuse.getPosition().getY());
        assertEquals(Orientation.E, secondTondeuse.getPosition().getOrientation());
    }

}

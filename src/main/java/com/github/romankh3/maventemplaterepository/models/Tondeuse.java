package com.github.romankh3.maventemplaterepository.models;

public class Tondeuse {
    private final Position position;
    private final Pelouse pelouse;

    public Tondeuse(Position position, Pelouse pelouse) {
        this.position = position;
        this.pelouse = pelouse;
    }

    public Position getPosition() { return position; }

    public void execute(Command command) {
        command.execute(this);
    }

    public void turnLeft() {
        position.setOrientation(position.getOrientation().turnLeft());
    }

    public void turnRight() {
        position.setOrientation(position.getOrientation().turnRight());
    }

    public void moveForward() {
        switch (position.getOrientation()) {
            case N -> { if (position.getY() < pelouse.getMaxY()) position.setY(position.getY() + 1); }
            case E -> { if (position.getX() < pelouse.getMaxX()) position.setX(position.getX() + 1); }
            case S -> { if (position.getY() > 0) position.setY(position.getY() - 1); }
            case W -> { if (position.getX() > 0) position.setX(position.getX() - 1); }
        }
    }
}


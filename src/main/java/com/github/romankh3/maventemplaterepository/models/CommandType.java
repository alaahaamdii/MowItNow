package com.github.romankh3.maventemplaterepository.models;

public enum CommandType implements Command {
    G {
        @Override
        public void execute(Tondeuse tondeuse) {
            tondeuse.turnLeft();
        }
    },
    D {
        @Override
        public void execute(Tondeuse tondeuse) {
            tondeuse.turnRight();
        }
    },
    A {
        @Override
        public void execute(Tondeuse tondeuse) {
            tondeuse.moveForward();
        }
    }
}

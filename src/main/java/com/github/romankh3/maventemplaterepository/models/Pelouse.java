package com.github.romankh3.maventemplaterepository.models;

public class Pelouse {
    private final int maxX;
    private final int maxY;

    public Pelouse(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMaxX() { return maxX; }
    public int getMaxY() { return maxY; }
}

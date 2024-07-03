package com.github.romankh3.maventemplaterepository;

import com.github.romankh3.maventemplaterepository.models.*;
import com.github.romankh3.maventemplaterepository.models.CommandType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String fileName = "input.txt";

        try {
            List<Tondeuse> tondeuses = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            // Lecture des limites de la pelouse
            String[] pelouseLimits = br.readLine().split(" ");
            Pelouse pelouse = new Pelouse(Integer.parseInt(pelouseLimits[0]), Integer.parseInt(pelouseLimits[1]));

            String line;
            while ((line = br.readLine()) != null) {
                //Traitement des instructions
                treatementTondeuse(line,br.readLine(), tondeuses, pelouse);
            }

            // Affichage des positions finales
            printTondeusesPosition(tondeuses);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printTondeusesPosition(List<Tondeuse> tondeuses){
        tondeuses.forEach(m -> {
            Position finalPos = m.getPosition();
            System.out.println(finalPos.getX() + " " + finalPos.getY() + " " + finalPos.getOrientation());
        });
    }

    public static void treatementTondeuse(String firstLine, String secondLine ,List<Tondeuse> tondeuses, Pelouse pelouse){
        // Lecture de la position initiale de la tondeuse
        String[] tondeusePosition = firstLine.split(" ");
        Position position = new Position(
                Integer.parseInt(tondeusePosition[0]),
                Integer.parseInt(tondeusePosition[1]),
                Orientation.valueOf(tondeusePosition[2])
        );
        Tondeuse tondeuse = new Tondeuse(position, pelouse);

        // Lecture des instructions
        for (char instruction : secondLine.toCharArray()) {
            CommandType command = CommandType.valueOf(Character.toString(instruction));
            tondeuse.execute(command);
        }

        tondeuses.add(tondeuse);
    }
}

package org.example;

import Game.Coordinates;
import Game.Game;
import Game.Labyrinth;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Create a 5x5 labyrinth
        Labyrinth labyrinth = new Labyrinth(5, 5);

        // Set start and end points
        labyrinth.setStart(new Coordinates(0, 0));
        labyrinth.setEnd(new Coordinates(4, 4));

        // Add some walls
        labyrinth.setWall(1, 1);
        labyrinth.setWall(1, 2);
        labyrinth.setWall(2, 1);
        labyrinth.setWall(2, 2);

        Game game=new Game();


        // Print the labyrinth (simple representation)
        game.gameLoop(labyrinth);

    }
}
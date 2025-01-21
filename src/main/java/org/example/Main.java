package org.example;

import Game.*;
import Game.Game;
import Game.Labyrinth;
import userMenu.HomePage;

public class Main {
    public static void main(String[] args) {
        Game game=new Game();
        game.clearConsole();
        Player player=new Player();
        HomePage homePage=new HomePage();
        homePage.displayLogo();
        homePage.displayHomePage(player);




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



        game.clearConsole();


        // Print the labyrinth (simple representation)
        game.gameLoop(labyrinth);

    }
}
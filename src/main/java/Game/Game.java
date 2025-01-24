package Game;

import userMenu.HomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    final String RESET = "\u001B[0m";
    final String GREEN_BACKGROUND = "\u001B[42m";
    final String YELLOW_BACKGROUND = "\u001B[43m";
    final String BLUE_BACKGROUND = "\u001B[44m";


    Coordinates playerPosition;

    //String playerName= "Karim";
    //int score=0;




    private void displayLabyrinth(Labyrinth labyrinth, Coordinates playerPosition, String playerColor, String startColor, String endColor, String resetColor) {
        List<List<Node>> nodes = labyrinth.nodes;
        Coordinates start = labyrinth.getStart();
        Coordinates end = labyrinth.getEnd();

        for (int y = 0; y < labyrinth.getHeight(); y++) {
            for (int x = 0; x < labyrinth.getWidth(); x++) {
                Node node = nodes.get(y).get(x);

                if (playerPosition.getX() == x && playerPosition.getY() == y) {
                    // Player's current position
                    System.out.print(playerColor + "P" + resetColor + " ");
                } else if (start.getX() == x && start.getY() == y) {
                    // Start position
                    System.out.print(startColor + node.getValue() + resetColor + " ");
                } else if (end.getX() == x && end.getY() == y) {
                    // End position
                    System.out.print(endColor + node.getValue() + resetColor + " ");
                } else {
                    // Regular node
                    System.out.print(node.getValue() + " ");
                }
            }
            System.out.println();
        }
    }

    public void clearConsole() {
        // Clear the console screen
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error clearing console: " + e.getMessage());
        }
    }


    private Coordinates getNextPosition(Scanner scanner, Coordinates currentPosition) {
        // Get player input
        System.out.print("Move using (Z/Q/S/D): ");
        String input = scanner.nextLine();

        // Calculate the new position based on input
        Coordinates newPosition = new Coordinates(currentPosition.getX(), currentPosition.getY());
        switch (input.toLowerCase()) {
            case "z": // Move up
                newPosition.setY(newPosition.getY() - 1);
                break;
            case "s": // Move down
                newPosition.setY(newPosition.getY() + 1);
                break;
            case "q": // Move left
                newPosition.setX(newPosition.getX() - 1);
                break;
            case "d": // Move right
                newPosition.setX(newPosition.getX() + 1);
                break;
            default:
                System.out.println("Invalid input. Use Z/Q/S/D to move.");
                break;
        }
        return newPosition;
    }


    private boolean isValidMove(Coordinates position, Labyrinth labyrinth) {
        int x = position.getX();
        int y = position.getY();

        // Check if within bounds
        if (x < 0 || x >= labyrinth.getWidth() || y < 0 || y >= labyrinth.getHeight()) {
            return false;
        }

        // Check if the node is not a wall
        return !labyrinth.nodes.get(y).get(x).isWall();
    }



    // Function to display player information
    private void displayPlayerInfo(String playerName, int playerScore) {
        System.out.println("===================================");
        System.out.println("Player: " + playerName + " | Score: " + playerScore);
        System.out.println("===================================");
    }


    public void gameLoop(Labyrinth labyrinth, Player player) {

        HomePage homePage=new HomePage();


        playerPosition=labyrinth.getStart();



        List<Coordinates> playerPath = new ArrayList<>();
        playerPath.add(new Coordinates(playerPosition.getX(), playerPosition.getY()));
        Scanner scanner = new Scanner(System.in);


        while(true){


            clearConsole(); // Clear the console
            homePage.displayLogo();

            displayPlayerInfo(player.getName(), player.getScore());

            displayLabyrinth(labyrinth, playerPosition, BLUE_BACKGROUND, GREEN_BACKGROUND, YELLOW_BACKGROUND, RESET);

            Coordinates newPosition = getNextPosition(scanner, playerPosition);

            if (isValidMove(newPosition, labyrinth)) {
                playerPosition.setX(newPosition.getX());
                playerPosition.setY(newPosition.getY());
                playerPath.add(new Coordinates(playerPosition.getX(), playerPosition.getY()));
                player.setScore(player.getScore()+1);

                // Check win condition
                if (playerPosition.getX() == labyrinth.getEnd().getX() &&
                        playerPosition.getY() == labyrinth.getEnd().getY()) {
                    clearConsole();
                    displayLabyrinth(labyrinth, playerPosition, BLUE_BACKGROUND, GREEN_BACKGROUND, YELLOW_BACKGROUND, RESET);
                    System.out.println("Congratulations! You've reached the end!");
                    System.out.println("Your path: " + playerPath);
                    break;
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }


        scanner.close();


    }

}

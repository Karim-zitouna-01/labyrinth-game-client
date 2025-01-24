package userMenu;

import Game.Player;

import java.util.Scanner;

public class HomePage {

    public void displayLogo(){

        //the ASCII art:
        String asciiArt = """
                
                               ▗▖    ▗▄▖ ▗▄▄▖▗▖  ▗▖▗▄▄▖ ▗▄▄▄▖▗▖  ▗▖▗▄▄▄▖▗▖ ▗▖
                               ▐▌   ▐▌ ▐▌▐▌ ▐▌▝▚▞▘ ▐▌ ▐▌  █  ▐▛▚▖▐▌  █  ▐▌ ▐▌
                               ▐▌   ▐▛▀▜▌▐▛▀▚▖ ▐▌  ▐▛▀▚▖  █  ▐▌ ▝▜▌  █  ▐▛▀▜▌
                               ▐▙▄▄▖▐▌ ▐▌▐▙▄▞▘ ▐▌  ▐▌ ▐▌▗▄█▄▖▐▌  ▐▌  █  ▐▌ ▐▌
                                                                            \s
                                                                            \s
                                                                            \s
                
        """;

        String blueColor = "\u001B[34m"; // ANSI escape code for blue
        String resetColor = "\u001B[0m"; // Reset color


        // Print the ASCII art

        System.out.println(blueColor+asciiArt+resetColor);

    }


    public void displayHomePage(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Welcome to the Labyrinth Game!");
        System.out.println("===================================");
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up");
        System.out.println("===================================");
        System.out.print("Choose an option (1 or 2): ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                signIn(scanner, player);
                break;
            case "2":
                signUp(scanner, player);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                displayHomePage(player);
        }
    }

    private void signIn(Scanner scanner, Player player) {
        System.out.print("Enter your name to sign in: ");
        String name = scanner.nextLine();

        try {
            // Retrieve player details using the service
            //...

            System.out.println("Sign-in successful! Welcome back, " + player.getName() + ".");


        } catch (Exception e) {
            System.out.println("Sign-in failed: " + e.getMessage());
            displayHomePage(player);
        }
    }

    private void signUp(Scanner scanner, Player player) {
        System.out.print("Enter your name to sign up: ");
        String name = scanner.nextLine();

        try {
            // Retrieve player details using the service
            //...

            System.out.println("Sign-in successful! Welcome back, " + player.getName() + ".");


        } catch (Exception e) {
            System.out.println("Sign-in failed: " + e.getMessage());
            displayHomePage(player);
        }
    }
}


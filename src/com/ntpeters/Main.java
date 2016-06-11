package com.ntpeters;

public class Main {

    /**
     * Entry point for the game
     * @param args Optional list of settings to configure the game:
     *             Arg  -   Type    -   Description
     *             0    -   boolean -   Sets whether duplicate values should be allowed in the secret code
     *             1    -   int     -   Sets number of guesses give to the user
     *             2    -   int     -   Sets the length of the generated secret code
     *             3    -   int     -   Sets the lower bound (inclusive) for each code value (0-9)
     *             4    -   int     -   Sets the upper bound (inclusive) for each code value (0-9)
     */
    public static void main(String[] args) {
        // Parse values from any existing arguments
        Boolean enableDuplicates = args.length >= 1 ? Boolean.parseBoolean(args[0]) : null;
        Integer numberOfGuesses = args.length >= 2 ? Integer.parseInt(args[1]) : null;
        Integer secretCodeLength = args.length >= 3 ? Integer.parseInt(args[2]) : null;
        Integer minCodeValue = null, maxCodeValue = null;
        if (args.length == 5) {
            minCodeValue = Integer.parseInt(args[3]);
            maxCodeValue = Integer.parseInt(args[4]);
        }

        // Instantiate the game with any provided settings
        Mastermind game;
        switch (args.length) {
            case 5:
                game = new Mastermind(numberOfGuesses, secretCodeLength, minCodeValue, maxCodeValue, enableDuplicates);
                break;
            case 3:
                game = new Mastermind(numberOfGuesses, secretCodeLength, enableDuplicates);
                break;
            case 2:
                game = new Mastermind(numberOfGuesses, enableDuplicates);
                break;
            case 1:
                game = new Mastermind(enableDuplicates);
                break;
            case 0:
                game = new Mastermind();
                break;
            default:
                System.out.println("Invalid number of arguments provided!");
                return;
        }

        // Let's play!
        game.play();
    }
}

package ca.bcit.comp1510.lab08;

import java.util.Scanner;
import java.util.Random;
/**
 * The Games class.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class Games {

    private int score;

    private Scanner scanner;

    private Random random;

    public Games() {
        score = 0;
        scanner = new Scanner(System.in);
        random = new Random();
    }


    public void play() {
        boolean gameState = true;

        while (gameState) {
            System.out.println("Welcome to the Games program!");
            System.out.println("Make your choice (enter a number):");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            System.out.print("> ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your score is " + score);
                    break;
                case 2:
                    guessANumber();
                    break;
                case 3:
                    break;
                case 4:
                    gameState = false;
                    break;
                default:
                    System.out.println("Make another choice.");
                    break;
            }
        }
    }

    public void guessANumber() {
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int guessCount = 0;

        System.out.println("I've picked a random number between 0 and 100");
        System.out.println("Can you guess it?");

        while (guess != number) {
            System.out.println("Guess the number!");
            guess = scanner.nextInt();
            guessCount++;

            if (guess > number) {
                System.out.println("Too high, guess again!");
            }

            if (guess < number) {
                System.out.println("Too low, guess again!");
            }

            if (guess == number) {
                System.out.println("RIGHT!");
            }
        }

        if (guessCount <= 5) {
            System.out.println("Five points!");
            score += 5;
        }
    }

    public void rockPaperScissors() {
        int number = random.nextInt(3);
        String randomChoice;
        String userChoice
        boolean choiceInput = true;

        switch (number) {
            case 0:
                randomChoice = "Rock";
                break;
            case 1:
                randomChoice = "Paper";
                break;
            case 2:
                randomChoice = "Scissors";
                break;
        }

        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS");
        System.out.println("Which one do you choose?");
        System.out.print("> ");
        while (choiceInput) {
            userChoice = scanner.nextLine();
            String userInput = userChoice.trim().toUpperCase();

            if (userInput)
        }
    }
}


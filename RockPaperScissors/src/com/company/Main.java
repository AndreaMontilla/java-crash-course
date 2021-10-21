package com.company;


import java.util.Random;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Main {

    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;

        do {

            int computerValue = randomGenerator.nextInt(3);
            String computerChoice = " ";

            if (computerValue == ROCK) {
                computerChoice = "rock";
            } else if (computerValue == PAPER) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            System.out.println("Please enter rock, paper or scissors ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("rock")) {
                playerValue = ROCK;
            } else if (playerChoice.equals("paper")) {
                playerValue = PAPER;
            } else if (playerChoice.equals("scissors")) {
                playerValue = SCISSORS;
            } else {
                System.out.printf("%s is not a valid choice. %n", playerChoice);
            }

            System.out.printf("Computer choice is %s, player choice is %s.%n", computerChoice, playerChoice);

            if (playerValue == computerValue) {
                System.out.println("It´s a draw!");
            } else if ((playerValue - 1 == computerValue)
                    || (playerValue == ROCK && computerValue == SCISSORS)) {
                System.out.println("PLayer wins!");
            } else {
                System.out.println("The computer wins!");
            }
        } while (getYesOrNo("Would you like to play again?"));

        scanner.close();
    }

    public static boolean getYesOrNo(String question) {
        String answer;

        while (true) {  // infinite loop.  return will exit the method, thus terminating the loop
            System.out.printf("%s%n", question);
            answer = scanner.nextLine();
            answer = answer.toLowerCase();

            if (answer.equals("y")) {
                return true;
            }

            if (answer.equals("n")) {
                return false;
            }
        }
    }

}

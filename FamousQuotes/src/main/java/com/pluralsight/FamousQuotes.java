package com.pluralsight;

import java.util.Scanner;
import java.util.Random;

public class FamousQuotes {
    public static void main(String[] args) {


        String[] quotes = {
                "The only limit to our realization of tomorrow is our doubts of today.",
                "Life is 10% what happens to us and 90% how we react to it.",
                "Do not watch the clock; do what it does. Keep going.",
                "Success is not final, failure is not fatal.",
                "Your time is limited, so don't waste it living someone else's life.",
                "Never give up in what you believe in.",
                "If you really look closely, most overnight successes took a long time.",
                "The secret of success is to do the common things uncommonly well.",
                "Don't be afraid to give up the good to go for the great.",
                "I find that the harder I work, the more luck I seem to have."
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueProgram = true;


        while (continueProgram) {
            try {

                System.out.println("Enter a number between 1 and 10 to see a quote, or 0 for a random quote:");
                int choice = scanner.nextInt();


                if (choice >= 1 && choice <= 10) {
                    System.out.println("Quote #" + choice + ": " + quotes[choice - 1]);
                }

                else if (choice == 0) {
                    int randomIndex = random.nextInt(10);
                    System.out.println("Random Quote: " + quotes[randomIndex]);
                }

                else {
                    System.out.println("Error: Please enter a valid number between 1 and 10.");
                }


                System.out.println("Do you want to see another quote? (yes/no): ");
                String response = scanner.next();


                if (!response.equalsIgnoreCase("yes")) {
                    continueProgram = false;
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();  // Clear scanner buffer
            }
        }


    }
}
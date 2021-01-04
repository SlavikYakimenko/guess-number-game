package com.company;

// Java program for the above approach

import java.util.Scanner;

public class NumGame {

    // Function that implements the
    // number guessing game
    public static void guessNumber() {
        // Scanner Class
        Scanner scanner = new Scanner(System.in);
        // Generate the numbers
        int number = 1 + (int) (100 * Math.random());
        // Given K trials
        int numberOfTrials = 5;
        int i, guess;

        System.out.println("Диапазон чисел" + " от 1 до 100." + "Угадай число с 5ти попыток.");

        // Interate over K Trials
        for (i = 0; i < numberOfTrials; i++) {
            System.out.println("Ваше число: ");
            // Take input for guessing
            guess = scanner.nextInt();
            // If the number is guessed
            if (number == guess) {
                System.out.println("Конгратюлейшен!");
                break;
            } else if (number > guess && i != numberOfTrials - 1) {
                System.out.println("Число больше чем " + guess);
            } else if (number < guess && i != numberOfTrials - 1) {
                System.out.println("Числол меньше чем" + guess);
            }
        }

        if (i == numberOfTrials) {
            System.out.println("Не в этот раз :c" + " У тебя закончились жизни");
            System.out.println("А число было " + number);
        }
    }
}


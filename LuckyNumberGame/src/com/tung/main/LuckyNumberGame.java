package com.tung.main;

import java.util.Random;
import java.util.Scanner;

public class LuckyNumberGame {
    private static final int LEVEL = 10;
    private static final int NUMBER_OF_GUESS = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        boolean flag = false;
        int result = random.nextInt(LEVEL) + 1;
        do {
            count++;
            System.out.print("Enter a number to guess: ");
            int number = scanner.nextInt();
            if (number == result) {
                System.out.println("Congratulation ! You won !");
                flag = true;
                break;
            } else {
                if (number > result)
                    System.out.println("Lower!");
                else System.out.println("Higher!");
            }
        } while (count != NUMBER_OF_GUESS);
        if (flag == false) {
            System.out.println("You lost !");
        }
    }
}

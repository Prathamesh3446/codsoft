package Codsoft_Intern;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int lowLim = 1;
        int uuLim = 100;

        int maxAttempts = 10;
        int totalRounds = 0;
        int totalAttempts = 0;

        boolean playAgain  = true;

        while (playAgain) {
            int secretNumber = rn.nextInt(uuLim - lowLim) + lowLim;
            int attempts = 0;
            boolean roundWon = false;

            System.out.println("the number is between :" + lowLim + "to" + uuLim + " ");
            while (attempts < maxAttempts) {
                System.out.println("enter your guess");
                int userGuess = sc.nextInt();
                attempts++;
                if (userGuess < secretNumber) {
                    System.out.println("Number is small...");
                } else if (userGuess > secretNumber) {
                    System.out.println("Number is big...");
                } else {
                    System.out.println("congratulations you guessed number is" + attempts + "attempts");
                    roundWon = true;
                    totalAttempts += attempts;
                    totalRounds++;
                    break;
                }
            }
            if (!roundWon) {
                System.out.println("sorry you have used up all all " + maxAttempts + "attempts the secret number is " + secretNumber + " ");

            }
            System.out.println("do you want to play again(yes / no)");
            String playAgaininput = sc.next().toLowerCase();
            if (!playAgaininput.equals("yes")) {
                playAgain = false;
            }
        }
            System.out.println("game over "+totalRounds +"rounds and averaged"+((double)totalAttempts / totalRounds)+"attempts per round");
            sc.close();


    }
}

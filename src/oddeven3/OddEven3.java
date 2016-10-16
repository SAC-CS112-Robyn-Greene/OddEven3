/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven3;

/**
 *
 * @author Robyn
 */
import java.util.Scanner;
import java.util.Random;

public class OddEven3 {


    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        /* roll a dice to get a number bettween 1-6
        ask users to guess odd or even
        You win/lose,You’ve played xx number of times
        The system generate yy number of Odds and zz number of Even
        Your winning percentage is nn%
         */
        int[] dice1 = new int[7];
        int[] frequency = new int[7];
        int guess;
        int roll = 0;        
        String reply = ("y");
        //do for statement
        for (roll = 1; roll <dice1.length; roll++) {
            System.out.println("Guess a odd or even number  ");
            frequency[1 + rand.nextInt(6)]++;
            guess = input.nextInt();           
            System.out.println("You guessed a " + guess + " We had  " + roll);
           if (guess == roll) {
                System.out.println("You won!!!");
                System.out.println("Do you want to play again y/n?");
            } else if (guess != roll) {
                System.out.println("Do you want to play again y/n?");
            }
            reply = input.next();
            if (reply.equalsIgnoreCase("y")) {
            } else {
                System.out.println("Goodbye!");
                break;
            } //else4
        }//for
        for (roll = 1; roll < frequency.length; roll++) {
            System.out.printf("%s%10s%n", "Dice ", "Frequency");
          System.out.printf("%d%10d%n",roll, frequency[roll]);
            }        
        
    }//main
}//class

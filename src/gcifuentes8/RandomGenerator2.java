/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcifuentes8;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class RandomGenerator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: Create a Scanner object to read keyboard input.
         Scanner scanner = new Scanner(System.in);
       
         //TODO: Ask the user a lower and upper bound.
         System.out.print("Enter a lower bound: ");
         int lowerBound = scanner.nextInt();
         
         System.out.print("Enter an upper bound: ");
         int upperBound = scanner.nextInt();

         //TODO: Ask the user for the number of random integers to generate.
         System.out.print("Enter the # of random integers to generate: ");
         int numberOfInt = scanner.nextInt();
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

/**
 *
 * @author GG
 */

import java.util.Scanner;

public class Exercise6_Fausto {

public static void main(String[] args) {
        // Initialize Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array with 2 rows and 3 columns
        // This covers indices from [0][0] to [1][2]
        String[][] Fruits = new String[2][3];

        System.out.println("--- Fruit Section Input ---");
        System.out.println("Please enter 6 fruits:");

        // 1. INPUT: Using standard nested FOR loops
        // We use standard loops here because we need the 'i' and 'j' indexes to assign values.
        for (int i = 0; i < Fruits.length; i++) {            // Iterates through rows (0 to 1)
            for (int j = 0; j < Fruits[i].length; j++) {     // Iterates through columns (0 to 2)
                System.out.print("Enter fruit for position [" + i + "][" + j + "]: ");
                Fruits[i][j] = scanner.nextLine();
            }
        }

        System.out.println("\n--- Fruit Section Output ---");
        System.out.println("Here is the data you entered:");

        // 2. OUTPUT: Using nested FOR-EACH loops
        // We use for-each loops here to iterate through the data we just put in.
        for (String[] row : Fruits) {           // Loops through each row (which is an array itself)
            for (String text : row) {              // Loops through each String in that row
                System.out.print(text + "\t");     // Prints the text with a tab space
            }
            System.out.println();                  // Moves to the next line after printing a row
        }

        scanner.close();
    }
    
}

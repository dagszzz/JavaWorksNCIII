/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

/**
 *
 * @author GG
 */
public class Exercise8_Fausto {
    public static void main(String[] args) {
        
        int[] luckyNumbers = new int[6];
        int count = 0;

        while (count < 6) {
            int pointer = (int) (Math.random() * 58) + 1;

            // Check for duplicates
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (luckyNumbers[i] == pointer) {
                    isDuplicate = true;
                    break;
                }
            }
            // If it is not a duplicate, add it to the list
            if (!isDuplicate) {
                luckyNumbers[count] = pointer;
                count++;
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Here are your lucky numbers\n");
        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.println(luckyNumbers[i]);
        }
        System.out.println("\n--------------------------");
    }
}

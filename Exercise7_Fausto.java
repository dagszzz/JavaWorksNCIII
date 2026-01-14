/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

/**
 *
 * @author GG
 */
public class Exercise7_Fausto {
    public static void main(String[] args) {
        String Philippines = "Philippines";
        
        // Display First and Last Character ---
        char firstChar = Philippines.charAt(0);
        char lastChar = Philippines.charAt(Philippines.length() - 1);
        
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: "  + lastChar);
        
        // Count 'P/p' and Vowels ---
        int pCount = 0;
        int vowelCount = 0;
        
        for (int i = 0; i < Philippines.length(); i++) {
            char c = Philippines.charAt(i);
            
            // Check for 'P' or 'p'
            if (c == 'P' || c == 'p') {
                pCount++;
            }
            
            // Check for vowels (convert char to lowercase for easier checking per sources)
            char lowerC = Character.toLowerCase(c);
            if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Count of 'P' or 'p': " + pCount);
        System.out.println("Total Number of Vowels: " + vowelCount);
    }
}

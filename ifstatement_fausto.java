/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author GG
 */
import java.util.Scanner;
public class ifstatement_fausto {
    public static void main(String[] args) {
        Scanner scan_age = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        int age;      
        age = scan_age.nextInt();
        
       if (age <= 2) {
            System.out.println("Age: " + age + " Category: Baby");
        }

        if (age >= 3 && age <= 12) {
            System.out.println("Age: " + age + " Category: Child");
        }

        if (age >= 13 && age <= 19) {
            System.out.println("Age: " + age + " Category: Teenager");
        }

        if (age >= 20 && age <= 29) {
            System.out.println("Age: " + age + " Category: Young Adult");
        }

        if (age >= 30 && age <= 59) {
            System.out.println("Age: " + age + " Category: Adult");
        }

        if (age >= 60 && age <= 100) {
            System.out.println("Age: " + age + " Category: Senior");
        }
        
        if (age >= 101){
            System.out.println("Age: " + age + " Category: Super Senior");
        }
    }
}

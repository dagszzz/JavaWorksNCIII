/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author GG
 */
import java.util.Scanner;

public class switch_nestedif_fausto {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Security Validation
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String accessCode = input.nextLine();

        if (accessCode.equals("*143#")) {
            System.out.println("* Load Registration *");
            System.out.println("[1] Go+");
            System.out.println("[2] Go");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] UNLI 5G");
            System.out.println("[5] ALLNET");
            
            System.out.print("\nEnter choice: ");
            int choice = input.nextInt();

            switch (choice) {
            
            case 1: // First Level: Go+
        System.out.println("");
        System.out.println("*** Go+ Promos ***");
        System.out.println("[1] Go+99");
        System.out.println("[2] Go+129");
        System.out.println("[3] Go+149");
        System.out.print("Enter choice: ");
        int subChoice1 = input.nextInt();

        switch (subChoice1) {
            case 1: // Second Level: Inside Go+99
                System.out.println("");
                System.out.println("*** Go+99 Promo ***");
                System.out.println("-> Get 8 GB for all sites + 8GB");
                System.out.println("[1] Subscribe");
                System.out.println("[2] Back");
                System.out.println("[3] Exit");
                System.out.print("Enter choice: ");
                int subChoice2 = input.nextInt();

                if (subChoice2 == 1) {
                    System.out.println("You are now subscribed to Go+99");
                    System.out.println("");
                } else {
                    break;
                }
                    break;
            case 2:
                System.out.println("You have selected Go+129.");
                break;
            case 3:
                System.out.println("You have selected Go+149.");
                break;
            default:
                System.out.println("Invalid Go+ selection.");
                break;
        }
        break; 

                case 2:
                    System.out.println("Go");
                    break;
                case 3:
                    System.out.println("GoEXTRA");
                    break;
                case 4:
                    System.out.println("UNLI 5G");
                    break;
                case 5:
                    System.out.println("ALLNET");
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;
            }
        } else {
            System.out.println("Access Denied: Incorrect code.");
        }
    }
    
}


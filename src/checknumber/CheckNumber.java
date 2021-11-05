/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checknumber;

import java.util.Scanner;



/**
 *
 * @author AhmedTawfik
 */
public class CheckNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please, enter your number: ");

        int number = input.nextInt();

        if (number >= 0) {
            System.out.println("The number is Positive");
        } else {
            System.out.println("The number is Negative");
        }

    }

}

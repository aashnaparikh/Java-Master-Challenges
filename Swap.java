//Creating a program to ask the user to input two numbers and then swapping them

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Asking for the first number
        System.out.print("Enter your first number: ");
        int a = input.nextInt();

        //Asking for the second number
        System.out.print("Enter your second number: ");
        int b = input.nextInt();

        //Swaping the numbers
        int c = a;
        a = b;
        b = c;

        System.out.print("These are your swapped numbers: ");
        System.out.print("\nFirst number: "+ a + "\nSecond Number: " + b);
    }
}

//Contains if else & relational/logical operators

import java.util.Scanner;
public class ifelseC {
    public static void main(String[] args) {
       //Question One
        System.out.println("This program will determine whether a number is positive, negative or zero");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else  {
            System.out.println("The number is zero");
        }
    
        //Question two:
        System.out.println("This program will determine if a number is odd or even"); 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = input.nextInt();

        if (num1%2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        
        //Question Three
        System.out.println("This program will determine what is the greatest number");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Enter the third number: ");
        int c = input.nextInt();

        if (a>=b && a>=c) {
            System.out.println("The greatest number is: " + a);
        } else if (b>=a && b>=c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }

        //Question Four
        System.out.println("This program will determine if a Year is a leap year");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        if (year%4 == 0 && year%100 != 0 || year%400 ==0) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Not a leap year");
        }

        //Question Five
        System.out.println("This program will determine your grade");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        int grade = input.nextInt();

        if (grade > 90 ) {
            System.out.println("Your grade is an A");
        } else if (grade > 75) {
            System.out.println("Your grade is an B");
        } else if (grade > 60) {
            System.out.println("Your grade is an C");
        } else if (grade > 30) {
            System.out.println("Your grade is an D");
        } else  {
            System.out.println("Your grade is an F");
        } 
    }
}

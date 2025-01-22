import java.util.Scanner;

public class ChatUserInput {
    public static void main(String[] args) {
       
        //User input for favourite color
        System.out.print("Enter Your Favourite color: " );
        Scanner input = new Scanner(System.in);
        String color = input.nextLine();
        System.out.print("Your favourite color is " + color ); 

        //user input for sum of three numbers
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.print("Enter another number: ");
        int secondNum = input.nextInt();
        System.out.print("Enter last number: ");
        int thirdNum = input.nextInt();
        int sum = firstNum + secondNum + thirdNum ;
        System.out.print("Sum of numbers: " + sum);

        //user input for square of numbers
        System.out.print("enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int square = num * num ;
        System.out.print("The square of the number is " + square);
    }
}

import java.util.Scanner;

public class OddNumberLoop {
    public static void main(String[] args){
        System.out.println("Welcome to the sum of odd numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number till where you want to print odd numbers till: ");
        int num = input.nextInt();
        int sum = printOdd(num);
        System.out.println("odd sum till "+ num + " is " + sum);
    }

    public static int printOdd(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}

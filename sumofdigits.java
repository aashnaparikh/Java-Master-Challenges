import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args){
        System.out.println("Welcome to the Sum Of Digits Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want the sum of digits of: ");
        int num = input.nextInt();
        int sum = printSum(num);
        System.out.println("Sum is " + sum);
    }

    public static int printSum(int num) {
       System.out.println();
    }
}




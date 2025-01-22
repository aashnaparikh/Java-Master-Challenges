import java.util.Scanner;

public class UserInputSumC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int firstNum = input.nextInt();
        System.out.print("\n Enter a second number: ");
        int secondNum = input.nextInt();
        int Sum = firstNum + secondNum;
        System.out.print(" The sum of the numbers are: " + Sum);

    }
    
}

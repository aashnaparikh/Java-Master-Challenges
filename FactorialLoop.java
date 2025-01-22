import java.util.Scanner;
public class FactorialLoop {
    public static void main(String[] args){
        System.out.println("Welcome to the Factorial Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want a factorial of: ");
        int num = input.nextInt();
        int fac = printFac(num);
        System.out.println("Factorial is " + fac);
    }

    public static int printFac(int num) {
       if (num<2){
        return 1;
       }
       int fac = 1;
       int i= 2;
       while (i<=num){
        fac *= i;
        i++;
       }
       return fac;
    }
}


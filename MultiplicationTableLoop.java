import java.util.Scanner;
class MultiplicationTableLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to the multiplication table");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        printTable(num);

   
    public static void printTable(int num) {
        int i = 1;
        while(i <= 10) {
            System.out.println(num + "X" + i + "=" + (num*i));
            i++;
        }
    }
}
}
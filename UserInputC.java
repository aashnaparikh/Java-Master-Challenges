import java.util.scanner;

public class UserInputC {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
       System.out.println("Welcome " + name + " to Coding");

    }
}

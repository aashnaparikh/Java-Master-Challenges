public class ArithmeticOperatorsC {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Ques 1: Program that takes two numbers and shows result of all arithmetic operators
        System.out.println("We are going to print out all the assignment operators.");
        System.out.print("Enter Your First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int b = input.nextInt();

        System.out.println("Addition of numbers: " + a+b);
        System.out.println("Subtraction of numbers: " + a-b);
        System.out.println("Multiplication of numbers: " + a*b);
        System.out.println("Division of numbers: " + a/b);
        System.out.println("Remainder of numbers: " + a%b);
        
        //Ques 2: Create a program to calculate the product of two floating point numbers
        System.out.print("Enter a Number: ");
        float c = input.nextFloat();
        System.out.print("Enter another Number: ");
        float d = input.nextFloat();
        // you can also use double inplace of float
        System.err.println("The Product of these two numbers: " + c*d);


        //Ques 3: Create a program to calculate the perimeter of a rectangle
        System.out.println("We are going to calculate the perimeter of a rectangle");
        System.out.print("Enter the length of the rectangle: ");
        double e = input.nextDouble();
        System.out.print("\nEnter the width of the rectangle: ");
        double f = input.nextDouble();

        double perimeter = e*f;
        System.out.println("The perimeter is: " + perimeter); 


        //Ques 4: Create a program to calculate the area of the triangle
        System.out.println("We are going to calculate the area of a triangle");
        System.out.print("\nEnter the height of the triangle: ");
        double g = input.nextDouble();
        System.out.print("\nEnter the base width of the triangle: ");
        double h = input.nextDouble();

        double area = 0.5*g*h;
        System.out.println("\nThe area is: " + area);

        //Ques 5: Create a program to calculate the Simple and Compound Interest
        System.out.println("We are going to calculate the Simple and Compound Interest");
        System.out.print("\nEnter the Principal Amount: ");
        double p = input.nextDouble();
        System.out.print("\nEnter the Rate Of Interest: ");
        double r = input.nextDouble();
        System.out.print("\nEnter the Time Period: ");
        double t = input.nextDouble();
        
        double simple = p*r*t;
        double compound = p * Math.pow((1 + (r/100)), t); //this is the function for exponent
       
        System.out.println("\nThe Simple interest is: " + simple);
        System.out.println("\nThe Compound interest is: " + compound);


    }
}

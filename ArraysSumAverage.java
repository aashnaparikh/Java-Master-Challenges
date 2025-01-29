import java.util.Scanner;
public class ArraysSumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum and average of the array");
        
        //calling a utility function
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        long average = average(numArray);
        System.out.println("Sum of the array is : " + sum);
        System.out.println("Average of the array is : " + average);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i< numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static long average(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}

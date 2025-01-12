//importing the scanner class to allow user input
import java.util.Scanner;

public class DividingTwoNumbers {
    public static void main(String[] args) {
        //creating a new scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        //asking the user to enter the first single digit number
        System.out.println("Please enter the first single digit number: ");
        //reading the first input and storing it in a variable
        int a = scanner.nextInt();
        //asking the user to enter the second single digit number
        System.out.println("Please enter the second single digit number: ");
        //reading the second input and storing it in a variable
        int b = scanner.nextInt();


        //try block contains code that might throw an exception
        try {
            //performing integer division to trigger ArithmeticException
            int result =  a / b;
            //printing the result of division as a double value with 2 decimal places
            System.out.printf("%d / %d = %.2f%n", a, b, (double) a/b);
        }
        //catch block catches exception and allows it to be handled without crashing program
        catch (ArithmeticException e) {
            //this block will be executed if the division is by zero telling user the 0 division is not allowed
            System.out.println("Error: We Cannot divide by zero. Please do not put a zero as your second integer. Or else!");
        }

    }
}

// CP - Create a program to swap two numbers
// Hint =>
// 1. Create a variable number1 and take user input.
// 2. Create a variable number2 and take user input.
// 3. Swap number1 and number2 and print the swapped output
// I/P => number1, number2
// O/P => The swapped numbers are ___ and ___


import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}

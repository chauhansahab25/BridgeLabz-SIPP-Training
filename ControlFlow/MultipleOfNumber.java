package ControlFlow;
import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = number - 1;
            while (counter > 1) {
                if (100 % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}

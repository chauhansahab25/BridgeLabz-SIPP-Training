package ControlFlow;
import java.util.Scanner;

public class MethodOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        if (n > 0) {
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formula);
        } else {
            System.out.println("Enter a natural number.");
        }
    }
}

// CP - Create a program to convert weight from pounds to kilograms.
// Hint => 1 pound = 2.2 kg
// I/P => weight
// O/P => The weight of the person in pounds is ___ and in kg is ___


import java.util.*;
public class WeightToPound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        double weightInKg = weight / 2.2;
        System.out.println("The weight of the person in pounds is " + weight + " and in kg is " + weightInKg);
    }
}

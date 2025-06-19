//CP - Write a program that takes the base and height in cm to find the area of a triangle in square inches
//and square centimeters
//O/P => The Area of the triangle in sq in is ___ and sq cm is ___
//Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
//I/P => base, height


import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();
        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}

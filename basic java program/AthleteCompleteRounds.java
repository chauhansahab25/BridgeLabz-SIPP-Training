// CP - An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete
// wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => The perimeter of a triangle is the addition of all sides and the number of rounds is the
// distance/perimeter
// I/P => side1, side2, side3
// O/P => The total number of rounds the athlete will run is ___ to complete 5 km


import java.util.*;
public class AthleteCompleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        double rounds = totalDistance / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}

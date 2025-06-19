package Arrays;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                int mark = sc.nextInt();
                while (mark < 0) {
                    mark = sc.nextInt();
                }
                marks[i][j] = mark;
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grades[i] = 'A';
            else if (percentage[i] >= 80) grades[i] = 'B';
            else if (percentage[i] >= 70) grades[i] = 'C';
            else if (percentage[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}

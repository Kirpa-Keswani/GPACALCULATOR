import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses taken: ");
        int numCourses = scanner.nextInt();

        double[] grades = new double[numCourses];
        double[] creditHours = new double[numCourses];

        // Input grades and credit hours for each course
        for (int i = 0; i < numCourses; i++) {
            System.out.printf("Enter grade for course %d (e.g., 4.0, 3.5, 2.0): ", i + 1);
            grades[i] = scanner.nextDouble();

            System.out.printf("Enter credit hours for course %d: ", i + 1);
            creditHours[i] = scanner.nextDouble();
        }

        double totalGradePoints = 0;
        double totalCredits = 0;

        System.out.println("\nCourse Grades and Credits:");
        for (int i = 0; i < numCourses; i++) {
            System.out.printf("Course %d: Grade = %.2f, Credit Hours = %.2f\n", i+1, grades[i], creditHours[i]);

            totalGradePoints += grades[i] * creditHours[i];
            totalCredits += creditHours[i];
        }

        if (totalCredits == 0) {
            System.out.println("Total credit hours cannot be zero.");
        } else {
            double cgpa = totalGradePoints / totalCredits;
            System.out.printf("\nTotal Credit Hours: %.2f\n", totalCredits);
            System.out.printf("Total Grade Points: %.2f\n", totalGradePoints);
            System.out.printf("Calculated CGPA: %.2f\n", cgpa);
        }

        scanner.close();
    }
}

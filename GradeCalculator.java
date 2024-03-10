import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int s = 1; s <= numStudents; s++) {
            System.out.println("\nStudent " + s + ":");

            // Input student information
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter division: ");
            String division = scanner.nextLine();

            // Input marks for each subject
            System.out.println("Enter marks for each subject (out of 100):");
            int totalMarks = 0;
            int numSubjects;
            System.out.print("Enter the number of subjects: ");
            numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }

            // Calculate average percentage
            double averagePercentage = (double) totalMarks / numSubjects;

            // Grade calculation
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display results
            System.out.println("\nResults for " + name + " (Roll No: " + rollNo + ", Division: " + division + "):");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            System.out.println("Grade: " + grade);

            // Consume newline
            if (s < numStudents) {
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradeSum = 0;
        double gradeAvg = 0;
        int Passed = 0;
        int Failed = 0;
        String output = "";
        int highestGrade = 0;
        int lowestGrade = 100;
        System.out.print("Enter the number of students: ");
        int numOfStudents = sc.nextInt();
        for(int i = 0; i < numOfStudents;i++) {
            System.out.printf("Enter grade for Student %d: ", i+1);
            int grade = sc.nextInt();
            gradeSum = gradeSum + grade;
            if (grade >= 90) {
                output += "\nStudent " + (i+1) +  ": A - Passed";
                Passed++;
            } else if (grade >= 80) {
                output += "\nStudent " + (i+1) +  ": B - Passed";
                Passed++;
            } else if (grade >= 70) {
                output += "\nStudent " + (i+1) +  ": C - Passed";
                Passed++;
            } else if (grade >= 60) {
                output += "\nStudent " + (i+1) +  ": D - Passed";
                Passed++;
            } else {
                output += "\nStudent " + (i+1) +  ": F - Failed";
                Failed++;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
            if (grade > highestGrade) {
                highestGrade = grade;
            } 
        }
        sc.close();
        gradeAvg = gradeSum / numOfStudents;
        System.out.print(output);
        System.out.printf("\n\nAverage Grade: %.2f",gradeAvg);
        System.out.print("\nHighest Grade: " + highestGrade);
        System.out.print("\nLowest Grade: " + lowestGrade);
        System.out.print("\nTotal Passed: " + Passed);
        System.out.print("\nTotal Failed: " + Failed);
    }
}
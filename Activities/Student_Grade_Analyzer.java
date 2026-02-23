import java.util.Scanner;
public class Student_Grade_Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gr = 0;
        String output = "";
        String stats = "";
        double gradeSum = 0;
        double gradeAvg = 0;
        System.out.print("Enter the number of students: ");
        int numOfStudents = sc.nextInt();
        for(int i = 0; i < numOfStudents;i++) {
            System.out.printf("Enter grade for student %d: ", i+1);
            gr = sc.nextInt();
            if(gr >= 90 && gr <= 100){
                char letter = 'A';
                String remarks = "Excellent";
                gradeSum += gr;
                output += "\n" + "student " + (i+1) + ": " + letter + " " + remarks;
            }else if(gr >= 80 && gr <= 89) {
                char letter = 'B';
                String remarks = "Very Good";
                gradeSum += gr;
                output += "\n" + "Student " + (i+1) + ": " + letter + " " + remarks;
            }
        }
        gradeAvg = gradeSum / numOfStudents;
        stats += "\nAverage Grade: " + gradeAvg;
        sc.close();
        System.out.print(output);
        System.out.print(stats);
    }
}
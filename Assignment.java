import java.util.Scanner;
public class Assignment {
   public Assignment() {
   }
   public static void main(String[] args) {
      Scanner Limerence = new Scanner(System.in);
      System.out.print("Enter a number(feet): ");
      double feet = Limerence.nextDouble();
      double in = feet * 12.0;
      double cm = in * 2.54;
      System.out.printf("%.2f Feet = %.2f Inches\n%.2f Inches = %.2f cm", feet, in, in, cm);
      Limerence.close();
}
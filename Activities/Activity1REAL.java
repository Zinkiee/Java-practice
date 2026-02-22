import java.util.Scanner;

public class Activity1REAL
{
    public static void main(String[] args)
    {
        Scanner Limerence = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1 = Limerence.nextInt();
        System.out.print("Input the second number: ");
        int n2 = Limerence.nextInt();
        System.out.print("Input the third number: ");
        int n3 = Limerence.nextInt();
        
        Limerence.close();
        System.out.printf("The average value is %.1f",AverageCalc(n1,n2,n3));
    }
    public static double AverageCalc(int n1,int n2,int n3)
    {
        return (n1 + n2 + n3) / 3;
    }
}
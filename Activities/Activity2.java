import java.util.Scanner;

public class Activity2
{
    public static void main(String[] args)
    {
        Scanner avenoir = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1 = avenoir.nextInt();
        System.out.print("Input the second number: ");
        int n2 = avenoir.nextInt();
        System.out.print("Input the third number: ");
        int n3 = avenoir.nextInt();
        avenoir.close();
        System.out.printf("The smallest value is %d.",smallestnum(n1,n2,n3));
    }
    public static int smallestnum(int n1,int n2,int n3)
    {
        int small;
        if (n1 < n2 && n1 < n3)
        {
            small = n1;
        } else if (n2 < n1 && n2 < n3)
        {
            small = n2;
        } else 
        {
            small = n3;
        }
        return small;
    }
}
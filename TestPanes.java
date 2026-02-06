import java.util.*;
import javax.swing.*;
//mport java.awt.*;
public class TestPanes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n1 = sc.nextInt();
        System.out.print(n1);
        sc.close();
        JOptionPane.showMessageDialog(null,"Hello","The Deep Part" ,JOptionPane.QUESTION_MESSAGE);
    }
}
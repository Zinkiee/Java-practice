import java.util.*;
import javax.swing.JOptionPane;
//Recent activity
public class LibraryFeeSystem
{
    public static void main (String[] args)
    {
        Scanner Ame = new Scanner(System.in);
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose Option:\n1. Regular\n2. Student\n3. Faculty","Book Borrowing System",JOptionPane.QUESTION_MESSAGE));
        switch(c)
        {
            case 1:
                int days =  Integer.parseInt(JOptionPane.showInputDialog(null,"Enter days late","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null,"Total Fine" + computefine(days),"Book Borrower",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                int days2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter days late:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                int fine = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fine:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null,"Total Fine: " + computefine(days2,fine),"Book Borrower",JOptionPane.INFORMATION_MESSAGE);
            case 3:
                int days3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter days late:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                int fine2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fine:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                int dis = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter discount:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null,"Total Fine: " + computefine(days3,fine2,dis),"Book Borrower",JOptionPane.INFORMATION_MESSAGE);
        }
        Ame.close();
    }

    static String computefine(int n1)
    {
        double sum = n1 * 10;
        return String.format("%.2f",sum);
    }
    static String computefine(int n1,int n2)
    {
        double sum = n1 * n2;
        return String.format("%.2f",sum);
    }
    static String computefine(int n1,int n2,int n3)
    {
        double disc = (n1 * n2) * ((double)n3/100);
        double sum = (n1 * n2) - disc;
        return String.format("%.2f",sum);
    }
}
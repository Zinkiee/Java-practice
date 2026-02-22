import java.util.*;

import javax.swing.JOptionPane;
//Compounded Discounts for library fees
//Additive Discounts in the future...?
public class LibraryFeeSystem2
{
    public static void main(String[]args)
    {
        Scanner Ame2 = new Scanner(System.in);
        int c,d1,f1,d2,f2,ds,c2;
        double spds = 20; //Testing static discounts for now... 
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter choice:\n1. Regular\n2. Faculty","Book Borrower 2.0",JOptionPane.QUESTION_MESSAGE));
        switch (c) {
            case 1:
                d1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter days late:","Book Borrower 2.0",JOptionPane.QUESTION_MESSAGE));
                f1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fine:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                c2 = JOptionPane.showConfirmDialog(null,"Are you a PWD, Senior Citizen, Student?:","Book Borrower",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(c2 == 0)
                {
                    JOptionPane.showMessageDialog(null,"Very Well, we shall add a 20% discount to your fees...","Book Borrower",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Your total fine: " + (Double.parseDouble(computefine(d1,f1)) - (Double.parseDouble(computefine(d1,f1)) * spds/100)),"Book Borrower",JOptionPane.INFORMATION_MESSAGE);
                } else if (c2 == 1){
                    JOptionPane.showMessageDialog(null,"Your total fine: " + computefine(d1,f1));
                }
                break;
            case 2:
                d2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter days late:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                f2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fine:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                ds = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter discount rate:","Book Borrower",JOptionPane.QUESTION_MESSAGE));
                c2 = JOptionPane.showConfirmDialog(null,"Are you a PWD, Senior Citizen, Student?:","Book Borrower",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(c2 == 0)
                {
                    JOptionPane.showMessageDialog(null,"Very Well, we shall add a 20% discount to your fees...","Book Borrower",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Your total fine: " + (Double.parseDouble(computefine(d2,f2,ds)) - (Double.parseDouble(computefine(d2,f2,ds)) * spds/100)),"Book Borrower",JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null,"Your total fine: " + computefine(d2,f2,ds),"Book Borrower",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"INVALID CHOICE!","ERROR!",JOptionPane.ERROR_MESSAGE);
                break;
        }
        Ame2.close();
    }
    static String computefine(int n1,int n2)
    {
         double sum = n1 * n2;
        return String.format("%.2f",sum);
    }
    static String computefine(int dayslate,int fine,int discount)
    {
        double total = (dayslate * fine);
        double sum =  total - (total * ((double)discount/100));
        return String.format("%.2f",sum);
    }
}
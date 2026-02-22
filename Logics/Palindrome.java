import java.util.Scanner;
public class Palindrome
//If a word is a palindrome print Yipiee, else print Aww man!.
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.nextLine();
        PalindromeChecker(w);
        if(PalindromeChecker(w) == true) {
            System.out.print("Yipiee!");
        } else if (PalindromeChecker(w) == false) {
            System.out.print("Aww man!");
        }
        sc.close();
}
    public static boolean PalindromeChecker(String word)
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
               return false;
            }
                
        }
        return true;
    }
}
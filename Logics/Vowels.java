import java.util.Scanner;
public class Vowels {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a word: ");
        String S = sc.nextLine().toLowerCase();
        for(int i = 0; i < S.length();i++)  {
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u')
            {
                sum = sum + 1;
            }
        }
        System.out.printf("The total number of vowels present in this word is: %d",sum);
        sc.close();
    }
}

public class ReverseString {
    //ReverseString logic without StringBuilder.reverse()
    public static void main(String[] args) {
        String s = "Hamburger";

        for(int i = s.length() - 1; i >= 0;i--)
        {
            char letter = s.charAt(i);
            System.out.print(letter);
        }
    }
}

public class Divisibles
{
    //For every numbers divisible by 3 print: Blip!, 
    // for every numbers divisible by 5 print: Bloop!, 
    // and for every numbers divisible by both 3 and 5 print: BlipBloop!, 
    // else print the number
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("BlipBloop!\n");
            } else if (i % 3 == 0) {
                System.out.print("Blip!\n");
            } else if (i % 5 == 0) {
                System.out.print("Bloop!\n");
            } else {
                System.out.print(i + "\n");
            }
        }
    }
}
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the size of the Array: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i = 0;i < arr.length;i++) {
            System.out.printf("Enter index %d: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.printf("{%d,",arr[0]);
        for(int j = 1; j < arr.length-1;j++) {
            System.out.printf("%d,", arr[j]);
        }
        for(int k = 0; k < arr.length;k++)
        {
            sum = sum + arr[k];
        }
        System.out.printf("%d}",arr[arr.length-1]);
        System.out.printf("\nThe total sum of the Array is: %d", sum);
        sc.close();
    }
}
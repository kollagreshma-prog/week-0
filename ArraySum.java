import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}
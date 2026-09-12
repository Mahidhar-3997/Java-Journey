import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();

    }
}

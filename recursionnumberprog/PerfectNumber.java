
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(isPerfect(n, n / 2, 0));
        sc.close();
    }

    public static boolean isPerfect(int n, int i, int sum) {
        if (i == 0) {
            return n == sum;
        }
        return isPerfect(n, i - 1, sum += i);
    }

}

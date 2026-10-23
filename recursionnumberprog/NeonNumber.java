
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number :");
        int n = sc.nextInt();
        int sq = n * n;
        System.out.println(isNeon(n, sq, 0));
        sc.close();
    }

    public static boolean isNeon(int n, int sq, int sum) {
        if (sq == 0) {
            return n == sum;
        }
        return isNeon(n, sq / 2, sum += sq % 10);
    }
}

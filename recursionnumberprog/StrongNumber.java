import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int m = n;

        System.out.println(isStrong(n, m, 0));
        sc.close();
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static boolean isStrong(int n, int m, int sum) {
        if (n == 0) {
            return m == sum;
        }
        return isStrong(n / 10, m, sum += fact(n % 10));

    }

}

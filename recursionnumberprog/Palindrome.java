
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int m = n;
        System.out.println(check(n, m, 0));
        sc.close();

    }

    public static boolean check(int n, int m, int rev) {
        if (n == 0) {
            return m == rev;
        }
        return check(n / 10, m, rev = rev * 10 + n % 10);
    }

}

import java.util.Scanner;

public class PalindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int st = sc.nextInt();
        int end = sc.nextInt();
        range(st, end);
        sc.close();

    }

    public static void range(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int n) {
        int m = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == m;
    }

}

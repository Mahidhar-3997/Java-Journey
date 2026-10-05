import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        boolean result = isPalindrome(a);
        System.out.println(result);
        sc.close();

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

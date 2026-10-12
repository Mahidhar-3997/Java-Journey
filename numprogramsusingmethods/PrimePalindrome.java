import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        check(a);
        sc.close();

    }

    public static void check(int i) {
        if (isPrime(i) && isPalindrome(i)) {
            System.out.println("given number is prime palindrome");

        } else {
            System.out.println("not a prime palindrome");
        }
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        if (n <= 1) {
            flag = false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isPalindrome(int n) {
        int m = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev == m;
    }

}
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i = sc.nextInt();
        check(i);
        sc.close();

    }

    public static void check(int i) {
        if (isStrong(i)) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong Number");
        }
    }

    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int prod = 1;
            for (int i = 1; i <= rem; i++) {
                prod *= i;
            }
            sum += prod;
            n /= 10;
        }
        return (sum == temp);
    }

}

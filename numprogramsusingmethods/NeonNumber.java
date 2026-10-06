import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i = sc.nextInt();
        check(i);
        sc.close();

    }

    public static void check(int i) {
        if (isNeon(i)) {
            System.out.println("Neon Number");
        } else {
            System.out.println("not a neon Number");
        }
    }

    public static boolean isNeon(int n) {

        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            int rem = sq % 10;
            sum += rem;
            sq /= 10;
        }
        return sum == n;
    }
}

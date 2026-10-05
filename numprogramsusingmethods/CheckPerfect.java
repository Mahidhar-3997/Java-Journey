import java.util.Scanner;

public class CheckPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        boolean result = isPerfect(a);
        System.out.println(result);
        sc.close();

    }

    public static boolean isPerfect(int n) {
        int m = n;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == m;
    }

}

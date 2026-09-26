import java.util.Scanner;

public class PrimeNumberLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = end; n >= start; n--) {
            boolean flag = true;
            if (n <= 1)
                continue;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n);
                break;

            }

        }

        sc.close();

    }
}

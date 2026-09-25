import java.util.Scanner;

public class NeonNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int temp = n;
            int sq = temp * temp;
            int sum = 0;
            while (sq > 0) {
                int rem = sq % 10;
                sum += rem;
                sq /= 10;
            }
            if (sum == n) {
                System.out.println(n);
            }
        }
        sc.close();

    }
}

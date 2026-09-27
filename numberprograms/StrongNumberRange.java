import java.util.Scanner;

public class StrongNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                int fact = 1;
                for (int i = 1; i <= rem; i++) {
                    fact *= i;
                }
                sum += fact;
                temp /= 10;
            }
            if (sum == n) {
                System.out.println(n);
            }
        }
        sc.close();

    }

}

import java.util.Scanner;

public class SpyNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;
            int prod = 1;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                prod *= rem;
                temp /= 10;
            }
            if (sum == prod) {
                System.out.println(n);
            }
        }
        sc.close();

    }

}

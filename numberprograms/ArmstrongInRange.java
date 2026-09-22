import java.util.Scanner;

public class ArmstrongInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int temp = n;
            int count = 0;
            int sum = 0;
            while (temp > 0) {
                temp /= 10;
                count++;
            }
            temp = n;
            while (temp > 0) {
                int rem = temp % 10;
                int product = 1;
                for (int i = 1; i <= count; i++) {
                    product *= rem;
                }
                sum += product;
                temp /= 10;
            }
            if (sum == n) {
                System.out.println(n);
            }

        }

        sc.close();

    }

}

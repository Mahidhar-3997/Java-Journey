
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        n = temp;
        int sum = 0;
        while (n > 0) {
            int product = 1;
            int rem = n % 10;
            for (int i = 1; i <= count; i++) {
                product *= rem;
            }
            sum += product;
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("not a Armstrong number");
        }
        sc.close();

    }
}

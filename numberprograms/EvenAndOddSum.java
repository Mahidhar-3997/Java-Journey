import java.util.Scanner;

public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                evenSum += rem;
            } else {
                oddSum += rem;
            }
            n /= 10;

        }
        System.out.println("EvenSum = " + evenSum);
        System.out.println("OddSum = " + oddSum);
        sc.close();

    }
}

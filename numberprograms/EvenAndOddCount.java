import java.util.Scanner;

public class EvenAndOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            n /= 10;
        }
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
        sc.close();

    }
}

import java.util.Scanner;

public class Smallest3rdArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        range(st, end);
        sc.close();

    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int count = 0;
        int sum = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        n = temp;
        while (n > 0) {
            int rem = n % 10;
            int prod = 1;
            for (int i = 1; i <= count; i++) {
                prod *= rem;
            }
            sum += prod;
            n /= 10;
        }
        return temp == sum;
    }

    public static void range(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isArmstrong(i)) {
                count++;
                if (count == 3) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}

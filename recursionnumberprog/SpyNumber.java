import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(isSpy(n, 0, 1));
        sc.close();

    }

    public static boolean isSpy(int n, int sum, int prod) {
        if (n == 0) {
            return sum == prod;
        }
        return isSpy(n / 10, sum += n % 10, prod *= n % 10);
    }
}

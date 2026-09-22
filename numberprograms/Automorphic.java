
import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sq = n * n;
        int r1 = 0;
        int r2 = 0;
        while (n > 0) {
            r1 = n % 10;
            r2 = sq % 10;
            n /= 10;
            sq /= 10;
        }
        if (r1 != r2) {
            System.out.println("not Automorphic");
        } else {
            System.out.println("Automorphic");
        }
        sc.close();

    }
}

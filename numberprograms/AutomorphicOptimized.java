import java.util.Scanner;

public class AutomorphicOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sq = n * n;
        int m = n;
        boolean flag = true;
        while (n > 0) {
            if ((n % 10) != (sq % 10)) {
                flag = false;
                break;
            }
            n /= 10;
            sq /= 10;
        }
        if (flag) {
            System.out.println(m + " is a automorphic " + (m * m));
        } else {
            System.out.println(m + " is not a automorphic " + (m * m));
        }
        sc.close();
    }
}

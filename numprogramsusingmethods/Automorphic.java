
import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i = sc.nextInt();
        check(i);
        sc.close();

    }

    public static void check(int i) {
        if (isAutomorphic(i)) {
            System.out.println("Autmorphic number");
        } else {
            System.out.println("Not automorphic number");
        }
    }

    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        boolean flag = true;
        while (n > 0) {
            if (n % 10 != sq % 10) {
                flag = false;
                break;
            }
            n /= 10;
            sq /= 10;
        }
        return flag;
    }
}

import java.util.Scanner;

public class AutomorphiRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int temp = n;
            int sq = temp * temp;
            boolean flag = true;
            while (temp > 0) {
                if ((temp % 10) != (sq % 10)) {
                    flag = false;
                    break;
                }
                temp /= 10;
                sq /= 10;
            }
            if (flag) {
                System.out.println(n);
            }
        }
        sc.close();

    }
}

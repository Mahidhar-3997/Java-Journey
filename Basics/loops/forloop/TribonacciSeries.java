import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            int d = a + b + c;
            System.out.println(d + " ");
            a = b;
            b = c;
            c = d;
        }
        sc.close();

    }
}

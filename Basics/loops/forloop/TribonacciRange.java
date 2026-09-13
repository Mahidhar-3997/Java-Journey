import java.util.Scanner;

public class TribonacciRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        for (;;) {
            int d = a + b + c;
            if (d > n) {
                break;
            }
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
        sc.close();

    }
}

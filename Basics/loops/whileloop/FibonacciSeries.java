import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int i = 3;
        while (i <= n) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
        sc.close();
    }
}

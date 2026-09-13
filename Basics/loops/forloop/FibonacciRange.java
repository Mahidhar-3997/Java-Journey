import java.util.Scanner;

public class FibonacciRange {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (;;) {
            int c = a + b;
            if (c > n) {
                break;
            }
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();

    }
}

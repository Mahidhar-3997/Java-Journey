import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a < b ? a : b;
        while (true) {
            if (a % n == 0 && b % n == 0) {
                break;
            }
            n--;
        }
        System.out.println("gcd of two numbers is " + n);
        sc.close();

    }

}

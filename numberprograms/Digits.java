import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int rem;
        while (n > 0) {
            rem = n % 10;
            System.out.println(rem);
            n /= 10;
        }

        System.out.println("Using for :");
        usingFor();
        sc.close();

    }

    public static void usingFor() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = n; i > 0; i /= 10) {
            int rem = i % 10;
            System.out.println(rem);

        }
        scn.close();
    }

}

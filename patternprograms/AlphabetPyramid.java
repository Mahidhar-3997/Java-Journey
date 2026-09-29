
import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera number :");
        int n = sc.nextInt();
        char ch = 'A';
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == n) {
                    System.out.print(ch++);

                } else {
                    System.out.print(num++);
                }

            }
            System.out.println();
        }
        sc.close();

    }
}

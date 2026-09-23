import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int res = 0;
        int i = 1;
        while (n > 0) {
            int bit = n % 10;
            res = (bit * i) + res;
            i *= 2;
            n /= 10;
        }
        System.out.println(res);
        sc.close();

    }
}

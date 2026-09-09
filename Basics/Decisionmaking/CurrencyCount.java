import java.util.Scanner;

public class CurrencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
        int amount = sc.nextInt();
        if (amount > 2000) {
            System.out.println("2000 x " + amount / 2000);
            amount %= 2000;
        }
        if (amount > 500) {
            System.out.println("500 x " + amount / 500);
            amount %= 500;
        }
        if (amount > 200) {
            System.out.println("200 x " + amount / 200);
            amount %= 200;
        }
        if (amount > 100) {
            System.out.println("100 x " + amount / 100);
            amount %= 100;
        }
        if (amount > 50) {
            System.out.println("50 x " + amount / 50);
        }
        sc.close();

    }
}

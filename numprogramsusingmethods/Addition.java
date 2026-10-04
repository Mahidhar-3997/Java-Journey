import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = add(a, b);
        System.out.println(result);
        sc.close();

    }

    public static int add(int a, int b) {
        return a + b;
    }
}

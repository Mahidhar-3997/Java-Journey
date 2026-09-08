import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        System.out.println("enter the values");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("valid triangle");
        } else {
            System.out.println("invalid triangle");
        }
    }
}

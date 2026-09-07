import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value : ");
        int number = sc.nextInt();
        String result = number == 0 ? "Zero" : number % 2 == 0 ? "even" : "odd";
        System.out.println("result : " + result);
    }
}

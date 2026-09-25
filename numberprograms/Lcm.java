import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n= a>b?a:b;
		int i=n;
		while(true) {
			if(n%a==0&&n%b==0) {
				break;
			}
			n+=i;
		}
		System.out.println("Lcm of two number is"+n);
		sc.close();
		

	}
}

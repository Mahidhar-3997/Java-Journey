import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int res =0;
		int i=1;
		while(n>0) {
			int bit = n%2;
			res = (bit*i)+res;
			n/=2;
			i*=10;
		}
		System.out.println(res);
		sc.close();

	}
}

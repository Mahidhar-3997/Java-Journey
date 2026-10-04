import java.util.Scanner;

public class ZigZagIncreAndDecre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int x;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				x = (i - 1) * n;
				for (int j = 1; j <= n; j++) {
					x++;
					System.out.print(x + "\t");

				}
			} else {
				int y = i * n;
				x = y;
				for (int j = 1; j <= n; j++) {
					System.out.print(y + "\t");
					y--;
				}
			}
			System.out.println();
		}
		sc.close();

	}

}

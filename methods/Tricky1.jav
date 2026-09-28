public class Tricky1{
    public static void main(String[] args) {
		int n = m1(2);
		System.out.println(n);

	}
	public static int m1(int i) {
		++i;
		i++;
		return i++;
	}
}
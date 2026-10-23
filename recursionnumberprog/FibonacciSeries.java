
public class FibonacciSeries {
    public static void main(String[] args) {
        series(0, 1, 10);
    }

    public static void series(int a, int b, int count) {
        if (count == 0) {
            return;
        }

        System.out.print(a + " ");
        series(b, a + b, count - 1);
    }
}

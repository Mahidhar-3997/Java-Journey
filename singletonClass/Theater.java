
public class Theater {
    private static int seats = 50;
    private static Theater t;

    private Theater() {

    }

    public static Theater get() {
        if (t == null) {
            return t = new Theater();
        }
        return t;
    }

    public void book(int n) {
        if (n <= seats) {
            seats -= n;
            System.out.println(n + "Seates is booked");
            System.out.println(seats + "is available");
        } else {
            System.out.println(n + "seats is not booked");
            System.out.println("only " + seats + "is available");
        }
    }
}

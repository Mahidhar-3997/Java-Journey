
public class BookMyShow {
    public static void main(String[] args) {
        Theater t1 = Theater.get();
        Theater t2 = Theater.get();
        Theater t3 = Theater.get();
        Theater t4 = Theater.get();
        Theater t5 = Theater.get();
        t1.book(10);
        t2.book(30);
        t3.book(20);
        t4.book(40);
        t5.book(10);

    }

}

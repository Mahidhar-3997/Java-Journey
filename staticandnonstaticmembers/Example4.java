public class Example4 {
    public static void main(String[] args) {
        D d1 = new D();
        D d2 = new D();
        D d3 = new D();
        d1.incr();
        d2.incr();
        d3.incr();
        d1.display();
        d2.display();
        d3.display();

    }

}

class D {
    static int i;
    int j;

    void incr() {
        ++i;
        ++j;

    }

    void display() {
        System.out.println(i + " " + j);
    }
}

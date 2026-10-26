public class Example5 {
    public static void main(String[] args) {
        E d1 = new E();
        E d2 = new E();
        E d3 = new E();
        d1.incr();
        d1.display();
        d1.incr();
        d2.display();
        d1.incr();
        d3.display();

    }

}

class E {
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
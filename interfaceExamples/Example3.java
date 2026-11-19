
public class Example3 {
    public static void main(String[] args) {

    }

}

interface name {
    int i = 10;// by default variables are public static final

    void m1();

    default void m2() {
        // possible from JDK 8.
    }

    static void m3() {
        // possible from JDK 8
    }

    private void m4() {
        // possible from JDK 9.
    }
}

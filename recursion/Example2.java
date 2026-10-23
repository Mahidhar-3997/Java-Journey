
public class Example2 {
    public static void main(String[] args) {
        m1(1);

    }

    public static void m1(int i) {
        System.out.println(i);
        m1(i + 1);
    }
}
/*
it will throw stack over flow exception why because
there is no base condition ,so it will execute end number
of times at some point it wil stuck because of there is no memory
*/

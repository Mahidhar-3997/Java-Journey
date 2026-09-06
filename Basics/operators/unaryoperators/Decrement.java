public class Decrement {
    public static void main(String[] args) {

        int a = 10;

        // Post-decrement
        System.out.println("Post-decrement : " + a--);
        System.out.println("After post-decrement : " + a);

        // Pre-decrement
        System.out.println("Pre-decrement : " + --a);
        System.out.println("After pre-decrement : " + a);
    }
}

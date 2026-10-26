public class Example8 {
    public static void main(String[] args) {
        // Math m1 = new Math();
        // m1.add(10, 20);//no need to create an object to call add method why bcoz it
        // is static method
        // Math m2 = new Math();
        // m2.add(50, 60);
        Math.add(50, 60);

    }

}

class Math {
    static void add(int a, int b) {
        System.out.println(a + b);
    }
}

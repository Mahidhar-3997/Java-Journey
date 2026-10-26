public class Example9 {
    public static void main(String[] args) {
        Num n1 = new Num();
        n1.a = 10;
        n1.b = 20;
        n1.add();
        Num n2 = new Num();
        n2.a = 100;
        n2.b = 200;
        n2.add();
    }

}

class Num {
    int a;
    int b;

    void add() {
        System.out.println(a + b);
    }
}

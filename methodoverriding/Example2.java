
public class Example2 {
    public static void main(String[] args) {
        Snake s = new Snake();
        s.move();

    }

}

class Animal {
    void move() {
        System.out.println("running implementation.");
    }
}

class Snake extends Animal {
    @Override
    void move() {
        System.out.println("crawling implementation.");
    }
}

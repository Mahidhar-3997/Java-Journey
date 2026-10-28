class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("length=" + length + "\n" + "breadth=" + breadth);
    }
}

public class Example4 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20, 40);
        r1.display();

    }

}

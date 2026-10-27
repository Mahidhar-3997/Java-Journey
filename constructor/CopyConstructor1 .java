class Rectangle1 {
    int length;
    int breadth;

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;

    }

    Rectangle1(Rectangle1 r) {
        length = r.length;
        breadth = r.breadth;
    }

    void display() {
        System.out.println("length=" + length + "\n" + "breadth=" + breadth);
    }
}

class CopyConstructor1 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(10, 20);
        Rectangle1 r2 = new Rectangle1(r1);
        r1.display();
        r2.display();

    }
}
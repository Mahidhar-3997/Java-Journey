
public class NonstaticEx2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.num);
        System.out.println(c1.color);
        Car c2 = new Car("Black");
        System.out.println(c2.num);
        System.out.println(c2.color);

    }

}

class Car {
    int num;
    String color;
    private static int x = 1000;
    {
        num = x;
        x++;
    }

    Car() {
        color = "white";
    }

    Car(String c) {
        color = c;
    }

}

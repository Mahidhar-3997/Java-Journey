
public class Example2 {
    public static void main(String[] args) {
        Driver d1 = new Driver();
        d1.drive(new Benz());
        d1.drive(new Bmw());
        d1.drive(new Audi());
        d1.drive(new cars());
    }

}

class cars {

}

class Bmw extends cars {

}

class Audi extends cars {

}

class Benz extends cars {

}

class Driver {
    void drive(cars c) {
        System.out.println("driver drives the car");
    }
}

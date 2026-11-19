
public class MarkerInterface {
    public static void main(String[] args) {
        Washer w = new Washer();
        w.wash(new Bike());

    }

}

class Washer {
    void wash(Object o) {
        if (!(o instanceof Washable)) {
            System.out.println("washing is not possible");
            return;
        }
    }
}

interface Washable {

}

class Phone {

}

class Bike implements Washable {

}
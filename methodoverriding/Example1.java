
public class Example1 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.connectCall();// prints child class method implementation
    }

}

class Phone {
    public void connectCall() {
        System.out.println("3g implementation.");
    }
}

class SmartPhone extends Phone {
    @Override 
    public void connectCall() {
        System.out.println("5g implementation.");
    }
}

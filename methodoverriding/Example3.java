
public class Example3 {
    public static void main(String[] args) {
        Doctor d = new Doctor("cardiologist", 8, "dr.Suresh", 47);
        d.display();

    }

}

class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
    }
}

class Doctor extends Human {
    String spec;
    int yoe;

    Doctor(String spec, int yoe, String name, int age) {
        super(name, age);
        this.spec = spec;
        this.yoe = yoe;
    }

    @Override
    void display() {
        super.display();
        System.out.println("specialization=" + spec);
        System.out.println("experience=" + yoe);
    }
}

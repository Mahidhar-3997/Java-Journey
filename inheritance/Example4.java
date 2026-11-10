
public class Example4 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ramana", "java");
        System.out.println(t1.name);
        System.out.println(t1.sub);

    }

}

class Human {
    String name;

    Human(String n) {
        this.name = n;
    }
}

class Teacher extends Human {
    String sub;

    Teacher(String n, String s1) {
        super(n);
        sub = s1;
    }

}

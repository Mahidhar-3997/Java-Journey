
public class Example3 {
    public static void main(String[] args) {
        Emp1 e1 = new Emp1("raju", 20000);
        Emp1 e2 = new Emp1("smith", 40000);
        e1.display();
        e2.display();
        System.out.println("Total number of employees=" + Emp1.count);

    }

}

class Emp1 {
    String name;
    int id;
    double sal;
    static int count;

    Emp1(String n, double s) {
        name = n;
        sal = s;
        count++;
        id = count;
    }

    public void display() {
        System.out.println("--------------");
        System.out.println("name=" + name);
        System.out.println("id=" + id);
        System.out.println("salary=" + sal);
        System.out.println("--------------");
    }
}
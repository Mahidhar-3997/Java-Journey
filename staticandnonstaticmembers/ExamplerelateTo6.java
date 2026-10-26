public class ExamplerelateTo6 {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.init("bharat", "B.tech", 3000);
        s1.display();
        Student.count++;
        System.out.println("total students=" + Student.count);

    }

}

class StudentInfo {
    String name;
    String Qualification;
    int feePaid;
    static int count;

    void init(String n, String q, int f) {
        name = n;
        Qualification = q;
        feePaid = f;
    }

    void display() {
        System.out.println("name= " + name);
        System.out.println("Qualification = " + Qualification);
        System.out.println("feePaid = " + feePaid);
    }
}
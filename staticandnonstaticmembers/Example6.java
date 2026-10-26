public class Example6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "bharat";
        s1.Qualification = "B.tech";
        s1.feePaid = 30000;
        Student.count++;
        System.out.println("Total student=" + Student.count);
        System.out.println(s1.name);
        System.out.println(s1.Qualification);
        System.out.println(s1.feePaid);

    }

}

class Student {
    String name;
    String Qualification;
    int feePaid;
    static int count;

}
public class Logical {
    public static void main(String[] args) {

        int age = 25;
        int salary = 30000;

        System.out.println("age > 18 && salary > 20000 : " + (age > 18 && salary > 20000));
        System.out.println("age > 30 || salary > 20000 : " + (age > 30 || salary > 20000));
        System.out.println("!(age > 18)             : " + !(age > 18));
    }
}
/*
logical operators give the output as boolean value.
*/

public class FinalRefVariable {
    public static void main(String[] args) {
        Pages p1 = new Pages();

        System.out.println(p1.pages);
        p1.pages = 50;// no error p1 is final not pages

        System.out.println(p1.pages);
        p1.m1();
        // p1=new Pages();
        // p1=null;
    }

}

class Pages {
    int pages = 400;

    void m1() {
        System.out.println("m1 in pages");
    }
}

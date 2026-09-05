public class LocalAndStatic {
    static int a = 36;
    static long b = 123456789;
    static float c = 2.556f;
    static double d = 55.264d;
    static char e = 'm';
    static String f = "poiuytre";

    public static void main(String[] args) {
        int a = 55;
        long b = 987654321;
        float c = 23.556f;
        double d = 66.264d;
        char e = 'm';
        String f = "mahi";
        System.out.println("Hello World");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("-----------------");
        System.out.println(LocalAndStatic.a);
        System.out.println(LocalAndStatic.b);
        System.out.println(LocalAndStatic.c);
        System.out.println(LocalAndStatic.d);
        System.out.println(LocalAndStatic.e);
        System.out.println(LocalAndStatic.f);
    }
}

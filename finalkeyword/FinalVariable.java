public class FinalVariable {

    public static void main(String[] args) {
        final int i = 10;
        System.out.println(i);
        // i=20; compile time error
        // i++; CTE;
        // i+=3; CTE;

        System.out.println(i);

    }

}

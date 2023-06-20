public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit type casting
        int x = 10;
        double y = x; // Implicitly casting int to double
        System.out.println("Implicit casting: x = " + x + ", y = " + y);

        // Explicit type casting
        double a = 3.14;
        int b = (int) a; // Explicitly casting double to int
        System.out.println("Explicit casting: a = " + a + ", b = " + b);
    }
}

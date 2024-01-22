public class VectorMain {
    public static void main(String[] args) {

        // Default method
        ComponentVector cv = new ComponentVector(-1, 0); // Pi Radians
        System.out.printf("%.2f%n", cv.getDirectionInRadians()); // 3.14

        // Implicit Casting
        Vector a = new ComponentVector(2.0, 2.0);
        Vector b = new MagnitudeVector(5.0, Math.PI / 4);

        System.out.println(a.getDirectionInDegrees()); // 45.0
        System.out.println(b.getDirectionInDegrees()); // 45.0
    }
}

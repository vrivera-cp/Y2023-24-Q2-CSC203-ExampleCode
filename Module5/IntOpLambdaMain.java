public class IntOpLambdaMain {
    public static void main(String[] args) {
        IntOp adder = (x, y) -> x + y;
        System.out.println(adder.operate(16, 32)); // Output: 48

        IntOp multiplier = (x, y) -> x * y;
        System.out.println(multiplier.operate(16, 32)); // Output: 512

        IntOp vectorMeasurer = (x, y) -> {
            int z = x * x + y * y;
            double sqrtZ = Math.sqrt(z);
            return (int) sqrtZ;
        };
        System.out.println(vectorMeasurer.operate(3, 4)); // Output: 25
    }
}

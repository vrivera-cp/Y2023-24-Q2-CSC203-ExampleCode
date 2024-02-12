public class IntAdd implements IntOp {
    public int operate(int x, int y) { return x + y; }

    public static void main(String[] args) {
        IntOp adder = new IntAdd();
        System.out.println(adder.operate(16, 32)); // Output: 48
    }
}
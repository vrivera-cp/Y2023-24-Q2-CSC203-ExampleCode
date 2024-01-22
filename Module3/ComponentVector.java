public class ComponentVector implements Vector {
    private final double x;
    private final double y;

    public ComponentVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public double getDirectionInDegrees() {
        return Math.atan2(y, x) / Vector.radiansPerDegree;
    }
}

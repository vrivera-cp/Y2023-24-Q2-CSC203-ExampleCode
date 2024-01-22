public class MagnitudeVector implements Vector {
    private final double magnitude;
    private final double direction; // Radians

    public MagnitudeVector(double magnitude, double direction) {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public double getDirectionInDegrees() {
        return direction / Vector.radiansPerDegree;
    }

    public double getDirectionInRadians() {
        return direction;
    }
}

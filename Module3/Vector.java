public interface Vector {
    double radiansPerDegree = Math.PI / 180.0;

    static double degToRad(double degrees) {
        return degrees * radiansPerDegree;
    }

    double getMagnitude();

    double getDirectionInDegrees();

    default double getDirectionInRadians() {
        return degToRad(getDirectionInDegrees());
    }
}
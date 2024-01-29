/** Represents a generalized vehicle. */
public abstract class Vehicle {
    protected Point position;

    public Vehicle(Point position) {
        this.position = position;
    }

    public abstract void moveTo(Point position);
}

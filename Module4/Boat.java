/** Represents a boat. */
public class Boat extends Vehicle {
    public Boat(Point position) {
        super(position);
    }

    @Override
    public void moveTo(Point position) {
        System.out.println("Swoosh!");
        super.position = position; // or this.position
    }
}

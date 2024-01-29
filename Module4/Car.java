/** Represents a car. */
public class Car extends Vehicle {
    private boolean isElectric;

    public Car(Point position, boolean isElectric) {
        super(position);
        this.isElectric = isElectric;
    }

    @Override
    public void moveTo(Point position) {
        System.out.println("Vroom!");
        super.position = position; // or this.position
    }
}

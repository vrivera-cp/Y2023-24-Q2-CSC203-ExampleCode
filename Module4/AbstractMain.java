public class AbstractMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Point(0.0, 0.0), false);

        Car car = new Car(new Point(1.0, 0.0), true);
        Boat boat = new Boat(new Point(2.0, 0.0));

        Vehicle upCast = (Vehicle) boat;
        Car downCast = (Car) vehicle;

        Point destination = new Point(100.0, 100.0);
        vehicle.moveTo(destination);  // 'Vroom!'
        car.moveTo(destination);      // 'Vroom!'
        boat.moveTo(destination);     // 'Swoosh!'
        upCast.moveTo(destination);   // 'Swoosh!'
        downCast.moveTo(destination); // 'Vroom!'
    }
}

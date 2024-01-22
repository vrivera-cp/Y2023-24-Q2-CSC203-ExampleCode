public class Human implements Carnivore, Herbivore {
    public void hunt() {
        System.out.println(this + " hunts for food.");
    }

    public void gather() {
        System.out.println(this + " farms food.");
    }
}
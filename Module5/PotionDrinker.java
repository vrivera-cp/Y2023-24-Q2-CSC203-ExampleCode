public class PotionDrinker {
    public String name;
    public int age;

    public PotionDrinker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drink(Potion potion) {
        potion.effect.accept(this);
    }

    public void incrementAge() {
        age++;
    }

    @Override
    public String toString() {
        return String.format("(%s, %d)", name, age);
    }
}

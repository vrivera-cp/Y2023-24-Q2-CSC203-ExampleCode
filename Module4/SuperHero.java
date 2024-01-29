import java.util.Objects;

/** Represents a super hero. */
public class SuperHero {
    private String name;
    private String power;

    public SuperHero(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public final String getPower() {
        return power;
    }

    public void doAction() {
        System.out.printf("%s uses their %s!%n", getName(), getPower());
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof SuperHero superHero) {
            return Objects.equals(name, superHero.name) && Objects.equals(power, superHero.power);
        }
        return false;
    }
}

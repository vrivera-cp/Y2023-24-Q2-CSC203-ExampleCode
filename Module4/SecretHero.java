import java.util.Objects;

/** Represents a person who hides their superhero persona. */
public class SecretHero extends SuperHero {
    private String name;

    public SecretHero(String heroName, String power, String name) {
        super(heroName, power);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doAction() {
        System.out.printf("%s does ordinary things.%n", getName());
    }

    public void doSuperAction() {
        super.doAction();
    }

    public void doActionAsHero() {
        System.out.printf("%s uses their %s!%n", super.getName(), getPower());
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof SecretHero secretHero) {
            return super.equals(secretHero) && Objects.equals(name, secretHero.name);
        }
        return false;
    }
}

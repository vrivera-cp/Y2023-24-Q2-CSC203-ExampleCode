public class InheritanceMain {
    public static void main(String[] args) {
        // Up Cast
        SuperHero otherHero = new SecretHero("tony", "iron man", "intelligence");

        // Down Cast
        SecretHero sameHero = (SecretHero) otherHero;

        SecretHero hero;
        hero = new SecretHero("Sailor Moon", "transformation", "Tsukino");

        System.out.println(hero.getName()); // 'Tsukino'
        System.out.println(hero.getPower()); // 'transformation'

        hero.doAction(); // 'Tsukino does ordinary things.'

        // Up Cast and then call
        ((SuperHero) hero).doAction(); // 'Tsukino does ordinary things.'

        hero.doSuperAction(); // 'Tsukino uses their transformation!'

        hero.doActionAsHero(); // 'Sailor Moon uses their transformation!'
    }
}

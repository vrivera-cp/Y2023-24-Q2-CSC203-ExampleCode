public class EqualsMain {
    public static void main(String[] args) {
        SuperHero hero = new SuperHero("Superman", "flying");
        SecretHero secret = new SecretHero("Superman", "flying", "Clark");
        SecretHero clone = new SecretHero("Superman", "flying", "Clark");

        System.out.println(secret.equals(secret)); // "True"
        System.out.println(secret.equals(clone));  // "True"
        System.out.println(secret.equals((SuperHero) clone));   // "True"

        System.out.println(secret.equals(hero)); // "False"

        System.out.println(hero.equals(secret)); // "True"
    }
}

public class PotionMain {
    public static void main(String[] args) {
        PotionDrinker mochi = new PotionDrinker("Mochi", 6);
        PotionDrinker harvest = new PotionDrinker("Harvest", 5);

        Potion kittenifyPotion = new Potion(x -> {
            x.name = "Kitty " + x.name;
            x.age = 0;
        });
        System.out.println(mochi); // Output: '(Mochi, 6)'
        mochi.drink(kittenifyPotion);
        System.out.println(mochi); // Output: '(Kitty Mochi, 0)'

        Potion agingPotion = new Potion(PotionDrinker::incrementAge);
        System.out.println(harvest); // Output: '(Harvest, 5)'
        harvest.drink(agingPotion);
        System.out.println(harvest); // Output: '(Harvest, 6)'

        Potion nefariousPotion = new Potion(x -> harvest.name = "Hungry " + harvest.name);
        System.out.println(harvest); // Output: '(Harvest, 6)'
        mochi.drink(nefariousPotion);
        System.out.println(harvest); // Output: '(Hungry Harvest, 6)'
    }
}

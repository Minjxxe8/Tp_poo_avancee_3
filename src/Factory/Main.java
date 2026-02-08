package Factory;

public class Main {
    public static void main(String[] args) {
        Burger veggie = BurgerFactory.createBurger(BurgerType.VEGGIE);
        System.out.println(veggie.getRecette() + " : Prix : " + veggie.getPrix() + "€");

        Burger cheeseburger = BurgerFactory.createBurger(BurgerType.CHEESEBURGER);
        System.out.println(cheeseburger.getRecette() + " : Prix : " + cheeseburger.getPrix() + "€");

        Burger chicken = BurgerFactory.createBurger(BurgerType.CHICKEN);
        System.out.println(chicken.getRecette() + " : Prix : " + chicken.getPrix() + "€");
    }
}
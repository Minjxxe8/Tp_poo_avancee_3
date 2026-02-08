package Factory;

public class BurgerFactory {
    public static Burger createBurger(BurgerType type) {
        switch (type) {
            case CHEESEBURGER:
                return new CheeseBurger();
            case CHICKEN:
                return new ChickenBurger();
            case VEGGIE:
                return new BurgerVeggie();
            default:
                throw new IllegalArgumentException("Invalid burger type: " + type);
        }
    }
}

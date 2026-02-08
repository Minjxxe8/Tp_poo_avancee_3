package Observer;

public class Main {

    public static void main(String[] args) {
        ClientVIP client1 = new ClientVIP("Lénaaaa");
        ClientVIP client2 = new ClientVIP("Hanaé");
        ClientVIP client3 = new ClientVIP("Charles III");
        ClientVIP client4 = new ClientVIP("Owen");

        BurgerFastRestaurant.addClientVIP(client1);
        BurgerFastRestaurant.addClientVIP(client2);
        BurgerFastRestaurant.addClientVIP(client3);
        BurgerFastRestaurant.addClientVIP(client4);

        Promotion promo = new Promotion(20);
        BurgerFastRestaurant.notifyAllClientVIP(promo);
    }
}
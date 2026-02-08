package Observer;

public class ClientVIP {

    private String name;

    public ClientVIP(String name) {
        this.name = name;
    }

    public void receptionNotification(Promotion promotion) {
        System.out.println(name + " a reçu une notification de promotion avec un taux de remise de " + promotion.tauxRemise + "%.");
    }

}

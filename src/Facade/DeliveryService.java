package Facade;

public class DeliveryService {
    public boolean verifierLivreurDisponible() {
        System.out.println("Recherche d'un livreur disponible...");
        return true;
    }

    public boolean verifierPerimetre(String adresse) {
        System.out.println("Vérification de la zone pour : " + adresse);
        return true;
    }
}

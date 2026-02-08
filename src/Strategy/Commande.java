package Strategy;

public class Commande {
    private double distanceKm;
    private double prixPlats;
    private StrategieLivraison strategieLivraison;

    public Commande(double distanceKm, double prixPlats, StrategieLivraison strategieLivraison) {
        this.distanceKm = distanceKm;
        this.prixPlats = prixPlats;
        this.strategieLivraison = strategieLivraison;
    }

    public double calculerFraisLivraison() {
        return strategieLivraison.calculerFrais(distanceKm, prixPlats);
    }
}

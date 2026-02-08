package Strategy;

public class Main {
    public static void main(String[] args) {

        StrategieLivraison livraisonExpress = new LivraisonExpress();
        StrategieLivraison livraisonStandard = new LivraisonStandard();
        StrategieLivraison clickAndCollect = new ClickAndCollect();

        Commande commande1 = new Commande(10, 50, livraisonExpress);
        Commande commande2 = new Commande(5, 30, livraisonStandard);
        Commande commande3 = new Commande(0, 20, clickAndCollect);

        System.out.println("Frais de livraison pour la commande 1: " + commande1.calculerFraisLivraison());
        System.out.println("Frais de livraison pour la commande 2: " + commande2.calculerFraisLivraison());
        System.out.println("Frais de livraison pour la commande 3: " + commande3.calculerFraisLivraison());
    }
}
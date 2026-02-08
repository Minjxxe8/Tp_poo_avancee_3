package Facade;


public class Main {
    public static void main(String[] args) {
        CommandeValidationFacade facade = new CommandeValidationFacade();

        String utilisateur = "Lénaaaaa";
        String adresseLivraison = "67 rue de MontMartre";

        boolean commandeOk = facade.validerCommande(utilisateur, adresseLivraison);

        if (commandeOk) {
            System.out.println("Votre burger est prêt !");
        } else {
            System.out.println("Impossible de valider la commande.");
        }
    }
}
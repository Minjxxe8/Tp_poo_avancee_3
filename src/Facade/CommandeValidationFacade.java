package Facade;

public class CommandeValidationFacade {
    private final AuthService auth;
    private final IngredientService ingredient;
    private final PreparationService planning;
    private final DeliveryService delivery;

    public CommandeValidationFacade() {
        this.auth = new AuthService();
        this.ingredient = new IngredientService();
        this.planning = new PreparationService();
        this.delivery = new DeliveryService();
    }

    public boolean validerCommande(String adresseClient, String adresseLivraison) {

        if (!auth.estConnecte()) return false;
        if (!ingredient.verifierIngredients()) return false;
        if (!planning.verifierTempsPreparation()) return false;
        if (!delivery.verifierLivreurDisponible()) return false;
        if (!delivery.verifierPerimetre(adresseClient)) return false;

        return true;
    }
}
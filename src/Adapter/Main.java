package Adapter;

public class Main {

    public static void main(String[] args) {

        LecteurCSV lecteur = new LecteurCSV("src/Adapter/ventes.csv");
        AnalyseurVentes analyseur = new CSVAdapter(lecteur);

        BurgerAnalytics analytics = new BurgerAnalytics(analyseur);
        analytics.genererRapport();
    }
}
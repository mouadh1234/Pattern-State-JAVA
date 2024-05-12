package Distributeur;

public class EtatMachineVide  implements EtatDistributeur {
    private Distributeur distributeur;

    public EtatMachineVide(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    @Override
    public void insererCarte(Carte client) {
        System.out.println("La machine est vide. Impossible d'insérer une carte.");
    }

    @Override
    public void entrerCode(String code) {
        System.out.println("La machine est vide. Impossible d'entrer un code.");
    }

    @Override
    public void retirerArgent() {
        System.out.println("La machine est vide. Impossible de retirer de l'argent.");
    }

    @Override
    public void reprendreCarte() {
        System.out.println("La machine est vide. Impossible de reprendre la carte.");
    }

}

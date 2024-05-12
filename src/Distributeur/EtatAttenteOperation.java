package Distributeur;

public class EtatAttenteOperation {

	private Distributeur distributeur;

    public EtatAttenteOperation(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    public void insererCarte(Carte client) {
        System.out.println("Opération en cours, veuillez patienter");
    }


}

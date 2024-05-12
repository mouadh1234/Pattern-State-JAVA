package Distributeur;


public class EtatPasDeCarte implements EtatDistributeur{
	 private Distributeur distributeur;

	    public EtatPasDeCarte(Distributeur distributeur) {
	        this.distributeur = distributeur;
	    }
	    @Override
	    public void insererCarte(Carte client) {
	        System.out.println("Carte insérée");
	        distributeur.setEtat(new EtatAttenteCode(distributeur));
	        distributeur.setCarte(client);
	    }

	    public void entrerCode(String code) {
	        System.out.println("Veuillez insérer d'abord votre carte.");
	    }

	    public void retirerArgent() {
	        System.out.println("Aucune carte insérée. Opération de retrait d'argent impossible.");
	    }

	    public void reprendreCarte() {
	        System.out.println("Aucune carte insérée. Rien à reprendre.");
	    }
}

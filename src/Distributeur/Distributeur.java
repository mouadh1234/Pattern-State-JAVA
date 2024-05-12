package Distributeur;


public class Distributeur {
	private EtatDistributeur etat;
    private Carte carte;
    private int tentatives;
    private int stockArgent;


    public Distributeur() {
    	etat = new EtatPasDeCarte(this);
        tentatives = 0;
        stockArgent = 10; 
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public Carte getCarte() {
        return carte;
    }

    public int getStockArgent() {
        return stockArgent;
    }

    public void setStockArgent(int stockArgent) {
        this.stockArgent = stockArgent;
    }

    public void incrementerTentatives() {
        tentatives++;
    }

    public int getTentatives() {
        return tentatives;
    }
    public void setEtat(EtatDistributeur nouvelEtat) {
        this.etat = nouvelEtat;
    }
    public void ejecterCarte() {
        this.carte = null;
    }


    public void insererCarte(Carte client) {
        etat.insererCarte(client);
    }

    public void entrerCode(String code) {
        etat.entrerCode(code);
    }

    public void retirerArgent() {
        if (stockArgent > 0) {
            System.out.println("Retrait d'argent effectué avec succès.");
            stockArgent--;
        } else {
            setEtat(new EtatMachineVide(this));
        }
    }


    public void reprendreCarte() {
        etat.reprendreCarte();
    }

	public void setEtat(EtatAttenteCode etatAttenteCode) {
        this.etat = (EtatDistributeur) etatAttenteCode;

	}
	public void lire_solde_compte() {
        if (etat instanceof EtatAttenteOperation) {
            System.out.println("Votre solde est X euros.");
        } else {
            System.out.println("Opération non autorisée en dehors du mode En_Attente_Pour_Retirer_Argent.");
        }
    }

	
	
	
}

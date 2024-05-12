package Distributeur;

public class EtatAttenteCode implements EtatDistributeur {
	private Distributeur distributeur;

    public EtatAttenteCode(Distributeur distributeur) {
        this.distributeur = distributeur;
    }
    @Override

    public void insererCarte(Carte client) {
        System.out.println("Il y a déjà une carte insérée");
    }

	@Override
	public void entrerCode(String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirerArgent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reprendreCarte() {
		// TODO Auto-generated method stub
		
	}

}

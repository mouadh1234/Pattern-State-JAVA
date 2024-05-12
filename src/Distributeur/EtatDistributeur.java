package Distributeur;

public interface EtatDistributeur {
	void insererCarte(Carte client);
    void entrerCode(String code);
    void retirerArgent();
    void reprendreCarte();
}

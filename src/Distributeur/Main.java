package Distributeur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distributeur distributeur = new Distributeur();

	       
        Carte carteClient = new Carte("1234");  

       
        System.out.println("Le client insère la carte :");
        distributeur.insererCarte(carteClient); 

        System.out.println("\nLe client entre le code :");
        distributeur.entrerCode("1234");

        System.out.println("\nLe client retire de l'argent :");
        distributeur.retirerArgent();

        System.out.println("\nLe client reprend la carte :");
        distributeur.reprendreCarte(); 
        
        distributeur.insererCarte(carteClient);

       
        distributeur.entrerCode("1234");

        
        distributeur.lire_solde_compte();

       
        distributeur.retirerArgent();

        
        distributeur.reprendreCarte();
	}

}

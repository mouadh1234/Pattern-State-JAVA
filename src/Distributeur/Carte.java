package Distributeur;

public class Carte {
	private String codeSecret;

    public Carte(String codeSecret) {
        this.codeSecret = codeSecret;
    }

    public boolean verifierCode(String code) {
        return code.equals(codeSecret);
    }
}

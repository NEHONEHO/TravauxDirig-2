package exercice5td3;

public class Avion extends Vehicule{
	private int nbMoteur;
	
	public Avion(int nbP) {
		super(nbP);
	}
	
	
	
	public Avion(int nbP, int nbMoteur) {
		super(nbP);
		this.nbMoteur = nbMoteur;
	}
	
}

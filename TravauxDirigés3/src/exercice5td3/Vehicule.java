package exercice5td3;

public class Vehicule {
	private int nbPassager;
	private int n;
	
	public Vehicule(int n) {
		this.n = n;
	}
	
	public String toString() {
		return "le nombre de passager est: "+nbPassager;
	}
}

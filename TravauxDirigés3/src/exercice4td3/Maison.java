package exercice4td3;

public class Maison extends Batiment{

	private int nbChambres;
	
	public Maison() {}
	
	public Maison(String adresse, int nbChambres) {
		super(adresse);
		this.nbChambres = nbChambres;
	}
	
	public int getNbChambres() {
		return nbChambres;
	}
	
	public void setNbChambres(int nbChambres) {
		this.nbChambres = nbChambres;
	}
	
	public String toString() {
		return "Cette maison est d'adresse "+getAdresse()+", elle comporte "+nbChambres+" chambre(s)";
	}
}

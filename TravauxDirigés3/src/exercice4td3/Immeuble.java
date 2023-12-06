package exercice4td3;

public class Immeuble extends Batiment{
	private int nbAppart;
	
	public Immeuble() {}
	
	public Immeuble(String adresse, int nbAppart) {
		super(adresse);
		this.nbAppart = nbAppart;
	}
	
	public int getNbAppart() {
		return nbAppart;
	}
	
	public void setNbAppart(int nbAppart) {
		this.nbAppart = nbAppart;
	}
	
	public String toString() {
		return"l'adresse de l'immeuble est "+getAdresse()+", il comporte "+nbAppart+" appartement(s)";
	}
}

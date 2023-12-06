package exercice4td3;

public class Batiment {
	
	private String adresse;
	
	public Batiment() {}
	
	public Batiment(String adresse) {
		this.adresse = adresse;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String toString() {
		return "l'adresse du batiment est "+adresse;
	}
	
}

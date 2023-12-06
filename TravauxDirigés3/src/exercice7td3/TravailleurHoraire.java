package exercice7td3;

public class TravailleurHoraire extends Employe{
	private double retribution;
	private int heures;
	
	public TravailleurHoraire() {}
	
	public TravailleurHoraire(String nom, String prenom, double retribution) {
		super(nom, prenom);
		this.retribution = retribution;
	}
	
	public double getRetribution() {
		return retribution;
	}
	
	public void setRetribution(double retribution) {
		this.retribution = retribution;
	}
	
	public double getHeures() {
		return heures;
	}
	
	public void setHeures(int heures) {
		this.heures = heures;
	}
	
	@Override
	public String toString() {
		return "Nom: "+getNom()+"\nPrènom: "+getPrenom()+"\nRètribution: "+retribution;
	}
	
	@Override
	public double gains() {
		return retribution;
	}
}








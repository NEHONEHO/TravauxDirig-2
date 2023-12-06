package exercice7td3;

public class Patron extends Employe{
	private double salaire;
	
	public Patron() {}
	
	public Patron(String nom, String prenom, double salaire) {
		super(nom,prenom);
		this.salaire = salaire;
	}
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "Nom du patron: "+getNom()+"\n"+"Prénom du patron: "+getPrenom();
	}
	
	@Override
	public double gains() {
		return salaire;
	}
}

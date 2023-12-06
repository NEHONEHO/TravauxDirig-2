package exercice7td3;

public class TravailleurCommission extends Employe{
	private double salaireMensuel;
	private double commission;
	private int quantite;
	
	public TravailleurCommission() {}
	
	public TravailleurCommission(String nom, String prenom, double salaireMensuel, double commission) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
		this.commission = commission;
	}
	
	public double getSalaireMensuel() {
		return salaireMensuel;
	}
	
	public void seSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	public double getCommission() {
		return commission;
	}
	
	public void seCommission(double commission) {
		this.commission = commission;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	@Override
	public String toString() {
		return "Nom: "+getNom()+"\nPrenom: "+getPrenom()+"\nSalaire mensuel: "+salaireMensuel;
	}
	
	public  double gains() {
		return salaireMensuel + commission;
	}
}

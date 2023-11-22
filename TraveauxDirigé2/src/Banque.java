
public class Banque {
	private int NCompte;
	private double Solde;
	private String CIN;
	
	public Banque(int NCompte,double Solde,String CIN) {
		this.NCompte = NCompte;
		this.Solde = Solde;
		this.CIN = CIN;
	}
	
	public void setNCompte(int NCompte) {
		this.NCompte = NCompte;
	}
	
	public int getNCompte() {
		return NCompte;
	}
	
	public void setSolde(int Solde) {
		this.Solde = Solde;
	}
	
	public double getSolde() {
		return Solde;
	}
	
	public void setCIN(String CIN) {
		this.CIN = CIN;
	}
	
	public String getCIN() {
		return CIN;
	}
	
	public void deposer (float Somme) {
		Solde += Somme;
	}
	
	public void retirer (float Somme) {
		Solde -= Somme;
	}
	
	public double avoirSolde() {
		return Solde;
	}
	
	public String toString() {
		return "information sur votre compte: Numéro de compt: "+NCompte+
				", solde: "+Solde+", CIN: "+CIN;
	}
	
	public static void main(String[] args) {
		Banque  compte = new Banque(1,5000.75,"AB 1200");
		System.out.println(compte);
		System.out.println(compte.avoirSolde());
		
		compte.deposer(500);
		
		System.out.println(compte);
		System.out.println(compte.avoirSolde());
		
		compte.retirer(200);
		
		System.out.println(compte);
		System.out.println(compte.avoirSolde());
	}
}

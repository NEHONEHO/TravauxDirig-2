
public class Livre {
	private String titre;
	private String auteur;
	private double prix;
	private int année;
	
	public Livre() {}
	
	public Livre(String titre) {
		this.titre = titre;
	}
	
	public Livre(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
	}
	
	public Livre(String titre, String auteur, double prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	public Livre(String titre, String auteur, double prix, int année) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.année = année;
	}
	
	public Livre(Livre livre) {
		this.titre = livre.titre;
		this.auteur = livre.auteur;
		this.prix = livre.prix;
		this.année = livre.année;
	}
	
	public String gettitre() {
		return titre;
	}
	
	public void settitre(String titre) {
		this.titre = titre;
	}
	
	public String getauteur() {
		return auteur;
	}
	
	public void setauteur(String auteur) {
		this.auteur = auteur;
	}
	
	public double getprix() {
		return prix;
	}
	
	public void setprix(double prix) {
		this.prix =prix;
	}
	
	public int getannée() {
		return année;
	}
	
	public void setannée(int année) {
		this.année = année;
	}
	
	public String toString() {
		return "Information sur le livre: titre: "+titre+", auteur: "+auteur+", prix: "+prix+"année: "+année;
		
	}
	

	public static void main(String[] args) {
		Livre livre1 = new Livre("Dernier jour d'un condamné","Victor Hugo",100,1853);
		Livre livre2 = new Livre(livre1);
		System.out.println("Livre 1 : " + livre1);
        System.out.println("Livre 2 (copie de Livre 1) : " + livre2);

        livre2.setprix(8.99);
        livre2.setannée(2000);

        System.out.println("Livre 2 après modification : " + livre2);
	}
}


public class Rectangle {
	private double longueur;
	private double largeur;
	
	public Rectangle() {}
	
	public Rectangle(double longueur,double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public Rectangle(Rectangle rectangle) {
		this.longueur = rectangle.longueur;
		this.largeur = rectangle.largeur;
	}
	
	public void setlongueur(double longueur) {
		if(longueur >=0) {
			this.longueur = longueur;
		}
	}
	
	public double getlongueur() {
		return longueur;
	}
	
	public void setlargeur(double largeur) {
		if(largeur >=0) {
			this.largeur = largeur;
		}
	}
	
	public double getlargeur() {
		return largeur;
	}
	
	public double perimetre() {
		return 2 * (longueur + largeur);
	}
	
	public double aire() {
		return longueur * largeur;
	}
	
	public void isCarre() {
		if(longueur == largeur) {
			System.out.println("c'est un carré");
		}
		
		else {
			System.out.println("c'est un rectangle");
		}
	}
		
		public String toString() {
		    return "Ce rectangle a une largeur de " + largeur + ", une longueur de " + longueur +
		           ", un périmètre de " + perimetre() + " et une aire de " + aire() + ".";
		}
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5,7);
		
		rectangle.perimetre();
		rectangle.aire();
		rectangle.isCarre();
		
		System.out.println(rectangle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

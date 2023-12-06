package exercice6td3;

public abstract class Figure {
	
	String nom;
	
	public abstract double getPerimeter();
	
	public abstract double getAire();
	
	@Override
    public String toString() {
        return "Nom de la figure: " + nom;
    }
}

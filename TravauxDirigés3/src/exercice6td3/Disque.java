package exercice6td3;

import exercice1td3.PointA;

public class Disque extends Figure{
	private PointA centre;
	private double rayon;
	
	public Disque() {}
	
	public Disque(PointA centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Disque(PointA centre, double rayon, String nom) {
		this.centre = centre;
		this.rayon = rayon;
		this.nom = nom;
	}
	
	public PointA getCentre() {
		return centre;
	}
	
	public void setCentre(PointA centre) {
		this.centre = centre;	
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public void setRayon(double rayon) {
		this.rayon = rayon;	
	}
	
	
	public double getPerimeter() {
		return 2*3.14*rayon; 
	}
	
	public double getAire() {
		return 3.14* Math.pow(rayon,2);
	}
	
	
}

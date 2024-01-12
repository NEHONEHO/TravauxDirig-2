import java.util.Scanner;

import static java.lang.Math.sqrt;

public class exercice2td1 {
	 public static void main(String[] args) {
	        System.out.println("donner a, b et c:");
	        Scanner s= new Scanner(System.in);
	        int a= s.nextInt();
	        int b= s.nextInt();
	        int c= s.nextInt();
	        System.out.println("l'equation est : "+a+"X^2 + "+b+"X + "+c);
	        int D=(b*b)-(4*a*c);
	        if (D>0){
	            System.out.println("l'equation admet deux solutions :\nX1= "+ (-b-sqrt(D))/(2*a));
	            System.out.println("\nX2= "+ (-b+sqrt(D))/(2*a));
	        }
	        else if(D<0){
	            System.out.println("l'equation n'admet pas de solution dans R\n");

	        }
	        else {
	            System.out.println("l'equation admet une seule solution :\nX= "+ (-b)/(2*a));
	        }
	    }
}

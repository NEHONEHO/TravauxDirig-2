import java.util.Scanner;

public class exercice3td1 {
	public static void main(String[] args){
        System.out.println("Hello and welcome!");
        System.out.println("donner deux entiers :");
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("vos elements sont :\na= "+a+"\nb= "+b);
        System.out.println("press 1 pour savoir si la somme est paire\n" +
                "press 2 pour savoir si le produit est pair\n" +
                "press 3 pour connetre le signe de la somme \n" +
                "press 4 pour connaitre le signe du produit \n");
        int choix= s.nextInt();
        switch (choix){
            case 1: {
                if(((a+b)%2)==0) System.out.println("la somme est paire");
                else System.out.println("la somme est impaire");
            } break;
            case 2: {
                if(((a*b)%2)==0) System.out.println("le produit est pair");
                else System.out.println("le produit est impair");
            } break;
            case 3:{
                if((a+b)>=0) System.out.println("la somme est positive");
                else System.out.println("la somme est négative");
            } break;
            case 4: {
                if((a*b)>=0) System.out.println("le produit est positive");
                else System.out.println("le produit est négative");
            } break;
        }
    
}
}

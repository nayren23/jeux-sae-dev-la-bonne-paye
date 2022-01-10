package Launcher;

import java.util.Scanner;

public class Menu {
	
	public static Scanner saisie = new Scanner(System.in);
	
	public static void menue() {   // renvoie le choix juste affiche et  faire class jeu
	
	    System.out.println("LA BONNE PAYE");
	
	    int choix=0;   
	    
	    do {
	        System.out.println("1. Jouer");
	        System.out.println("2.Lire les regles");
	        System.out.println("3. Quitter\n");
	

	        do {

	            System.out.println("Saisissez votre choix entre 1 et 3: ");
	            choix=Integer.parseInt(saisie.nextLine());
	        }
	        while (choix!=1 && choix!=2 && choix !=3);
	
	        switch(choix) {
	
	
	        case 1 :
	        	int nbTours= 0;
	            System.out.println("La partie va commençer ! ");
	            
	            do {
	            	System.out.println("Choissiez le nombre de tours a joué");
	            	nbTours =Integer.parseInt(saisie.nextLine());
	            	
	            		if (nbTours <= 0)
	            			System.out.println("Le nombre de tour dois être supérieur à 0");
	            	
	            } while (nbTours <= 0);
	                   
	            	Lanceur.lancerJeu(nbTours);
	            	
	            break;
	
	        case 2 :
	            Regles.regles();
	            break;
	        }
	    }            
	    while (choix<3);
	    System.out.println("Au revoir :-) ");
	    saisie.close();    
	}

}

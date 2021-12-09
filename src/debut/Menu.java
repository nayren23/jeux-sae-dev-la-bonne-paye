package debut;

import java.util.Scanner;

public class Menu {

	public static void menue(Scanner saisie) {

		System.out.println("LA BONNE PAYE");

		int choix=0;			
		do {
			System.out.println("1. Jouer");
			System.out.println("2.Lire les regles");
			System.out.println("3. Afficher la plus grande valeur");
			System.out.println("4. Afficher la plus petite valeur");
			System.out.println("5. Quitter");


			System.out.println();
			System.out.println("Saisissez votre choix entre 1 et 5: ");
			do {
				choix=Integer.parseInt(saisie.nextLine());
				System.out.println("Saisissez votre choix entre 1 et 5: ");

			}
			while (choix!=1 && choix!=2 && choix !=3 && choix!=4 && choix!=5);

			switch(choix) {


			case 1 :
				System.out.println("La partie commence:");
				Joueurs.NomJoueur(saisie,Joueurs.VerificationsaisieNombreJoueurs(saisie));
				break;

			case 2 :
				Regles.regles(saisie);
				break;

			case 3 : 
				System.out.println("la plus grand valeur est de : 20" );

				break;

			case 4 : 
				System.out.println("la plus petite valeur est de : 0" );
				break;

			}
		}			
		while (choix<5);
		System.out.println("Au revoir :) ");

		saisie.close();	

	}

}

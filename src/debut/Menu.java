package debut;

import java.util.Scanner;

public class Menu {

	public static void menue(Scanner saisie) {

		System.out.println("LA BONNE PAYE");

		int choix=0;			
		do {
			System.out.println("1. Jouer");
			System.out.println("2.Lire les regles");
			System.out.println("3. Quitter\n");


			System.out.println("Saisissez votre choix entre 1 et 3: ");
			do {
				choix=Integer.parseInt(saisie.nextLine());
				System.out.println("Saisissez votre choix entre 1 et 3: ");

			}
			while (choix!=1 && choix!=2 && choix !=3);

			switch(choix) {


			case 1 :
				System.out.println("La partie commence:");
				Joueurs.NomJoueur(saisie,Joueurs.VerificationsaisieNombreJoueurs(saisie));
				break;

			case 2 :
				Regles.regles(saisie);
				break;
			}
		}			
		while (choix<3);
		System.out.println("Au revoir :-) ");
		saisie.close();	
	}
}

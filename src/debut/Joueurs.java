package debut;

import java.util.Scanner;

public class Joueurs {
	Scanner saisie = new Scanner(System.in);

	public static int VerificationsaisieNombreJoueurs (Scanner saisie) {
		int nombreJoueurs;
		System.out.println("Entrez le nombre de joueur");
		nombreJoueurs = Integer.parseInt(saisie.nextLine());
		while (nombreJoueurs<2 || nombreJoueurs>6) {
			System.out.println("Entrez le nombre de joueur");
			nombreJoueurs = Integer.parseInt(saisie.nextLine());
		}

		System.out.println("\nSuper!!! C'est parti \n");
		return nombreJoueurs;


	}


	public static String[] NomJoueur (Scanner saisie, int nombreJoueurs) {
		String []nomJoueurs;
		nomJoueurs = new String[nombreJoueurs-1] ;


		// Déclaration d'une variable de type tableau de String.
		// "création" du tableau pour pouvoir contenir nombreJoueurs-1 valeurs de type String.

		
		// remplissage du tableau
		for (int indiceNomJoueurs = 0 ; indiceNomJoueurs < nomJoueurs.length ; indiceNomJoueurs++) {  
			System.out.println("Saisir pseudo joueur  " + (indiceNomJoueurs+1) + " : ");
			nomJoueurs[indiceNomJoueurs] =saisie.nextLine();
		}
		
		// affichage du contenu du tableau avec un boucle for
		for (int indiceNomJoueurs = 0 ; indiceNomJoueurs< nomJoueurs.length ; indiceNomJoueurs++) {

			System.out.println("Le nom du joueur  " + (indiceNomJoueurs+1) + " est : " + nomJoueurs[indiceNomJoueurs]);
		}
		return nomJoueurs;

	}		



}

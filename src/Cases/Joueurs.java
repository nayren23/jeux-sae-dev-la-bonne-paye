package Cases;

import Launcher.LaBonnePaye;

public class Joueurs {

	//Programme pour verifier si les joueurs rentre bien un nb joueur compris entre 2 et 6 inclus
	public static int VerificationsaisieNombreJoueurs () { 
		int nombreJoueurs;
		System.out.println("Entrez le nombre de joueur ♟️");
		nombreJoueurs = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		while (nombreJoueurs<2 || nombreJoueurs>6) {
			System.out.println("Entrez un nombre de joueur compris entre 2 et 6 !! ");
			nombreJoueurs = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		}

		System.out.println("\nSuper!!! C'est parti \n");
		return nombreJoueurs;
	}


	//Programme pour creer un tableau contenant les noms des joueurs 
	public static String[] NomJoueur ( int nombreJoueurs) {
		String []nomJoueurs;
		nomJoueurs = new String[nombreJoueurs] ;


		// D�claration d'une variable de type tableau de String.
		// "cr�ation" du tableau pour pouvoir contenir nombreJoueurs-1 valeurs de type String.


		// remplissage du tableau
		for (int indiceNomJoueurs = 0 ; indiceNomJoueurs < nomJoueurs.length ; indiceNomJoueurs++) {  
			System.out.println("Saisir pseudo joueur  " + (indiceNomJoueurs+1) + " : ");
			nomJoueurs[indiceNomJoueurs] =LaBonnePaye.saisie.nextLine();

			while (nomJoueurs[indiceNomJoueurs]=="" || nomJoueurs[indiceNomJoueurs].length()<4 || nomJoueurs[indiceNomJoueurs].length()>12) { // faire quelque chose pour que les joueurs ont pas le meme pseudo
				System.out.println("Rentrez un pseudo compris entre 4 et 12 caractères !!");
				System.out.println("Saisir pseudo joueur  " + (indiceNomJoueurs+1) + " : ");
				nomJoueurs[indiceNomJoueurs] =LaBonnePaye.saisie.nextLine();
			}
		}

		// affichage du contenu du tableau avec un boucle for
		for (int indiceNomJoueurs = 0 ; indiceNomJoueurs< nomJoueurs.length ; indiceNomJoueurs++) {

			System.out.println("Le nom du joueur  " + (indiceNomJoueurs+1) + " est : " + nomJoueurs[indiceNomJoueurs]);
		}
		
		System.out.println();
		return nomJoueurs;
	}		
}

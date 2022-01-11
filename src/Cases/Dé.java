package Cases;

import Launcher.DonneesPartagees;

public class Dé {


	public static int dé () {
		int chiffreDe;

		DonneesPartagees.choixDuJoueur(" Appuyer sur 1 pour lancez le dé 🎲 !");
		chiffreDe =(int)(Math.random()* 6 +1);
		System.out.println("Wow "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  "+"vous avez fait  :" +chiffreDe );
		if ( chiffreDe == 6 ) {
			System.out.println("Bravo " + DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] +" remporte la cagnotte actuelle en faisant un 6 !"); 
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant] += DonneesPartagees.montantCagnotte ; 
			
			
			if ( DonneesPartagees.montantCagnotte==0) {
				System.out.println("C'est triste il  y a plus rien, mais l'important, c'est de participer hein :) !!");
				System.out.println("Une prochaine fois peut être");
				System.out.println();
			}
			
			if ( DonneesPartagees.montantCagnotte>0) {
				System.out.println("Hooo t'as de la chance regarde y a de l'argent à récuperer :) !!");
				System.out.println("C'est déjà ça nan soit heureux un peu !!!");
				DonneesPartagees.choixDuJoueur( DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] + "  "+ "Appuyer sur 1 pour récuperer la cagnotte   !!  ");

				System.out.println();
			}

			DonneesPartagees.montantCagnotte = 0;

		}

		DonneesPartagees.choixDuJoueur(" Appuyer sur 1 pour voir sur quel case vous avez atterrit !");

		return chiffreDe;
	}	
}


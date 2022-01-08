package Cases;

import Launcher.DonneesPartagees;

public class Dée {


	public static int dée () {
		int chiffreDée;

		DonneesPartagees.choixDuJoueur(" Appuyer sur 1 pour lancez le dée !");
		chiffreDée =(int)(Math.random()* 6 +1);
		System.out.println("Wow "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  "+"vous avez fait  :" +chiffreDée );
		if ( chiffreDée == 6 ) {
			System.out.println("Bravo " + DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] +" remporte la cagnotte actuelle en faisant un 6 !"); 
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant] += DonneesPartagees.montantCagnotte ; 
			DonneesPartagees.montantCagnotte = 0;
			if ( DonneesPartagees.montantCagnotte==0) {
				System.out.println("C'est triste il  y a plus rien, mais l'important, c'est de participer hein :) !!");
				System.out.println("Une prochaine fois peut être");
				System.out.println();
			}

		}

		DonneesPartagees.choixDuJoueur(" Appuyer sur 1 pour voir sur quel case vous avez atterrit !");

		return chiffreDée;
	}	
}


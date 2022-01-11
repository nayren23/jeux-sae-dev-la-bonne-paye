package Launcher;
import Affichage.Plateau;
import Cases.Dé;
import Cases.MenuEffetsCase;
public class Lanceur {



	public static void lancerJeu(int nbTours) {
		ParametragePartie.lancerJeu();
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 Le jeu va bientot débuter !");


		Plateau.afficher();


		System.out.println("Bravo à vous de commencez " + DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] + " !!");
		System.out.println();
		while (DonneesPartagees.compteurTour <= nbTours) {
			for ( DonneesPartagees.indexeJoueurCourant=0; DonneesPartagees.indexeJoueurCourant<= DonneesPartagees.nombreJoueurs-1;DonneesPartagees.indexeJoueurCourant++) {

				DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]+= Dé.dé();
				if (DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]>31) {
					DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]=31;
				}
				Plateau.afficher();
				MenuEffetsCase.menue();
				Plateau.afficher();

				Plateau.afficher();
				
				if ( DonneesPartagees.indexeJoueurCourant==DonneesPartagees.nombreJoueurs) {
					DonneesPartagees.indexeJoueurCourant=0;
				}

			}
			nbTours+=1;
		}
	}
}
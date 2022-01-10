package Launcher;
import Affichage.plateau;
import Cases.Dée;
import Cases.MenuEffetsCase;
import Launcher.ParamêtragePartie;
public class Lanceur {



	public static void lancerJeu(int nbTours) {
		ParamêtragePartie.lancerJeu();
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 Le jeu va bientot débuter !");


		plateau.afficher();


		System.out.println("Bravo à vous de commencez " + DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] + " !!");
		System.out.println();
		while (DonneesPartagees.compteurTour <= nbTours) {
			for ( DonneesPartagees.indexeJoueurCourant=0; DonneesPartagees.indexeJoueurCourant<= DonneesPartagees.nombreJoueurs-1;DonneesPartagees.indexeJoueurCourant++) {

				DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]+=Dée.dée();
				if (DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]>31) {
					DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]=31;
				}
				plateau.afficher();
				MenuEffetsCase.menue();
				plateau.afficher();

				plateau.afficher();


			}
		}
	}
}
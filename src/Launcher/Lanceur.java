package Launcher;
import Affichage.plateau;
import Cases.D�e;
import Cases.MenuEffetsCase;
import Launcher.Param�tragePartie;
public class Lanceur {



	public static void lancerJeu(int nbTours) {
		Param�tragePartie.lancerJeu();
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 Le jeu va bientot d�buter !");


		plateau.afficher();


		System.out.println("Bravo � vous de commencez " + DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] + " !!");
		System.out.println();
		while (DonneesPartagees.compteurTour <= nbTours) {
			for ( DonneesPartagees.indexeJoueurCourant=0; DonneesPartagees.indexeJoueurCourant<= DonneesPartagees.nombreJoueurs-1;DonneesPartagees.indexeJoueurCourant++) {

				DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]+=D�e.d�e();
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
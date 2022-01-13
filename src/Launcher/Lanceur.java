package Launcher;
import Affichage.AffichageBasiqueSupp;
import Affichage.Plateau;
import Cases.Dé;
import Cases.MenuEffetsCase;
public class Lanceur {



	public static void lancerJeu() {
		ParametragePartie.lancerJeu();
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 Le jeu va bientot débuter !");


		Plateau.afficher();


		System.out.println("Bravo à vous de commencez " + DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] + " !!");
		System.out.println();
		boolean fini = false;
		while (DonneesPartagees.compteurTour < DonneesPartagees.nbTours) {
			DonneesPartagees.indexeJoueurCourant=0;

			while(DonneesPartagees.indexeJoueurCourant<= DonneesPartagees.nombreJoueurs-1 && !fini) {

				DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]+= Dé.dé();

				if (DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]>31) {
					DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]=31;

				}

				Plateau.afficher();
				MenuEffetsCase.menue();
				if(DonneesPartagees.compteurTour == DonneesPartagees.nbTours)
					fini = true;
				Plateau.afficher();
				Plateau.afficher();
				DonneesPartagees.indexeJoueurCourant++;
			}
		}
		AffichageBasiqueSupp.gagnant();
	}
}
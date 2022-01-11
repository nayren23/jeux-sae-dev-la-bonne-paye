package Affichage;

import Launcher.DonneesPartagees;

public class AffichageBasiqueSupp {

	public static void affichageInfoJoueursEnBAsDuTableau() {
		System.out.println();
		for (int joueur=0 ; joueur<DonneesPartagees.nombreJoueurs;joueur++) {
			System.out.print("    "+DonneesPartagees.tabNomJoueur[joueur] + "  " +"vous avez : " + DonneesPartagees.tabArgentJoueur[joueur] +"  "+ "Euros " );
		}
		System.out.println();
	}
}

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

	public static void gagnant() {
		int indexeJoueurs=0;
		for (int i=0;i<DonneesPartagees.tabArgentJoueur.length-1;i++) {
			if (DonneesPartagees.tabArgentJoueur[i]<DonneesPartagees.tabArgentJoueur[i+1]) {
				indexeJoueurs=i+1;
			}
		}
		System.out.println("Le gagnant est " + DonneesPartagees.tabNomJoueur[indexeJoueurs] +"  avec " +DonneesPartagees.tabArgentJoueur[indexeJoueurs] +"€  bravo à lui !! \n" );
	}
}
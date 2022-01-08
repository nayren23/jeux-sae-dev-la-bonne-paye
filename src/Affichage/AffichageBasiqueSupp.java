package Affichage;

import java.util.Arrays;
import java.util.Comparator;
import Launcher.DonneesPartagees;

public class AffichageBasiqueSupp {

	public static void affichageInfoJoueursEnBAsDuTableau() {
		System.out.println();
		for (int joueur=0 ; joueur<DonneesPartagees.nombreJoueurs;joueur++) {
			System.out.print("    "+DonneesPartagees.tabNomJoueur[joueur] + "  " +"vous avez : " + DonneesPartagees.tabArgentJoueur[joueur] +"  "+ "Euros " );
		}
		System.out.println();
	}



	public static  void ClassementJoueursParArgent (int[][] ArgentJoueurs, final int columnNumber){
		
		Arrays.sort(ArgentJoueurs, new Comparator<int[]>() {
			public int compare(int[] first, int[] second) {
				if(first[columnNumber-1] > second[columnNumber-1]) return 1;
				else return -1;
			}
		});

		for (int x = 0 ; x < DonneesPartagees.tabArgentJoueursClassement().length  ; ++x) {
			for (int y = 1 ; y < DonneesPartagees.tabArgentJoueursClassement()[x].length ; y ++) {
				System.out.println(DonneesPartagees.tabArgentJoueursClassement()[x][y]);
			}

		} 
	}




}

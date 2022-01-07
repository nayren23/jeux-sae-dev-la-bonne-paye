package Affichage;

import Launcher.DonneesPartagees;

public class AffichageBasiqueSupp {

	public static void affichageInfoJoueursEnBAsDuTableau() {
		System.out.println();
		for (int joueur=0 ; joueur<DonneesPartagees.nombreJoueurs;joueur++) {
			System.out.print("    "+DonneesPartagees.tabNomJoueur[joueur] + "  " +"vous avez : " + DonneesPartagees.tabArgentJoueur[joueur] + "Euros " );
		}
		System.out.println();
	}



//	public static  void Sort2DArrayBasedOnColumnNumber (int[][] array, final int columnNumber){
//
//
//		Arrays.sort(array, new Comparator<int[]>() {
//			public int compare(int[] first, int[] second) {
//				if(first[columnNumber-1] > second[columnNumber-1]) return 1;
//				else return -1;
//			}
//		});
//
//	}




}

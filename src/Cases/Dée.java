package Cases;

import Launcher.DonneesPartagees;

public class D�e {


	public static int d�e () {
		int chiffreD�e;

		DonneesPartagees.choixDuJoueur(" Appuyer sur 1 pour lancez le d�e !");
		chiffreD�e =(int)(Math.random()* 20 +1);
		System.out.println("Wow "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  "+"vous avez fait  :" +chiffreD�e );
		if ( chiffreD�e == 6 ) {
			System.out.println("Bravo " + DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] +" remporte la cagnotte actuelle en faisant un 6 !"); 
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant] += DonneesPartagees.montantCagnotte ; 
			
			
			if ( DonneesPartagees.montantCagnotte==0) {
				System.out.println("C'est triste il  y a plus rien, mais l'important, c'est de participer hein :) !!");
				System.out.println("Une prochaine fois peut �tre");
				System.out.println();
			}
			
			if ( DonneesPartagees.montantCagnotte>0) {
				System.out.println("Hooo t'as de la chance regarde y a de l'argent � r�cup�rer :) !!");
				System.out.println("C'est d�j� �a nan soit heureux un peu !!!");
				System.out.println();
			}

			DonneesPartagees.montantCagnotte = 0;

		}

		DonneesPartagees.choixDuJoueur(" Appuyer sur 1 pour voir sur quel case vous avez atterrit !");

		return chiffreD�e;
	}	
}


package Cases;

import Affichage.Plateau;
import Cartes.CartesAcquisition;
import Launcher.DonneesPartagees;
import Launcher.LaBonnePaye;

public class CaseVendre {


	public static boolean verifCartesAcquisition() {
		boolean carteAcquisitions=false;

	
		for (int x = 0 ; x < DonneesPartagees.cartesAcquisitions.length  ; ++x) {
			for (int y = 1 ; y < DonneesPartagees.cartesAcquisitions[x].length ; y ++) {
				if		(DonneesPartagees.cartesAcquisitions[x][4].equals(""+DonneesPartagees.indexeJoueurCourant))
					carteAcquisitions=true;
			}
		}
		return carteAcquisitions;

	}

	public static boolean choixDuJoueur() {
		
		boolean choixJoueur=false;
		
		
		if (verifCartesAcquisition()==true) {

		int choix;

		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"Voulez vous vendre vos acquisitions ?");
		System.out.println("1 pour oui, 0 pour non");
		choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		while (choix<0 || choix>1) {
			System.out.println("Entrez 0 ou 1 !! ");
			choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		}
		if (choix == 0)
			System.out.println("Dommage c'était un choix de qualité");
		if (choix == 1)
			choixJoueur=true;

		}
		return choixJoueur;

	}


	public static void vendre () {
		
		if (verifCartesAcquisition()==false) {
			System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  "+"Vous n'avez pas de cartes d'acquisition pour le moment, revenez quand vous en aurez !!");
			DonneesPartagees.choixDuJoueur("Appuyer sur 1 pour laisser le prochain joueur jouer  !!  ");
		}
			if (choixDuJoueur()==true) {
		for (int indiceCarte=0 ; indiceCarte<DonneesPartagees.cartesAcquisitions.length ; indiceCarte++) {
			while (DonneesPartagees.cartesAcquisitions[indiceCarte][4].equals(""+DonneesPartagees.indexeJoueurCourant)) {
				CartesAcquisition.dessinCarte(DonneesPartagees.cartesAcquisitions[indiceCarte]);
				DonneesPartagees.choixDuJoueur("Appuyer sur 1 pour effectuer la transactions  !!  ");
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=Integer.parseInt(DonneesPartagees.cartesAcquisitions[indiceCarte][2]) ;
				DonneesPartagees.cartesAcquisitions[indiceCarte][4]="-1" ;
				System.out.println("Bravo vous avez vendu toutes vos acquisitions");
			}
			
			
		}
		Plateau.afficher();
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 pour laisser le prochain joueur jouer  !!  ");

		}

		System.out.println("Salut c'est un test j'affiches le tab modifie");
		for (int x = 0 ; x < DonneesPartagees.cartesAcquisitions.length  ; ++x) {
			for (int y = 1 ; y < DonneesPartagees.cartesAcquisitions[x].length ; y ++) {
				System.out.println(DonneesPartagees.cartesAcquisitions[x][y]);
			}
		}	
		
		

	}
}


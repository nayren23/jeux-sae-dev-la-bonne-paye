package Cases;

import Launcher.DonneesPartagees;
import Launcher.LaBonnePaye;
import Affichage.Plateau;

public class Lotterie {


	public static void effetCaseLotterie () {
		DonneesPartagees.indexeJoueurCourantLoterie=0;
		int prono;
		int chiffreDée;
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] + " Est tombé sur la case lotterie la participation est de 100 euros , et vous gagnez 1000 euros si vous gagnez !!\nVoudrez vous participez ?");
		System.out.println("Vous avez tous une chance de gagner et de partiper mais seulement qu'une seule fois"); 
		for ( DonneesPartagees.indexeJoueurCourantLoterie = 0; DonneesPartagees.indexeJoueurCourantLoterie<= DonneesPartagees.nombreJoueurs-1;DonneesPartagees.indexeJoueurCourantLoterie++) {

			if ( choixDuJoueurLoterie("voulez vous participez ?") ) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourantLoterie]-=100;

				do {
					System.out.println("Faites votre pronostic sur le chiffre que vous allez faire au dée ( entre 1 et 6 )");
					prono=Integer.parseInt(LaBonnePaye.saisie.nextLine());
				}while (prono <1 || prono >6); 

				chiffreDée = lancerDe();
				System.out.println("Vous avez fait :"+ chiffreDée + " au dé");
				choixDuJoueurLoterie("Appuyer sur 1 pour laissez le porchain joueur jouez !!!");
				Plateau.afficher();
				if (prono == chiffreDée ) {
					System.out.println(" F�licitation vous avez gaagnez � la lotterie. \n Vous recevrez 1000 euros de la Banque !!");
					DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourantLoterie] += 1000;
					choixDuJoueurLoterie("Appuyer sur 1 pour laissez le prochain joueur jouez !!!");
				} 
				else {
					System.out.println("Sniff vous n'avez pas gagner 😢");
					System.out.println("Vous aurez plus de chance la prochaine fois");
					choixDuJoueurLoterie("Appuyer sur 1 pour laissez le prochain joueur jouez !!!");
				}  
			} 

		}
	}

	public static int lancerDe () {
		int chiffreDe;
		choixDuJoueurLoterie(" Appuyer sur 1 pour lancez le dée 🎲 !");
		chiffreDe =(int)(Math.random()* 6 +1);
		return chiffreDe;
	}


	public static boolean choixDuJoueurLoterie(String premierChoix) {
		boolean choixJoueur=false;
		int choix;

		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourantLoterie]+ "  "+premierChoix );
		System.out.println("1 pour oui, 0 pour non");
		choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		while (choix<0 || choix>1) {
			System.out.println(DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourantLoterie]+ "  "+"Entrez 0 ou 1 !! ");
			choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		}
		if (choix == 1)
			choixJoueur=true;

		return choixJoueur;
	}
	
	
}
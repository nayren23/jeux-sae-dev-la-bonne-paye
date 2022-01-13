package Launcher;

import Cases.Joueurs;

public class ParametragePartie {

	public static void choixManches() {
		DonneesPartagees.nbTours= 0;
		System.out.println("La partie va commencer ! ");

		do {
			System.out.println("Choissiez le nombre de tours a joué");
			DonneesPartagees.nbTours =Integer.parseInt(LaBonnePaye.saisie.nextLine());
			if (DonneesPartagees.nbTours <= 0)
				System.out.println("Le nombre de tour dois être supérieur à 0");

		} 
		while (DonneesPartagees.nbTours <= 0);
		Lanceur.lancerJeu();
	}


	public static void lancerJeu() {
		DonneesPartagees.nombreJoueurs= Joueurs.VerificationsaisieNombreJoueurs(); //met le nombre de joueurs dans donnee partager
		DonneesPartagees.tabNomJoueur=Joueurs.NomJoueur( DonneesPartagees.nombreJoueurs);
		DonneesPartagees.indexeJoueurCourant=0;//le premier Joueur et celui qui a l'index 0 pret a jouer
		DonneesPartagees.tabcaseActuelleJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.tabArgentJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.tabNombreAcquisitionsJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.montantCagnotte=0;//cagnotte mise a 0euros
		DonneesPartagees.creerCartesAcquisitions(); //initialisations du tableau création cartes acquisitions
		DonneesPartagees.compteurTour=0;

		//	DonneesPartagees.tabNombrePretsJoueur=new int[DonneesPartagees.nombreJoueurs]; //extension probable
		//	DonneesPartagees.tabMontantEpargneJoueur=new int[DonneesPartagees.nombreJoueurs];//extension probable


		//Initialisation des donnees partager avant le  debut  de la partie
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			DonneesPartagees.tabcaseActuelleJoueur[i]=0;//tous les joueurs sur la case depart
			DonneesPartagees.tabArgentJoueur[i]=3000;//chaque jouer recoit 3000euros
			DonneesPartagees.tabNombreAcquisitionsJoueur[i]=0; //chaque joueur possede 0 acquisition
			//			DonneesPartagees.tabNombrePretsJoueur[i]=0;//chaque joueur a 0 pret				 //extension probable
			//			DonneesPartagees.tabMontantEpargneJoueur[i]=0;//chaque joueur a 0 euros epargner //extension probable
		}
	}
}
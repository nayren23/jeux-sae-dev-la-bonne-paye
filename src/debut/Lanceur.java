package debut;

public class Lanceur {


	public static void lancerJeu() {
		DonneesPartagees.nombreJoueurs= Joueurs.VerificationsaisieNombreJoueurs(); //met le nombre de joueurs dans donnee partager
		DonneesPartagees.tabNomJoueur=Joueurs.NomJoueur( DonneesPartagees.nombreJoueurs);
		DonneesPartagees.indexeJoueurCourant=0;//le premier Joueur et celui qui a l'index 0 pret a jouer

		//System.out.println("debug tab des noms des "+DonneesPartagees.nombreJoueurs+ " joueurs");

		DonneesPartagees.tabcaseActuelleJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.tabArgentJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.tabNombreAcquisitionsJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.tabNombrePretsJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.tabMontantEpargneJoueur=new int[DonneesPartagees.nombreJoueurs];
		DonneesPartagees.montantCagnotte=0;//cagnotte mise a 0euros
		DonneesPartagees.creerCartesAcquisitions();
		//Initialisation des donnees partager avant le  debut  de la partie
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			DonneesPartagees.tabcaseActuelleJoueur[i]=0;//tous les joueurs sur la case depart
			DonneesPartagees.tabArgentJoueur[i]=5000;//chaque jouer recoit 1500euros
			DonneesPartagees.tabNombreAcquisitionsJoueur[i]=0; //chaque joueur possede 0 acquisition
			DonneesPartagees.tabNombrePretsJoueur[i]=0;//chaque joueur a 0 pret
			DonneesPartagees.tabMontantEpargneJoueur[i]=0;//chaque joueur a 0 euros epargner
		}
//		for (int compteurManche=0; compteurManche<10; compteurManche++) {
//		for (int i=0;i<DonneesPartagees.nombreJoueurs;i++) {
//			plateau.afficher();
//			DonneesPartagees.tabcaseActuelleJoueur[i]=MenuEffetsCase.lancementDes(saisie);//tous les joueurs sur la case depart
//			plateau.afficher();
//			MenuEffetsCase.menue();
//			plateau.afficher();
//			DonneesPartagees.indexeJoueurCourant+=1;
//			if (DonneesPartagees.indexeJoueurCourant>DonneesPartagees.nombreDesJoueurs-1) {
//				DonneesPartagees.indexeJoueurCourant=0;
//			}
//			compteurManche++;
//		}
//		
//		}
		
		
//		{	plateau.afficher();
//		DonneesPartagees.tabcaseActuelleJoueur[0]=4;//tous les joueurs sur la case depart
//		MenuEffetsCase.menue();
//		plateau.afficher();
//		}
		
		
		
		
		{	DonneesPartagees.tabcaseActuelleJoueur[0]=9;//tous les joueurs sur la case depart
		MenuEffetsCase.menue();
		plateau.afficher();}

		
//				
//		
//		{	DonneesPartagees.tabcaseActuelleJoueur[2]=4;//tous les joueurs sur la case depart
//		DonneesPartagees.indexeJoueurCourant+=1;
//		MenuEffetsCase.menue();
//		plateau.afficher();}
//		
//		{DonneesPartagees.tabcaseActuelleJoueur[3]=4;//tous les joueurs sur la case depart
//		DonneesPartagees.indexeJoueurCourant+=1;
//		MenuEffetsCase.menue();
//		plateau.afficher();}
//		
//		{DonneesPartagees.tabcaseActuelleJoueur[4]=4;//tous les joueurs sur la case depart
//		DonneesPartagees.indexeJoueurCourant+=1;
//		MenuEffetsCase.menue();
//		plateau.afficher();}
//
//		{DonneesPartagees.tabcaseActuelleJoueur[5]=4;//tous les joueurs sur la case depart
//		DonneesPartagees.indexeJoueurCourant+=1;
//		MenuEffetsCase.menue();
//		plateau.afficher();
//	
//		}
//		
//	



	}

}

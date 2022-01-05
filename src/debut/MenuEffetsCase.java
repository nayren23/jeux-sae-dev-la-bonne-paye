package debut;

import java.util.Scanner;

public class MenuEffetsCase {

	public static void menue() {   // renvoie le choix juste affiche et  faire class jeu

		switch(DonneesPartagees.tabcaseActuelleJoueur[DonneesPartagees.indexeJoueurCourant]) { 


		case 1 :
			EffetCases.case1Courrier();
			break;

		case 2 :
			EffetCases.caseConcoursBeaute();
			break;

		case 3 :
			EffetCases.case3Courrier();
			break;

		case 4 :
			EffetCases.caseAcquisition();
			break;

		case 5 :
			EffetCases.case2Courrier();
			break;

		case 6 :
			EffetCases.caseFamille();
			break;

		case 7 :
			EffetCases.caseDetendezVous();
			break;

		case 8 :
			EffetCases.caseCaisseElectoral();
			break;

		case 9 :
			CaseVendre.vendre();
			break;

		case 10 :
			EffetCases.caseAnniversaire();
			break;

		case 11 :
			EffetCases.case1Courrier();
			break;

		case 12 :
			EffetCases.caseAcquisition();
			break;

			//		case 13 :
			//			EffetCases.caseConcoursBeaute();
			//			break;

		case 14 :
			EffetCases.caseJourneeBalade();
			break;

		case 15 :
			EffetCases.caseBricolage();
			break;

		case 16 :
			EffetCases.case3Courrier();
			break;

		case 17 :
			EffetCases.caseAcquisition();
			break;

		case 18 :
			EffetCases.case1Courrier();
			break;

		case 19 :
			EffetCases.caseShopping();
			break;

		case 20 :
			CaseVendre.vendre();
			break;

		case 21 :
			EffetCases.caseBricolageAuJardin();
			break;

			//		case 22 :
			//			EffetCases.caseConcoursBeaute();
			//			break;

		case 23 :
			CaseVendre.vendre();
			break;

		case 24 :
			EffetCases.case1Courrier();
			break;

		case 25 :
			EffetCases.caseAcquisition();
			break;

		case 26 :
			EffetCases.caseChangementDheure();
			break;

		case 27 :
			EffetCases.case2Courrier();
			break;

		case 28 :
			EffetCases.caseRestezCool();
			break;

		case 29 :
			CaseVendre.vendre();
			break;

			//		case 30 :
			//			EffetCases.caseConcoursBeaute();
			//			break;

		case 31 :
			EffetCases.caseJourDePaye();
			break;

		}



	}
	public static int lancementDes (Scanner saisie) {
		int choix;
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  a vous de lancer le des");
		System.out.println("Saisissez 1 pour lancer le ");
		choix = Integer.parseInt(saisie.nextLine());
		while (choix!=1) {
			System.out.println("Entrez 1 !! ");
			choix = Integer.parseInt(saisie.nextLine());
		}		
		DonneesPartagees.nombreDesJoueurs= (int)(Math.random()*(6-1));
		System.out.println("Vous avez fait " + DonneesPartagees.nombreDesJoueurs);
		return DonneesPartagees.nombreDesJoueurs;		
	}
}







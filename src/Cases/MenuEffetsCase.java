package Cases;

import Launcher.DonneesPartagees;

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
			EffetCases.caseVendez();
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

		case 13 :
			EffetCases.caseQuoiDeNeuf();
			break;

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
			EffetCases.caseVendez();
			break;

		case 21 :
			EffetCases.caseBricolageAuJardin();
			break;

		case 22 :
			EffetCases.caseQuoiDeNeuf();
			break;

		case 23 :
			EffetCases.caseVendez();
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
			EffetCases.caseVendez();
			break;

		case 30 :
			Lotterie.effetCaseLotterie();
			break;

		case 31 :
			EffetCases.caseJourDePaye();
			break;
		}
	}
}
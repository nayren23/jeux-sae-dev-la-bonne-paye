package debut;

public class EffetCases {
	
	public static void case1Courrier/*case1*/ () {
		CartesCourrier.effetCartesCourrier();
		//CartesCourrier.menueAleatoireCourrier(CartesCourrier.recupererCartesCourrier(),0);

	}

	public static void caseConcoursBeaute/*case2*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Concours de Beaute !!");

		System.out.println("Bravo : "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  , votre chien Toutou remporte 1500 euros � un concours de beaut� !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+1500);
	}
	
	public static void case3Courrier/*case3*/ () {
		CartesCourrier.effetCartesCourrier();
		CartesCourrier.effetCartesCourrier();
		CartesCourrier.effetCartesCourrier();
	}
	
	

	public static void caseAcquisition/*case4...*/ () {
		CartesAcquisition.effetCartesAcquisitions();
	}
	
	public static void case2Courrier/*case5*/ () {
		CartesCourrier.effetCartesCourrier();
		CartesCourrier.effetCartesCourrier();
		CartesCourrier.effetCartesCourrier();
	}
	
	public static void caseFamille/*case6*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case sortie en famille  !!");

		System.out.println("Ho non " +DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous �tes tomb� sur la case sortie en famille payer 150 euros !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-150);
	}

	public static void caseDetendezVous/*case7*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  , c'est dimanche detendez-vous !!");
	}

	public static void caseCaisseElectoral/*case8*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Caisse Electoral c'est l'heure des elections  !!");

		System.out.println("Ho non tout le monde verse 150 euros � la cagnotte !!");
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			DonneesPartagees.tabArgentJoueur[i]=DonneesPartagees.tabArgentJoueur[i]-150;
		}
		DonneesPartagees.montantCagnotte+=DonneesPartagees.nombreJoueurs*150;

		System.out.println("Remercier "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]);
	}

	public static void caseAnniversaire/*case10*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Anniversaire  !!");

		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" chaque joueur vous verse 150 euros !!");
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			if (i!=DonneesPartagees.indexeJoueurCourant) {
				DonneesPartagees.tabArgentJoueur[i]-=150;

			}
		}
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=(DonneesPartagees.nombreJoueurs-1)*150;
	}

	public static void caseJourneeBalade/*case14*/ () {
		System.out.println("C'est dimanche journ�e de balade pour "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  !!");
	}
	
	
	public static void caseBricolage/*case15*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Bricolage  !!");
		System.out.println("Journee bricolage pour  " +DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" versez 150 euros  dans la cagnotte  !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-150);
		DonneesPartagees.montantCagnotte+=150;
	}

	public static void caseShopping/*case19*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Shopping  !!");

		System.out.println("Journee shopping pour  " +DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" depnsez  250 euros !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-250);
	}
	
	public static void caseBricolageAuJardin/*case21*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Bricolage au jardin  !!");

		System.out.println("Journ�e de bricolage au jardin pour "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  !!");
	}

	
	public static void caseChangementDheure/*case26*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Changement d'heure  !!");

		System.out.println("Tout le monde recule d'une case !!");
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			DonneesPartagees.tabcaseActuelleJoueur[i]=DonneesPartagees.tabcaseActuelleJoueur[i]-1;

		}
		System.out.println("Remercier "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]);
	}
	
	public static void caseRestezCool/*case28*/ () {
		System.out.println("C'est dimanche  "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" restez cool  en regardant Netflix  !!");
	}
	
//	public static void caseLoterie/*case30*/ (Scanner saisie) {
//		int veutJouer;
//		System.out.println("C'est la loterie !!");
//		int banque=10000;
//		System.out.println("La banque met 1000 euros et les joueurs 100 !!!");
//		System.out.println("Ceux qui veulent jouer saisissez 1 ");
//		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
//			System.out.println(DonneesPartagees.tabNomJoueur[i]+"Voulez vous jouez ?");
//			veutJouer = Integer.parseInt(saisie.nextLine());
//			if (veutJouer==0)
//		}
//		
//	}
	
	public static void caseJourDePaye/*case31*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous etes sur la case Jour de paye  !!");
		System.out.println("C'est le jour de paye chque joueur recoit 1500 euros et retourne � la case depart");
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			DonneesPartagees.tabcaseActuelleJoueur[i]=0;//tous les joueurs sur la case depart
			DonneesPartagees.tabArgentJoueur[i]+=1500;//chaque jouer recoit 1500euros
		}
	}	
	
	
	
}





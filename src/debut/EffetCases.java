package debut;

public class EffetCases {

	public static void caseConcoursBeaute/*case2*/ () {
		System.out.println("Bravo : "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  ,Toutou remporte 1500 euros à un concours de beauté !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+1500);
	}

	public static void caseFamille/*case6*/ () {
		System.out.println("Ho non " +DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" vous êtes tombé sur la case sortie en famille payer 150 euros !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-150);
	}

	public static void caseDetendezVous/*case7*/ () {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  ,detendez-vous !!");
	}

	public static void caseCaisseElectoral/*case8*/ () {
		System.out.println("Ho non tout le monde verse 150 euros à la cagnotte !!");
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			DonneesPartagees.tabArgentJoueur[i]=DonneesPartagees.tabArgentJoueur[i]-150;
		}
		DonneesPartagees.montantCagnotte=DonneesPartagees.nombreJoueurs*150;

		System.out.println("Remercier "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]);
	}

//	public static void caseAnniversaire/*case10*/ () {
//		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" chaque joueur vous verse 150 euros !!");
//		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
//			DonneesPartagees.tabArgentJoueur[i]=DonneesPartagees.tabArgentJoueur[i]-150;
//		}
//		DonneesPartagees.montantCagnotte=DonneesPartagees.nombreJoueurs*150;
//
//		System.out.println("Remercier "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]);
//	}

	public static void caseJourneeBalade/*case14*/ () {
		System.out.println("Journée de balade pour "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  !!");
	}
	
	
	public static void caseBricolage/*case15*/ () {
		System.out.println("Journee bricolage pour  " +DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" versez 150 euros  dans la cagnotte  !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-150);
		DonneesPartagees.montantCagnotte+=150;
	}

	public static void caseShopping/*case19*/ () {
		System.out.println("Journee shopping pour  " +DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" depnsez  250 euros !!");
		DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]=(DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-250);
	}
	
	public static void caseBricolageAuJardin/*case21*/ () {
		System.out.println("Journée de bricolage au jardin pour "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"  !!");
	}

	
	public static void caseChangementDheure/*case26*/ () {
		System.out.println("Tout le monde recule d'une case !!");
		for (int i=0; i<DonneesPartagees.nombreJoueurs;i++) {
			DonneesPartagees.tabcaseActuelleJoueur[i]=DonneesPartagees.tabcaseActuelleJoueur[i]-1;

		}
		System.out.println("Remercier "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]);
	}
	
	public static void caseRestezCool/*case28*/ () {
		System.out.println("Restez cool "+DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+" en regardant Netflix  !!");
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
}





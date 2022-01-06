package debut;

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
		if (verifCartesAcquisition()==false){
			System.out.println("Vous n'avez pas de cartes acquisitions pour le moments revenez quand vous en aurez !! ");
		}
		if (verifCartesAcquisition()==true) {

		int choix;

		System.out.println("Voulez vous vendre vos acquisition ?");
		System.out.println("1 pour oui, 0 pour non");
		choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		while (choix<0 || choix>1) {
			System.out.println("Entrez 0 ou 1 !! ");
			choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		}
		if (choix == 0)
			System.out.println("Dommage c'�tait un choix de qualit�");
		if (choix == 1)
			choixJoueur=true;

		}
		return choixJoueur;

	}


	public static void vendre () {

		if (choixDuJoueur()==true) {
		for (int indiceCarte=0 ; indiceCarte<DonneesPartagees.cartesAcquisitions.length ; indiceCarte++) {
			while (DonneesPartagees.cartesAcquisitions[indiceCarte][4].equals(""+DonneesPartagees.indexeJoueurCourant)) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=Integer.parseInt(DonneesPartagees.cartesAcquisitions[indiceCarte][2]) ;
				DonneesPartagees.cartesAcquisitions[indiceCarte][4]="-1" ;
				System.out.println("Bravo vous avez vendu toutes vos acquisitions");
			}
			
			
		}
		}

//		System.out.println("sah j'affiches le tab");
//		for (int x = 0 ; x < DonneesPartagees.cartesAcquisitions.length  ; ++x) {
//			for (int y = 1 ; y < DonneesPartagees.cartesAcquisitions[x].length ; y ++) {
//				System.out.println(DonneesPartagees.cartesAcquisitions[x][y]);
//			}
//		}	
		
		

	}
}


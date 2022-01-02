package debut;
import java.util.Scanner;

public class CartesAcquisition {


	static int carteNom=0;  // mettre maj kamel
	static int cartePrixAchat=1;
	static int carteValeurReelle=2;
	static int carteCommission=3;
	static int carteappartenanceDeLaCarte=4;


	/**
	 * fonction qui dessinne les cartes avec les valeurs des cartes qui changent
	 * @param carte
	 */
	public static void dessinCarte (String[]carte) {
		for (int i=0; i<carte.length;i++) {


		}

		System.out.println("				+ \" __________________________________\r\n"
				+ "				+ \"|	\""+ carte [0]  +" \"       |\r\n"
				+ "				+ \"|	                          	        |\r\n"
				+ "				+ \"|_________________________________	|\r\n"
				+ "				+ \"|	PRIX D'ACHATS  \"" + carte[1] +"\"euros\"     |\r\n"
				+ "				+ \"|	VALEUR REELLE  \"" + carte[2] +"\"euros\"     |\r\n"
				+ "				+ \"|	COMMISSION     \"" + carte[3] +"\"euros\"     |\r\n"
				+ "				+ \"|____________________________________|\");\r\n"
				+ "");
	}

	public static String[] creerCarteAcquisitions (String nom,  int prixAchat,int valeurReelle, int commission,int appartenanceDeLaCarte) {			//1 BELLE ANTIQUITE
		String[]carte = new String[5];
		carte [carteNom]= nom;
		carte [cartePrixAchat]= String.valueOf(prixAchat);
		carte [carteValeurReelle]= String.valueOf(valeurReelle);//caste int en string
		carte [carteCommission]=String.valueOf(commission) ;
		carte [carteappartenanceDeLaCarte]=String.valueOf(appartenanceDeLaCarte) ;


		return carte;
	}

	//tableau acquisition à la place de switch
	//tab deux dimensions chaque case acquisitions contient 1 acquisistion
	/**
	 * java doc
	 * @param cartes
	 */
	public static int  menueAleatoireAcquisitions(String [][] cartes) {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"Piochez une carte");
		DonneesPartagees.numeroCarteAcquisitions= (int)(Math.random()*(15));//fois une variable car carte diminue avec le jeu

		while(!DonneesPartagees.cartesAcquisitions[DonneesPartagees.numeroCarteAcquisitions][4].equals("-1")) {
			DonneesPartagees.numeroCarteAcquisitions= (int)(Math.random()*(15));//fois une variable car carte diminue avec le jeu
			System.out.println("la valeure est"+DonneesPartagees.cartesAcquisitions[DonneesPartagees.numeroCarteAcquisitions][4]);
		}
		System.out.println("sah bon choix"+DonneesPartagees.numeroCarteAcquisitions);
		CartesAcquisition.dessinCarte(DonneesPartagees.cartesAcquisitions[DonneesPartagees.numeroCarteAcquisitions]);
		return DonneesPartagees.numeroCarteAcquisitions;
	}

	/**
	 * verifie l'argent des joueurs si il a assez pour payer
	 * @param cartes
	 * @return verif 
	 * si il a assez ou pas un boolean
	 */
	public static boolean verificationsArgentsJoueur(String [][] cartes) {
		boolean verif = false;
		if (DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]< Integer.parseInt(cartes [DonneesPartagees.numeroCarteAcquisitions][cartePrixAchat])+Integer.parseInt(cartes [DonneesPartagees.numeroCarteAcquisitions][carteCommission])) {
			System.out.println("T es pauvre");	
		}
		else if((DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]> Integer.parseInt(cartes [DonneesPartagees.numeroCarteAcquisitions][cartePrixAchat])+Integer.parseInt(cartes [DonneesPartagees.numeroCarteAcquisitions][carteCommission])) 
				) {
			System.out.println("Vous pouvez la prendre");	
			verif= true;
		}
		return verif;
	}

	//	public static void verificationAppartencanceCarte(String [][]cartesAcquisition) {
	//		menueAleatoireAcquisitions(cartesAcquisition);
	//		while (cartesAcquisition[DonneesPartagees.numeroCarteAcquisitions][4]==String.valueOf(DonneesPartagees.indexeJoueurCourant)) {
	//			menueAleatoireAcquisitions(cartesAcquisition);
	//
	//			//DonneesPartagees.numeroCarteAcquisitions= (int)(Math.random()*(15));//fois une variable car carte diminue avec le jeu
	//		}
	//}
	public static boolean choixDuJoueurCartesAcquisition(Scanner saisie) {
		boolean choixJoueur=false;
		int choix;

		if (verificationsArgentsJoueur(DonneesPartagees.cartesAcquisitions)==true) {
			System.out.println("Voulez vous prendre la carte ?");
			System.out.println("1 pour oui, 0 pour non");
			choix = Integer.parseInt(saisie.nextLine());
			while (choix<0 || choix>1) {
				System.out.println("Entrez 0 ou 1 !! ");
				choix = Integer.parseInt(saisie.nextLine());
			}
			if (choix == 0)
				System.out.println("Dommage c'était un choix de qualité");
			if (choix == 1)
				choixJoueur=true;
		}
		return choixJoueur;

	}

	public static void effetCartesAcquisitions () {	
		Scanner saisie = new Scanner(System.in);
		switch(menueAleatoireAcquisitions(DonneesPartagees.cartesAcquisitions)) { 

		case 0 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [0][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [0][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [0][carteCommission]);
				DonneesPartagees.cartesAcquisitions[0][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 1 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [1][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [1][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [1][carteCommission]);
				DonneesPartagees.cartesAcquisitions[1][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 2 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [2][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [2][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [2][carteCommission]);
				DonneesPartagees.cartesAcquisitions[2][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 3:
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [3][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [3][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [3][carteCommission]);
				DonneesPartagees.cartesAcquisitions[3][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 4 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [4][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [4][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [4][carteCommission]);
				DonneesPartagees.cartesAcquisitions[4][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 5 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [5][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [5][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [5][carteCommission]);
				DonneesPartagees.cartesAcquisitions[5][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 6 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [6][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [6][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [6][carteCommission]);
				DonneesPartagees.cartesAcquisitions[6][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 7 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [7][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [7][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [7][carteCommission]);
				DonneesPartagees.cartesAcquisitions[7][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 8 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [8][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [8][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [8][carteCommission]);
				DonneesPartagees.cartesAcquisitions[8][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 9 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [9][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [9][carteCommission]));		
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [9][carteCommission]);
				DonneesPartagees.cartesAcquisitions[9][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 10 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [10][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [10][carteCommission]));		
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [10][carteCommission]);
				DonneesPartagees.cartesAcquisitions[10][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 11 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [11][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [11][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [11][carteCommission]);
				DonneesPartagees.cartesAcquisitions[11][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 12 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [12][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [12][carteCommission]));			
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [12][carteCommission]);
				DonneesPartagees.cartesAcquisitions[12][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 13 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [13][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [13][carteCommission]));		
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [13][carteCommission]);
				DonneesPartagees.cartesAcquisitions[13][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;

		case 14 :
			if (choixDuJoueurCartesAcquisition(saisie)==true) {
				DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [14][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [14][carteCommission]));		
				DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [14][carteCommission]);
				DonneesPartagees.cartesAcquisitions[14][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
			}
			break;
		}
		System.out.println("sah j'affiches le tab");
		for (int x = 0 ; x < DonneesPartagees.cartesAcquisitions.length  ; ++x) {
			for (int y = 1 ; y < DonneesPartagees.cartesAcquisitions[x].length ; y ++) {
				System.out.println(DonneesPartagees.cartesAcquisitions[x][y]);
			}

		}  
	}
}
package debut;

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
				+ "				+ \"|____________________________________|\")\r\n"
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

	//tableau acquisition � la place de switch
	//tab deux dimensions chaque case acquisitions contient 1 acquisistion
	/**
	 * java doc
	 * @param cartes
	 */
	public static int  menueAleatoireAcquisitions(String [][] cartes) {
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+"Piochez une carte");
		DonneesPartagees.numeroCarteAcquisitions= (int)(Math.random()*(23));//fois une variable car carte diminue avec le jeu

		while(!DonneesPartagees.cartesAcquisitions[DonneesPartagees.numeroCarteAcquisitions][4].equals("-1")) {
			DonneesPartagees.numeroCarteAcquisitions= (int)(Math.random()*(23));//fois une variable car carte diminue avec le jeu
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

	public static boolean choixDuJoueurCartesAcquisition() {
		boolean choixJoueur=false;
		int choix;

		if (verificationsArgentsJoueur(DonneesPartagees.cartesAcquisitions)==true) {
			System.out.println("Voulez vous prendre la carte ?");
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

	public static void effetCartesAcquisitions () {	
		
		int aleatoireAcquisition = menueAleatoireAcquisitions(DonneesPartagees.cartesAcquisitions);
		if(choixDuJoueurCartesAcquisition() == true){
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=(Integer.parseInt(DonneesPartagees.cartesAcquisitions [aleatoireAcquisition][cartePrixAchat])+ Integer.parseInt(DonneesPartagees.cartesAcquisitions [aleatoireAcquisition][carteCommission]));			
			DonneesPartagees.montantCagnotte+=Integer.parseInt(DonneesPartagees.cartesAcquisitions [aleatoireAcquisition][carteCommission]);
			DonneesPartagees.cartesAcquisitions[aleatoireAcquisition][ carteappartenanceDeLaCarte]=String.valueOf(DonneesPartagees.indexeJoueurCourant);
		}

		
		System.out.println(" j'affiches le tab");
		for (int x = 0 ; x < DonneesPartagees.cartesAcquisitions.length  ; ++x) {
			for (int y = 1 ; y < DonneesPartagees.cartesAcquisitions[x].length ; y ++) {
				System.out.println(DonneesPartagees.cartesAcquisitions[x][y]);
			}

		}  
	}
}
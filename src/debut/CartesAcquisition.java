package debut;
public class CartesAcquisition {

	static int carteNom=0;  // mettre maj kamel
	static int cartePrixAchat=1;
	static int carteValeurReelle=2;
	static int carteCommission=3;

/**
 * fonction qui dessinne les cartes avec les valeurs des cartes qui changent
 * @param carte
 */
	public static void dessinCarte (String[]carte) {
		for (int i=0; i<carte.length;i++) {


		}

		System.out.println("" 
				+ " __________________________________\r\n"
				+ "|	"+ carte [0]  + "         |\r\n"
				+ "|	                          |\r\n"
				+ "|_________________________________|\r\n"
				+ "|	PRIX D'ACHATS  " + carte[1] +"€     |\r\n"
				+ "|	VALEUR REELLE  " + carte[2] +"€     |\r\n"
				+ "|	COMMISSION     " + carte[3] +"€      |\r\n"
				+ "|________________________________|");
	}

	public static String[] creerCarteAcquisitions (String nom,  int prixAchat,int valeurReelle, int commission) {			//1 BELLE ANTIQUITE
		String[]carte = new String[4];
		carte [carteNom]= nom;
		carte [cartePrixAchat]= String.valueOf(prixAchat);
		carte [carteValeurReelle]= String.valueOf(valeurReelle);//caste int en string
		carte [carteCommission]=String.valueOf(commission) ;
		return carte;
	}

	public static String[][] recupererCartesAcquisitions () {			
		String[][] cartes = new String[15][4];//4 pour les 4 chaine de caracteres
		cartes [0]=creerCarteAcquisitions("1 BELLE ANTIQUITE", 3000,7500, 300);    						//1 BELLE ANTIQUITE
		cartes [1] =creerCarteAcquisitions("1 VOITURE DE COURSE",2850, 3600, 300); 						//1 VOITURE DE COURSE
		cartes [2]=creerCarteAcquisitions("1 MOTO", 2400, 3600, 150);									//1 MOTO
		cartes [3]=creerCarteAcquisitions("1 COLLECTION DE B.D", 600, 1650, 50);						//1 COLLECTION DE B.D
		cartes [4]=creerCarteAcquisitions("//1 CHATEAU EN ESPAGNE", 4500, 7500, 300);					//1 CHATEAU EN ESPAGNE
		cartes [5]=creerCarteAcquisitions("1 TRACTEUR AGRICOLE", 2850, 3600, 300);						//1 TRACTEUR AGRICOLE
		cartes [6]=creerCarteAcquisitions("1 COLLECTION DE TIMBRES", 1050, 1800, 150);					//1 COLLECTION DE TIMBRES
		cartes [7]=creerCarteAcquisitions("1 BAGUETTES MAGIQUE", 2400, 3600, 150);						//1 BAGUETTES MAGIQUE
		cartes [8]=creerCarteAcquisitions("1 VOYAGES SUR LA LUNE", 1050, 1800, 150);					//1 VOYAGES SUR LA LUNE
		cartes [9]=creerCarteAcquisitions("1 SALON DE BEAUTE", 3300, 4800, 400);						//1 SALON DE BEAUTE
		cartes [10]=creerCarteAcquisitions("1 MEUBLE ANCIEN", 450, 1200, 100);							//1 MEUBLE ANCIEN
		cartes [11]=creerCarteAcquisitions("1 PICASSO (SANS DOUTE FAUX)", 2100, 4200, 200);				//1 PICASSO (SANS DOUTE FAUX)
		cartes [12]=creerCarteAcquisitions("1 CHIEN DE RACE", 600, 1650, 100);							//1 CHIEN DE RACE
		cartes [13]=creerCarteAcquisitions("1 PISCINE", 3000, 7500, 300);								//1 PISCINE
		cartes [14]=creerCarteAcquisitions("1 SCULPTURE DE JARDIN", 450, 1200, 100);					//1 SCULPTURE DE JARDIN
		return cartes;
	}
}
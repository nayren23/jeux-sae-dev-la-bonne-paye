package Cartes;

import Launcher.DonneesPartagees;
import Launcher.LaBonnePaye;

public class CartesAcquisition {


	static int carteNom=0;  
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

		System.out.println(" ______________________________________________________________ \r\n"
				+ "|	"+ carte [0]  +"                                            		\r\n"
				+ "|	  	       					       |\r\n"
				+ "|______________________________________________________________|\r\n"
				+ "|	PRIX D'ACHATS :  " + carte[1] + "€"+ "   			       |\r\n"
				+ "|	VALEUR REELLE :  " + carte[2] + "€"+ "				       |\r\n"
				+ "|	COMMISSION :     " + carte[3] + "€"+ "    			       |\r\n"
				+ "|______________________________________________________________|");
	}
/**
 * Fonction qui creer les cartes acquisitions avec en entrée les valeurs du tab a 2 dimensions creer cartes acquisitions 
 * Créer  dans un tab à 1 dimensions toutes les info des cartes acquisitions avec leur création dans cree carte acquisitions
 * @param nom à partir du tab creerCartesAcquisitions
 * @param prixAchat nom à partir du tab creerCartesAcquisitions
 * @param valeurReelle nom à partir du tab creerCartesAcquisitions
 * @param commission nom à partir du tab creerCartesAcquisitions
 * @param appartenanceDeLaCarte nom à partir du tab creerCartesAcquisitions
 * @return un tab à 1 dimensions avec toutes les infos des cartes
 */
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
		System.out.println();
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 pour piochez votre carte Acquisition  !!");
		DonneesPartagees.numeroCarteAcquisitions= (int)(Math.random()*(23));//fois une variable car carte diminue avec le jeu

		while(!DonneesPartagees.cartesAcquisitions[DonneesPartagees.numeroCarteAcquisitions][4].equals("-1")) {
			DonneesPartagees.numeroCarteAcquisitions= (int)(Math.random()*(23));//fois une variable car carte diminue avec le jeu
			System.out.println("la valeure est"+DonneesPartagees.cartesAcquisitions[DonneesPartagees.numeroCarteAcquisitions][4]);
		}
		System.out.println("Très  bon choix "+ DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourant]+ "  "+ " vous avez piochez la carte : "+DonneesPartagees.numeroCarteAcquisitions); //affichage pour vérfication ensuite dans le tableau
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
			System.out.println(DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourant]+ "  "+"Vous ne  pouvez pas  la prendre, vous êtes pauvre !!!  ");	
			DonneesPartagees.choixDuJoueur("Appuyer sur 1 pour laisser le prochain joueur jouer  !!  ");

		}
		else if((DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]> Integer.parseInt(cartes [DonneesPartagees.numeroCarteAcquisitions][cartePrixAchat])+Integer.parseInt(cartes [DonneesPartagees.numeroCarteAcquisitions][carteCommission])) 
				) {
			System.out.println(DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourant]+ "  "+"Vous pouvez la prendre");	
			verif= true;
		}
		return verif;
	}

	public static boolean choixDuJoueurCartesAcquisition() {
		boolean choixJoueur=false;
		int choix;

		if (verificationsArgentsJoueur(DonneesPartagees.cartesAcquisitions)==true) {
			System.out.println(DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourant]+ "  "+ "Voulez vous prendre la carte ?");
			System.out.println("1 pour oui, 0 pour non");
			choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
			while (choix<0 || choix>1) {
				System.out.println(DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourant]+ "  "+"Entrez 0 ou 1 !! ");
				choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
			}
			if (choix == 0)
				System.out.println("Dommage c'était un choix de qualité");
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


		System.out.println(" Vérification si on a bien écrit l'indexe du joueur dans le tableau \n pour pas qu'un autre joueur puisse prendre la carte");
		for (int x = 0 ; x < DonneesPartagees.cartesAcquisitions.length  ; ++x) {
			for (int y = 1 ; y < DonneesPartagees.cartesAcquisitions[x].length ; y ++) {
				System.out.println(DonneesPartagees.cartesAcquisitions[x][y]);
			}

		}  
	}
}
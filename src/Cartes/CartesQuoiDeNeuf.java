package Cartes;

import Launcher.DonneesPartagees;

public class CartesQuoiDeNeuf {

	// Données de chaques cartes Quoi De neuf
	public static String[][] recupererCartesQuoiDeNeuf() {       	 
		String[][] cartes = new String[15][2]; // 2D pour les 2 chaines de caractères
		cartes [0]=creerCartesQuoiDeNeuf("Prime de votre caisse d'épargne !","500 €, Gardez l'argent ! " ); 
		cartes [1] =creerCartesQuoiDeNeuf("Faites les programmes du concert municipal.","400 €, Gardez l'argent !");  
		cartes [2]=creerCartesQuoiDeNeuf("Travaillez tard pour impresionner votre nouveau patron","400 €, Gardez l'argent !" );  
		cartes [3]=creerCartesQuoiDeNeuf("Construisez une niche de luxe pour Fifi le caniche du voisin","600 € Gardez l'argent !" );     
		cartes [4]=creerCartesQuoiDeNeuf("Donnez un coup de jeune à cette chère Mme Pindeseigle","100 € Gardez l'argent !" );       
		cartes [5]=creerCartesQuoiDeNeuf("Vendez des gâteaux et des brioches à la fête du village.","200 € Gardez l'argent !" );             
		cartes [6]=creerCartesQuoiDeNeuf("Vous héritez de grand maman.","800 € Gardez l'argent !");                                	
		cartes [7]=creerCartesQuoiDeNeuf("Remportez la seconde place d'un coucoours de genoux cagneux","200 € Gardez l'argent !" );	 
		cartes [8]=creerCartesQuoiDeNeuf("Vous recevez un don anonyme","300 € Gardez l'argent !" );
		cartes [9]=creerCartesQuoiDeNeuf("Remportez une course de voiture","300 € Gardez l'argent !" );
		cartes [10]=creerCartesQuoiDeNeuf("Organisez une boum pour tous vos amis.","400 € Cotisez pour la cagnotte !");        	           	 
		cartes [11]=creerCartesQuoiDeNeuf("Tante Jeanne a arrosé vos plantes vertes pendants \n vos deux semaines de vacances.","50 € Cotisez pour la cagnotte !" );                	   
		cartes [12]=creerCartesQuoiDeNeuf("Faites-vous plaisir en achetant un nouveau téléphone portable \n multifonctions, avec plein d'accessoires."," 300 € Cotisez pour la cagnotte !" );                    	 	 
		cartes [13]=creerCartesQuoiDeNeuf("Votre ballon fracasse la serre du voisin !","600 € Cotisez pour la cagnotte !" );                	
		cartes [14]=creerCartesQuoiDeNeuf("Faites un don à l'équipe de football du coin pour \n qu'ils s'achètent des chaussures de compétition","100 € Cotisez pour la cagnotte !" );	

		return cartes;
	}

	// Crée un sous tableau dans le tableau cartes( Voir méthode recupererCartesQuoiDeNeuf )
	public static String[] creerCartesQuoiDeNeuf (String nom,  String texte ) {       	 
		String[]carte = new String[2];
		carte [0]= nom;
		carte [1]= String.valueOf(texte);

		return carte;
	}

	public static int menueAleatoireQuoiDeNeuf(String [][] cartes) {
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 pour piochez votre carte Quoi de neuf  !!");
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant] +" vous piochez une carte Quoi De Neuf !");
		DonneesPartagees.numeroCarteQuoiDeNeuf=(int)(Math.random()*(15));
		System.out.println("Très  bon choix vous avez piochez la carte : "+DonneesPartagees.numeroCarteQuoiDeNeuf); //affichage pour vérfication ensuite dans le tableau



		return DonneesPartagees.numeroCarteQuoiDeNeuf;
	}




	public static void dessinCarte (String[]carte) {

		System.out.println(" ______________________________________________________________ \r\n"
				+ "|"+ carte [0]  +"                                            		\r\n"
				+ "|	  	       					       |\r\n"
				+ "|______________________________________________________________|\r\n"
				+ " "+carte[1]+ "   			       \r\n"
				+ "|______________________________________________________________|");
	}


	public static void effetCartesQuoiDeNeuf () {    

		switch(menueAleatoireQuoiDeNeuf(recupererCartesQuoiDeNeuf()/*, 0*/)) {

		case 0:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[0][0], recupererCartesQuoiDeNeuf()[0][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=500; 
			break;

		case 1:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[1][0], recupererCartesQuoiDeNeuf()[1][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=400; 
			break;

		case 2:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[2][0], recupererCartesQuoiDeNeuf()[2][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=400; 
			break;

		case 3:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[3][0], recupererCartesQuoiDeNeuf()[3][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=600; 
			break;

		case 4:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[4][0], recupererCartesQuoiDeNeuf()[4][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=100; 
			break;

		case 5:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[5][0], recupererCartesQuoiDeNeuf()[5][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=200; 
			break;

		case 6:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[6][0], recupererCartesQuoiDeNeuf()[6][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=800; 
			break;

		case 7 :
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[7][0], recupererCartesQuoiDeNeuf()[7][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=200;   					 
			break;

		case 8 :
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[8][0], recupererCartesQuoiDeNeuf()[8][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=300;   					 
			break;

		case 9 :
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[9][0], recupererCartesQuoiDeNeuf()[9][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]+=300;   					 
			break;

		case 10:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[10][0], recupererCartesQuoiDeNeuf()[10][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=400; 
			DonneesPartagees.montantCagnotte+=400;
			break;

		case 11:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[11][0], recupererCartesQuoiDeNeuf()[11][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=50; 
			DonneesPartagees.montantCagnotte+=50;
			break;

		case 12:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[12][0], recupererCartesQuoiDeNeuf()[12][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=300; 
			DonneesPartagees.montantCagnotte+=300;
			break;

		case 13:
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[13][0], recupererCartesQuoiDeNeuf()[13][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=600; 
			DonneesPartagees.montantCagnotte+=600;
			break;

		case 14 :
			dessinCarte(creerCartesQuoiDeNeuf(recupererCartesQuoiDeNeuf()[14][0], recupererCartesQuoiDeNeuf()[14][1]));	
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=100; 
			DonneesPartagees.montantCagnotte+=100;
			break;
		}
	}
}
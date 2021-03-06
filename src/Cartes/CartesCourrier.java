package Cartes;

import Launcher.DonneesPartagees;

public class CartesCourrier{

	public static String[] creerCarteCourrier (String nom,  String texte ) {            
		String[]carte = new String[2];
		carte [0]= nom;
		carte [1]= String.valueOf(texte);
		return carte;
	}

	public static String[][] recupererCartesCourrier() {            
		String[][] cartes = new String[20][2];//2 pour les 2 chaines de caract�res
		cartes [0]=creerCarteCourrier("1 lettre de vos grand-parents","Salut mon petit loup , \n nous t'invitons papito et moi à venir passer les fêtes à la maison." );     // Lettre RolePlay
		cartes [1] =creerCarteCourrier("1 lettre de vos grand-parents","Salut mon champion alors \n ce date tinder ?");                                                     // Lettre RolePlay
		cartes [2]=creerCarteCourrier("1 lettre de vos grand-parents","Salut mon petit bout de chou,\n tout va bien ? Ici on s'ennuis, la retraite quoi. " );                // Lettre RolePlay    
		cartes [3]=creerCarteCourrier("1 Assurance maladie","Vous etes couvert par la sécurité social pendant 1 mois" );                                // Dispense de payer les frais m�dicaux ( pendant 1 mois )
		cartes [4]=creerCarteCourrier("1 Assurance voiture","Votre garagiste vous aime bien ! \n surtout votre femme" );                                    // Dispense de payer les frais de r�paration( pendant 1 mois )
		cartes [5]=creerCarteCourrier("1 Assurance maladie","Votre medecin a flashé sur vous !" );                                                        // Dispense de payer les frais m�dicaux ( pendant 1 mois )
		cartes [6]=creerCarteCourrier("1 Assurance voiture","Votre garagiste vous aime bien ! \n surtout votre femme");                                    // Dispense de payer les frais de r�paration ( pendant 1 mois )
		cartes [7]=creerCarteCourrier("1 Rendez-vous chez le medecin","Vous etes atteins du Covid-67, \n vous devez payer 200euros de frais médicaux." );    // payer 200 de Frais m�dicaux                 
		cartes [8]=creerCarteCourrier("1 Constat d'accident","Vous avez roulé sur un caillou un peu gros, \n payer 200euros de frais de réparation " );    // payer 200 de Frais de r�paration
		cartes [9]=creerCarteCourrier("1 Lettre du tribunal", " Votre ex-femme vous poursuis en justice, \n payer 200 euros d'avocats" );                    // payer 200  
		cartes [10]=creerCarteCourrier("1 Concours de beauté", " Vous avez été repéré par les dirigeants \n du concours et vous y êtes invité");            // lettre RolePlay                
		cartes [11]=creerCarteCourrier("1 Lettre du maire ","Le maire vous envois ses voeux de fin d'année 2020  \n ( oui en retard )" );                    // lettre RolePlay    
		cartes [12]=creerCarteCourrier("1 Lettre du comissariat","vous etes convoqué au comissariat \n suite a une affaire de rixe" );                        // lettre RolePlay        
		cartes [13]=creerCarteCourrier("1 Journal météo","il fait beau aujourd'hui  \n ( presque genre juste quelques nuages gris )." );                    // lettre RolePlay
		cartes [14]=creerCarteCourrier("1 Rendez-vous chez le medecin","Vous avez un méchant rhume et \n vous devez payer 200 euros de frais médicaux" );    // payer 200 de frais m�dicaux
		cartes [15]=creerCarteCourrier("1 Publicité","Vous disposez de 50% sur la nouvelle Fiat Multiplat \n au concessionnaire de votre ville" );            // lettre RolePlay
		cartes [16]=creerCarteCourrier("1 Amende","vous avez été flashé a plus de 20 KM/H au dessus de la \n limitation de vitesse, -2 points sur le permis et 200euros a payer à la banque." ); // payer 200
		cartes [17]=creerCarteCourrier("1 Constat d'accident","Vous devez payer 200 euros de réparation pour \n votre nouvelle trotinette" );                 // payer 200 de frais de r�paration
		cartes [18]=creerCarteCourrier("1 Constat d'accident","Vous vous avez décidé de drifter comme dans \n un film et devez changer \n vos pneus, payer 200 euros de frais de réparation" ); // payer 200 de frais de r�paration
		cartes [19]=creerCarteCourrier("1 Rendez vous chez le médecin","Vous vous êtes foulé la cheville en \n jonglant, payer 200 de frais médicaux" );    // payer 200 de frais m�dicaux
		return cartes;
	}

	public static int menueAleatoireCourrier(String [][] cartes) {
		DonneesPartagees.choixDuJoueur("Appuyer sur 1 pour piochez votre carte Courrier  !!");
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+ "  " +"Piochez une carte");
		DonneesPartagees.numeroCarteCourrier=(int)(Math.random()*(20));
		System.out.println("Très  bon choix vous avez piochez la carte : "+DonneesPartagees.numeroCarteCourrier); //affichage pour vérfication ensuite dans le tableau
		return DonneesPartagees.numeroCarteCourrier;
	}


	public static void dessinCarte (String[]carte) {
		for (int i=0; i<carte.length;i++) {


		}



		System.out.println(" ______________________________________________________________ \r\n"
				+ "|	"+ carte [0]  +"                                            		\r\n"
				+ "|	  	       					       |\r\n"
				+ "|______________________________________________________________|\r\n"
				+ " "+carte[1]+ "   			       \r\n"
				+ "|______________________________________________________________|");


	}

	public static void effetCartesCourrier () {	
		switch(menueAleatoireCourrier(recupererCartesCourrier())) { 

		case 0:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[0][0], recupererCartesCourrier()[0][1]));
			break;

		case 1:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[1][0], recupererCartesCourrier()[1][1]));
			break;

		case 2:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[2][0], recupererCartesCourrier()[2][1]));
			break;

		case 3:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[3][0], recupererCartesCourrier()[3][1]));
			break;

		case 4:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[4][0], recupererCartesCourrier()[4][1]));
			break;

		case 5:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[5][0], recupererCartesCourrier()[5][1]));
			break;

		case 6:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[6][0], recupererCartesCourrier()[6][1]));
			break;

		case 7 :
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[7][0], recupererCartesCourrier()[7][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;

		case 8 :
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[8][0], recupererCartesCourrier()[8][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;

		case 9 :
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[9][0], recupererCartesCourrier()[9][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;

		case 10:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[10][0], recupererCartesCourrier()[10][1]));
			break;

		case 11:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[11][0], recupererCartesCourrier()[11][1]));
			break;

		case 12:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[12][0], recupererCartesCourrier()[12][1]));
			break;

		case 13:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[13][0], recupererCartesCourrier()[13][1]));
			break;

		case 14 :
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[14][0], recupererCartesCourrier()[14][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;

		case 15:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[15][0], recupererCartesCourrier()[15][1]));
			break;

		case 16 :
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[16][0], recupererCartesCourrier()[16][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;

		case 17 :
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[17][0], recupererCartesCourrier()[17][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;

		case 18:
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[18][0], recupererCartesCourrier()[18][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;

		case 19 :
			dessinCarte(creerCarteCourrier(recupererCartesCourrier()[19][0], recupererCartesCourrier()[19][1]));
			DonneesPartagees.tabArgentJoueur[DonneesPartagees.indexeJoueurCourant]-=200;						
			break;
		}
	}
}

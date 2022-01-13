package Launcher;

import Cartes.CartesAcquisition;

public class DonneesPartagees {

	//indexe du joueurs  qui joue actuellement dans loteriz de 0...n
	public static int indexeJoueurCourantLoterie;   
	
	//nombre de tours choisi par les joueurs
	public static int nbTours;

	//nombre de joueurs de 2 ...6
	public static int nombreJoueurs;

	//contient le choix actuelle de l Acquisition
	public static int choixCarteAcquisition;

	//indexe du joueurs  qui joue actuellement de 0...n
	public static int indexeJoueurCourant;    

	//monatant de la cagnotte
	public static int montantCagnotte;

	//choix de la carte acquisition
	public static int numeroCarteAcquisitions;

	//choix de la carte courrier
	public static int numeroCarteCourrier;

	//choix de la carte Courrier
	public static int numeroCarteQuoiDeNeuf;

	//compte le nombre de tour jouer
	public static int compteurTour;

	//tableau des noms des joueurs de 0...n
	public static String[] tabNomJoueur;

	// tableau indexcase actuelle des joueurs de 0 ...n
	public static int[] tabcaseActuelleJoueur;

	// tableau contenant l'argent de chaque joueurs  de 0 ...n
	public static int[] tabArgentJoueur;

	// tableau contenant le nombre d'acquisition  de chaque joueur  de 0 ...n
	public static int[] tabNombreAcquisitionsJoueur;

	// tableau des acquisitions pour chaque joueurs avec quel acquisitions il possede: [indexeJoueurrs][indexAcqisition]indexe 0...n
	public static int[][] tabAcquisitionsJoueur;

//	// tableau contenant le nombre de prets  de chaque joueur  de 0 ...n
//	public static int[] tabNombrePretsJoueur;
//
//	// tableau contenant le montant de l'epargne de chaque joueur  de 0 ...n
//	public static int[] tabMontantEpargneJoueur;


	public static int [] postionCase () {
		int[] cases = new int[32];//4 pour les 4 chaine de caracteres
		cases[0]=0;        //l'indice du tableau correspond au num�ro de la case du tableau de la case
		cases[1]=1;        //la valeur correspond � l'indice de la case a l ecran
		cases[2]=2;
		cases[3]=3;
		cases[4]=4;
		cases[5]=5;
		cases[6]=11;
		cases[7]=17;
		cases[8]=23;
		cases[9]=29;
		cases[10]=35;
		cases[11]=34;
		cases[12]=33;
		cases[13]=32;
		cases[14]=31;
		cases[15]=30;
		cases[16]=24;
		cases[17]=18;
		cases[18]=12;
		cases[19]=6;
		cases[20]=7;
		cases[21]=8;
		cases[22]=9;
		cases[23]=10;
		cases[24]=16;
		cases[25]=22;
		cases[26]=28;
		cases[27]=27;
		cases[28]=26;
		cases[29]=25;
		cases[30]=19;
		cases[31]=13;
		return  cases;
	}
/**
 * Créer un nv tab contenant les cartes acqusitions qui lui peut etre modifié alors que l'autre lui est a  chaque fois créer et réinitialiser
 */
	public static String[][] cartesAcquisitions  = new String[23][5];//nouveaux tab qui est  modifié lors de l'achat d'une cartes ou de sa vente


	// NE DOIT ETRE APPELE Qu'1 FOIS
	/**
	 * Fonction créer un tab à 2 dimensions contenant toutes les cartes dont chaque ligne contient les infos de chaque cartes 
	 * @return tab 2 cartes
	 */
	public static String [][] creerCartesAcquisitions () {            
		String[][] cartes = new String[23][5];//4 pour les 4 chaine de caracteres
		cartes [0]=CartesAcquisition.creerCarteAcquisitions("1 BELLE ANTIQUITE", 3000,7500, 300,-1);                            //1 BELLE ANTIQUITE     total payer 3300
		cartes [1] =CartesAcquisition.creerCarteAcquisitions("1 VOITURE DE COURSE",2850, 3600, 300,-1);                         //1 VOITURE DE COURSE     total payer 3150
		cartes [2]=CartesAcquisition.creerCarteAcquisitions("1 MOTO", 2400, 3600, 150,-1);                                    //1 MOTO                    total payer 2550
		cartes [3]=CartesAcquisition.creerCarteAcquisitions("1 COLLECTION DE B.D", 600, 1650, 50,-1);                        //1 COLLECTION DE B.D        total payer 650
		cartes [4]=CartesAcquisition.creerCarteAcquisitions("1 CHATEAU EN ESPAGNE", 4500, 7500, 300,-1);                    //1 CHATEAU EN ESPAGNE        total payer 4800
		cartes [5]=CartesAcquisition.creerCarteAcquisitions("1 TRACTEUR AGRICOLE", 2850, 3600, 300,-1);                        //1 TRACTEUR AGRICOLE        total payer 3150
		cartes [6]=CartesAcquisition.creerCarteAcquisitions("1 COLLECTION DE TIMBRES", 1050, 1800, 150,-1);                    //1 COLLECTION DE TIMBRES    total payer 1200
		cartes [7]=CartesAcquisition.creerCarteAcquisitions("1 BAGUETTES MAGIQUE", 2400, 3600, 150,-1);                        //1 BAGUETTES MAGIQUE        total payer 2550
		cartes [8]=CartesAcquisition.creerCarteAcquisitions("1 VOYAGES SUR LA LUNE", 1050, 1800, 150,-1);                    //1 VOYAGES SUR LA LUNE        total payer 1200
		cartes [9]=CartesAcquisition.creerCarteAcquisitions("1 SALON DE BEAUTE", 3300, 4800, 400,-1);                        //1 SALON DE BEAUTE            total payer 3700
		cartes [10]=CartesAcquisition.creerCarteAcquisitions("1 MEUBLE ANCIEN", 450, 1200, 100,-1);                            //1 MEUBLE ANCIEN            total payer 550
		cartes [11]=CartesAcquisition.creerCarteAcquisitions("1 PICASSO (SANS DOUTE FAUX)", 2100, 4200, 200,-1);                //1 PICASSO (SANS DOUTE FAUX)total payer 2300
		cartes [12]=CartesAcquisition.creerCarteAcquisitions("1 CHIEN DE RACE", 600, 1650, 100,-1);                            //1 CHIEN DE RACE            total payer 700
		cartes [13]=CartesAcquisition.creerCarteAcquisitions("1 PISCINE", 3000, 7500, 300,-1);                                //1 PISCINE                    total payer 3300
		cartes [14]=CartesAcquisition.creerCarteAcquisitions("1 SCULPTURE DE JARDIN", 450, 1200, 100,-1);                    //1 SCULPTURE DE JARDIN        total payer 550
		cartes [15]=CartesAcquisition.creerCarteAcquisitions("1 VIGNOBLE QUI RAPPORTE", 3000, 4500, 450,-1);                //1 VIGNOBLE QUI RAPPORTE    total payer 3450
		cartes [16]=CartesAcquisition.creerCarteAcquisitions("1 CAMIONNETTE POUR VENDRE DES KEBABS", 1050, 1800, 150,-1);    //1 CAMIONNETTE POUR VENDRE DES KEBABS        total payer 1200
		cartes [17]=CartesAcquisition.creerCarteAcquisitions("1 COLLIER DE CHIEN SERTI DE DIAMANTS", 1000, 1800, 100,-1);    //1 COLLIER DE CHIEN SERTI DE DIAMANTS        total payer 1100
		cartes [18]=CartesAcquisition.creerCarteAcquisitions("1 COLECTION DE PIECES", 1050, 1800, 100,-1);                    //1 COLECTION DE PIECES        total payer 1150
		cartes [19]=CartesAcquisition.creerCarteAcquisitions("1  CARAVANE", 3300, 4800, 350,-1);                            //1  CARAVANE        total payer 3650
		cartes [20]=CartesAcquisition.creerCarteAcquisitions("1 CLUB DE FOOTBALL DE DEUXIEME DIVISION", 2400, 3600, 150,-1);//1 CLUB DE FOOTBALL DE DEUXIEME DIVISION        total payer 2550
		cartes [21]=CartesAcquisition.creerCarteAcquisitions("1 CHEVAL DE COURSE", 2100, 4200, 200,-1);                        //1 CHEVAL DE COURSE        total payer 2300
		cartes [22]=CartesAcquisition.creerCarteAcquisitions("1 VIEUX TACOT", 1050, 1800, 150,-1);                            //1 VIEUX TACOT        total payer 1200
		cartesAcquisitions = cartes; //met les données dans un nv tab qui lui peut etre modifié 
		return cartes;
	}

	/**
	 * Fonction demande choix du joueur avec prend en compte la phrase à lui demander "question" force la saisit à 1
	 * @param question
	 */
	public static void choixDuJoueur(String question) {
		int choix;
		System.out.println(DonneesPartagees.tabNomJoueur[DonneesPartagees.indexeJoueurCourant]+ "  " +question );
		choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		
		while (choix!=1) {
			System.out.println(DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourant]+ "  "+ "Entrez 1 !! ");
			System.out.println( DonneesPartagees.tabNomJoueur [DonneesPartagees.indexeJoueurCourant]+ "  "+"t'abuses tu peux pas arnaquer le jeu !! ");
			choix = Integer.parseInt(LaBonnePaye.saisie.nextLine());
		}
	}
}
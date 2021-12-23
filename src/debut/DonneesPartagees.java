package debut;

public class DonneesPartagees {

	//nombre de joueurs de 2 ...6
	public static int nombreJoueurs;
	
	//indexe du joueurs  qui joue actuellement de 0...n
	public static int indexeJoueurCourant;	
	
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
		
	// tableau contenant le nombre de prets  de chaque joueur  de 0 ...n
	public static int[] tabNombrePretsJoueur;
	
	// tableau contenant le montant de l'epargne de chaque joueur  de 0 ...n
	public static int[] tabMontantEpargneJoueur;
	
	//monatant de la cagnotte
	public static int montantCagnotte;
	
	//choix de la carte acquisition
	public static int numeroCarteAcquisitions;
	
	public static int [] postionCase () {
		int[] cases = new int[32];//4 pour les 4 chaine de caracteres
		cases[0]=0;		//l'indice du tableau correspond au numéro de la case du tableau de la case
		cases[1]=1;		//la valeur correspond à l'indice de la case a l ecran
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
	}
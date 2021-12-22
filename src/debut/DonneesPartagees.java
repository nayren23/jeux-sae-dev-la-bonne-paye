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
	}
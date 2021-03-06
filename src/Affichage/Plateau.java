package Affichage;

import Launcher.DonneesPartagees;

public class Plateau {
	public static void afficher() {    


		String t[][] = new String [25][25];

		toutBlanc(t);
		ligneY(t);
		ligneX(t);
		quadrillage(t);
		finition(t);

		caseVersDroite(t,6,22,1,1);
		caseVersBas(t,5,22,6,22);
		caseVersGauche(t,18,2,11,21);
		caseVersHaut(t,17,5,16,2);

		caseVersDroite(t,6,18,20,5);
		caseVersBas(t,5,18,23,18);
		caseVersGauche(t,14,8,27,17);
		caseVersHaut(t,17,9,29,6);
		t[1][2] = "Départ!";

		cagnotte(t);


		//parcourir le tab des joeurs pour alimenter positions dans ce tab 
		for (int i=0;i<DonneesPartagees.nombreJoueurs;i++) {
			PositionPlateau.calculPositionCase(t, DonneesPartagees.tabcaseActuelleJoueur[i], i);
		}
		//parcourir tab cagnotte
		//...
		//afficher tab



		afficherTableauString(t);

		AffichageBasiqueSupp.affichageInfoJoueursEnBAsDuTableau();
		System.out.println();


	}

	// met un " " dans tout le tableau
	public static String[][] toutBlanc (String t[][]) {
		String str =  " ";
		for (int x = 0 ; x < t.length ; x++) {                                               
			for (int y = 0 ; y < t[x].length ; y++) {
				t[x][y] = str;
			}            
		}
		return t;
	}

	// Affiche des lignes vertical
	public static String [][] ligneY ( String t[][] ){

		for (int x = 1 ; x < t.length ; x++) {
			for (int y = 0 ; y < t[x].length ; y = y+4) {
				t[x][y] ="   |   ";
			}
		}
		return t;
	}

	// Affiche des lignes horizontal

	public static String [][]ligneX ( String t[][] ){
		for (int x = 0 ; x < t.length  ; x = x+4) {
			for (int y = 1 ; y < t[x].length ; y = y+2) {
				t[x][y] ="_______";
				y++;
				t[x][y] ="_______";
				y++;
				t[x][y] ="_______";
			}

		}            
		return t;
	}
	// Affiche correctement les bordures de la grille
	public static String [][] finition ( String t[][] ){
		for (int x = 0 ; x < t.length ; x= x +4) {
			t[x][0] ="   |___";
		}
		for (int x = 0 ; x < t.length ; x= x +4) {
			t[x][24] ="___|   ";
		}
		for (int y = 4 ; y < t.length ; y= y +4) {
			t[0][y] = "_______";
		}
		t[0][0] = "   ____";
		t[0][24] = "____   ";
		return t;
	}
	// Quadrille les lignes intérieurs
	public static String [][] quadrillage( String t[][] ){

		for (int x = 0 ; x < t.length ; x = x +4) {
			for (int y = 0 ; y < t[x].length ; y = y+4) {
				t[x][y] ="___|___";
			}
		}
		return t;
	}
	public static String [][] cagnotte (String t[][]) {
		for (int y = 9 ; y <= 15; y++) {
			t[12][y] =" ";
		}
		for (int x = 9 ; x <= 16; x++) {
			t[x][12] =" ";
		}
		t[12][8] ="___|   ";
		t[12][16] ="   |___";
		t[16][12] = "_______";
		t[12][11] = "Caisse";
		t[12][13] = "Commune";
		t[14][12] = +DonneesPartagees.montantCagnotte +" €";


		return t;
	}


	// Les 4 prochaines fonctions place les cases au bons endroit sur le plateau
	public static String[][] caseVersDroite (String t[][], int posD, int posF,int val, int ligne) {
		for ( int i = posD; i<=posF;i = i+4 ) {
			t[ligne][i] = "case " +val;
			val++;

		}
		return t;
	}
	public static String[][] caseVersBas (String t[][], int posD, int posF, int val, int colonne) {
		for ( int i = posD; i<=posF;i= i+4 ) {
			t[i][colonne] ="case " +val;
			val++;
		}
		return t;
	}    
	public static String[][] caseVersGauche (String t[][], int posD, int posF, int val, int ligne) {
		for ( int i = posD; i>=posF;i = i - 4 ) {
			t[ligne][i] = "case " +val;
			val++;
		}
		return t;
	}
	public static String[][] caseVersHaut (String t[][], int posD, int posF, int val, int colonne) {
		for ( int i = posD; i>=posF;i = i - 4) {
			t[i][colonne] = "case " +val;
			val++;
		}
		return t;
	}

	public static void afficherTableauString(String[][] t) {

		for (int k=0;k<50;k++) {
			System.out.println();
		}
		System.out.println("										_________________________________\r\n"
				+ "										|				|\r\n"
				+ "										|     💰 LA BONNE PAYE !!!! 💰 	|\r\n"
				+ "										|_______________________________|	");
		//clearConsole();
		for (int ligne = 0 ; ligne < t.length ; ligne++) {
			for (int colonne = 0 ; colonne < t[ligne].length ; colonne++){

				System.out.print(t[ligne][colonne] + "\t");
			}
			System.out.println();
		}

	}
}
package debut;

public class plateau {
	public static void main(String[] args) {    

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

		afficherTableauString(t);
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
		int cagnotte=1651;
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
		t[14][12] = +cagnotte +" €";
		t[6] [9]="A";/////MODIFICATION
		t[6] [10]="C";/////MODIFICATION
		t[6] [11]="Z";/////MODIFICATION
		t[7] [9]="Z";/////MODIFICATION
		t[7] [10]="Z";/////MODIFICATION
		t[7] [11]="Z";/////MODIFICATION
		t[14] [19]="T";/////MODIFICATION
		t[15] [18]="L";/////MODIFICATION
		t[14] [17]="V";/////MODIFICATION
		t[14] [18]="I";/////MODIFICATION
		t[15] [17]="A";/////MODIFICATION
		t[2] [2]="A";/////MODIFICATION
		t[2] [1]="A";/////MODIFICATION








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
		for (int ligne = 0 ; ligne < t.length ; ligne++) {
			for (int colonne = 0 ; colonne < t[ligne].length ; colonne++){

				System.out.print(t[ligne][colonne] + "\t");
			}
			System.out.println();
		}
	}
	
}
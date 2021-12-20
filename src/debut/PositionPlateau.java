package debut;

public class PositionPlateau {

	public static void main(String[] args) {

	}

	public static String [] postionCase () {
		String[] cases = new String[32];//4 pour les 4 chaine de caracteres
		cases[0]="0";		//l'indice du tableau correspond au numéro de la case du tableau de la case
		cases[1]="1";		//la valeur correspond à l'indice de la case a l ecran
		cases[2]="2";
		cases[3]="3";
		cases[4]="4";
		cases[5]="5";
		cases[6]="11";
		cases[7]="17";
		cases[8]="23";
		cases[9]="29";
		cases[10]="35";
		cases[11]="34";
		cases[12]="33";
		cases[13]="32";
		cases[14]="31";
		cases[15]="30";
		cases[16]="24";
		cases[17]="18";
		cases[18]="12";
		cases[19]="6";
		cases[20]="7";
		cases[21]="8";
		cases[22]="9";
		cases[23]="10";
		cases[24]="16";
		cases[25]="22";
		cases[26]="28";
		cases[27]="27";
		cases[28]="26";
		cases[29]="25";
		cases[30]="19";
		cases[31]="13";
		return  cases;
	}

	public static  void calculPositionCase (String []indiceCase, int indiceAconnaitre) {
		int Lignes =0;
		int Colonnes=0;
		Lignes = indiceAconnaitre/6;
		Colonnes=indiceAconnaitre%6;

		//coordonner afficher a lecran :

		int x;
		int y;
		x=1+Lignes*4;
		y=1+Colonnes*4;
		System.out.println("x vaut "+x +"y vaut " +y);
		
		
		int numJoueur =1;
		int joueur=numJoueur +2; // 3 pour le joueur 1
		int nbJoueurLignes =3;//nombre allant de  3 à 8 pour joueur 6
		int ligne= joueur/nbJoueurLignes;//diviser par 3 pour joueur 1 par 2 pour le joueur 2
		int colonne=0;
		colonne =joueur%nbJoueurLignes;//diviser par 3 pour joueur 1
		int xj= x+ligne;
		int yj=y+colonne*1;

		System.out.println("xj vaut :" +xj+"yj vaut :"+yj);

	}
}

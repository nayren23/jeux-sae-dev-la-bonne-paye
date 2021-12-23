package debut;

import java.util.Scanner;

public class PositionPlateau {

	
	public static int [] indiceCases ={ 1, 2, 3 };
	
    	
	public static void main(String[] args) {

	}



	public static  void calculPositionCase (String[][] plateau, int numeroCase,int numeroJoueur) {
	
		
		int Lignes =0;
		int Colonnes=0;
		
		int indexCase= DonneesPartagees.postionCase() [numeroCase];
		
		
		Lignes = indexCase/6;
		Colonnes=indexCase%6;

		//coordonner afficher a lecran :

		int x;
		int y;
		x=1+Lignes*4;
		y=1+Colonnes*4;
		//System.out.println("x vaut "+x +"y vaut " +y);
		
		//coordonnée point xj et yj
		int joueur=numeroJoueur +3; // 3 pour le joueur 1
		int nbJoueurLignes =3;//nombre allant de  3 à 8 pour joueur 6
		int ligne= joueur/nbJoueurLignes;//diviser par 3 pour joueur 1 par 2 pour le joueur 2
		int colonne=0;
		colonne =joueur%nbJoueurLignes;//diviser par 3 pour joueur 1
		int xj= x+ligne;
		int yj=y+colonne*1;

		//System.out.println("xj vaut :" +xj+"yj vaut :"+yj);
		
		plateau[xj][yj]=String.valueOf(numeroJoueur+1)+"(" +String.valueOf(DonneesPartagees.tabArgentJoueur[numeroJoueur])+")";
		//plateau[xj][yj]=DonneesPartagees.tabNomJoueur[numeroJoueur].substring(0,4); //affiche le pseudo des joueur avec 4 caracteres

		
		
		
		
		
	}
}

package debut;

import java.util.Scanner;

public class PlateauClassique {

	

	//lignes
	public static int []TabNomJoueurs;  // mettre maj kamel
	public static int NumeroJoueur=1;
	public static int CaseActuelle=2;
	public static int Argent=3;
	public static int NbAcquisitions=4;
	public static int ArgentEpargne=5;


	//colonnes
	public static int Joueur1=0;
	public static int Joueur2=1;
	public static int Joueur3=2;
	public static int Joueur4=3;
	public static int Joueur5=4;
	public static int Joueur6=5;
	
	
	public static String[] TabNomJoueur ;
	



	//Programme pour creer un tableau contenant les noms des joueurs 
	public static String[][] NomJoueur (Scanner saisie,int nombreJoueurs,String[]nomJoueurs) {
		
		String [][]caracteristiqueJoueurs;
		caracteristiqueJoueurs = new String[nombreJoueurs] [6] ;

		

		// Déclaration d'une variable de type tableau de String.
		// "création" du tableau pour pouvoir contenir nombreJoueurs-1 valeurs de type String.


		// remplissage du tableau
		for (int indiceNomJoueurs = 0 ; indiceNomJoueurs < caracteristiqueJoueurs.length ; indiceNomJoueurs++) {  
			for (int caracteristique=0; caracteristique<caracteristiqueJoueurs[indiceNomJoueurs].length;caracteristique++)
			caracteristiqueJoueurs[NomJoueur][Joueur1]="0";
		}

		// affichage du contenu du tableau avec un boucle for
		for (int indiceNomJoueurs = 0 ; indiceNomJoueurs< caracteristiqueJoueurs.length ; indiceNomJoueurs++) {
			for (int caracteristique=0; caracteristique<caracteristiqueJoueurs[indiceNomJoueurs].length;caracteristique++)

			System.out.println(/*"Le nom du joueur  " + (indiceNomJoueurs+1) + " est : " + caracteristiqueJoueurs[indiceNomJoueurs][caracteristique] */);
		}
		return caracteristiqueJoueurs;

	}

}

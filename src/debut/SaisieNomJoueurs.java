package debut;

import java.util.Scanner;
public class SaisieNomJoueurs {


	public static String saisieNomJoueurs(Scanner sc) {
		System.out.println("Saisir pseudo joueur  : ");
		String pseudo = sc.nextLine();
		return pseudo;

	}

	//nb case du  jeu 225
	public static String[][] genereplateauentier(Scanner sc) {


		String [][] plateau ;
		plateau = new String[6][10] ;

		for (int ligne = 0 ; ligne < plateau.length ; ligne++) {


			for (int colonne = 0 ; colonne < plateau[ligne].length ; colonne++){

				System.out.print(plateau[ligne][colonne] + "\t");
			}
			System.out.println();

		}
		return plateau;

	}
	//remplissage avec valeurs
	
	public static String [][] remplissagetableau (String [][] t) {
		String [][] plateauremplie= {{"a", "0", "5"},{"13"," 8", "9"}}; 
		plateauremplie = new String[6][10] ;

		
		for(int ligne=0;ligne<plateauremplie.length;ligne++) {
			for(int colonne=0;colonne<t[ligne].length;colonne++) {
				if (plateauremplie[ligne][colonne]==null) {
						plateauremplie[ligne][colonne] = "Alex";
				}
			}
		}
		System.out.println("gdyeugdiuhezbdhuiez"+plateauremplie);

		return plateauremplie;
	}

	
	public static int[]  sommeMêmeLongueur (int[]t1,int[]t2 ) {
		//fonctionne uniquement quand on envoie deux tableaux de meme longueur en paramètres
		int []nvtab;
		nvtab = new int[t1.length] ; 
		for (int i=0 ; i<t1.length; i++) {
			nvtab[i]= t1[i]+t2[i];
		}

		return nvtab;
	}
}


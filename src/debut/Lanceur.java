package debut;
import java.util.Scanner;

public class Lanceur {


	public static void main(String[] args) {
		int bg=5;
		Scanner saisie = new Scanner(System.in);
		Joueurs.VerificationsaisieNombreJoueurs(saisie);
		Joueurs.NomJoueur(saisie,bg);
		
/*
		
		String joueur1;
		joueur1=(SaisieNomJoueurs.saisieNomJoueurs(saisie));

		String joueur2;
		joueur2=(SaisieNomJoueurs.saisieNomJoueurs(saisie));

		String joueur3;
		joueur3=(SaisieNomJoueurs.saisieNomJoueurs(saisie));

		String joueur4;
		joueur4=(SaisieNomJoueurs.saisieNomJoueurs(saisie));
		
		
		String [][] p=(SaisieNomJoueurs.genereplateauentier(saisie));
		
		String [][] tabremplie =(SaisieNomJoueurs.remplissagetableau(p));
		System.out.println("dzadza ="+tabremplie);
		
		
		
		int[] tab1 = {14};
		int[] tab2 = {14};
		int[] tab= (SaisieNomJoueurs.sommeMêmeLongueur(tab1, tab2));
System.out.println(tab);
*/
	}


}

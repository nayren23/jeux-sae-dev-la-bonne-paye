package debut;

import java.util.Scanner;

public class NomJoueurs {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);

		String joueur1;
		joueur1=(saisieNomJoueurs(saisie));

		String joueur2;
		joueur2=(saisieNomJoueurs(saisie));

		String joueur3;
		joueur3=(saisieNomJoueurs(saisie));

		String joueur4;
		joueur4=(saisieNomJoueurs(saisie));
	}

	public static String saisieNomJoueurs(Scanner sc) {
		System.out.println("Saisir pseudo joueur  : ");
		String pseudo = sc.nextLine();
		return pseudo;

	}
}

package debut;
import java.util.Scanner;

public class CaseVendre {

	
	
	public static boolean choixDuJoueur(Scanner saisie) {
		boolean choixJoueur=false;
		int choix;

			System.out.println("Voulez vous vendre vos acquisition ?");
			System.out.println("1 pour oui, 0 pour non");
			choix = Integer.parseInt(saisie.nextLine());
			while (choix<0 || choix>1) {
				System.out.println("Entrez 0 ou 1 !! ");
				choix = Integer.parseInt(saisie.nextLine());
			}
			if (choix == 0)
				System.out.println("Dommage c'était un choix de qualité");
			if (choix == 1)
				choixJoueur=true;
		
		return choixJoueur;
}
}


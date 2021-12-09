package debut;
import java.util.Scanner;

public class Lanceur {


	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		Menu.menue(saisie);

		Joueurs.NomJoueur(saisie,Joueurs.VerificationsaisieNombreJoueurs(saisie));

		
		
		

		

	}


}

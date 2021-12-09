package debut;
import java.util.Scanner;

public class Lanceur {


	public static void main(String[] args) {
		int bg=5;
		Scanner saisie = new Scanner(System.in);
		Joueurs.VerificationsaisieNombreJoueurs(saisie);
		Joueurs.NomJoueur(saisie,bg);
		
	}


}

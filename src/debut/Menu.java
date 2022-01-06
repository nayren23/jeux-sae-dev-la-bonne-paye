package debut;


public class Menu {

	public static void menue() {   // renvoie le choix juste affiche et  faire class jeu

		System.out.println("LA BONNE PAYE");

		int choix=0;			
		do {
			System.out.println("1. Jouer");
			System.out.println("2.Lire les regles");
			System.out.println("3. Quitter\n");

			do {
				System.out.println("Saisissez votre choix entre 1 et 3: ");
				choix=Integer.parseInt(LaBonnePaye.saisie.nextLine());


			}
			while (choix < 1 || choix > 3);

			switch(choix) {


			case 1 :
				System.out.println("La partie commence:");
				Lanceur.lancerJeu();
				break;

			case 2 :
				Regles.regles();
				break;
			}
		}			
		while (choix<3);
		System.out.println("Au revoir :-) ");
	}
}

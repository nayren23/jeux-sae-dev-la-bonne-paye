package Launcher;

public class Menu {

	public static void menue() {   // renvoie le choix juste affiche et  faire class jeu
	
		System.out.println("\n										_________________________________\r\n"
				+ "										|				|\r\n"
				+ "										|     💰 LA BONNE PAYE !!!! 💰 	|\r\n"
				+ "										|_______________________________|	 \n");

		int choix=0;   

		do {
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t1. Jouer\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t2. Lire les regles\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t3. Quitter");


			do {
				System.out.println(" \n\t\t\t\t\t\t\t\t\t\tSaisissez votre choix entre 1 et 3: ");
				choix=Integer.parseInt(LaBonnePaye.saisie.nextLine());
			}
			while (choix!=1 && choix!=2 && choix !=3);

			switch(choix) {
			case 1 :
				ParametragePartie.choixManches();
				break;

			case 2 :
				Regles.regles();
				break;
			}
		}            
		while (choix<3);
		System.out.println("Au revoir 😢😭 ");
	}
}
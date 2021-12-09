package debut;

import java.util.Scanner;

public class Regles {

	public static void regles (Scanner saisie) {

		System.out.println("\t\t\t\t\t\t\t\t\t\t Comment jouer à La Bonne Paye ?\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Avant de démarrer la partie, les joueurs  décident du nombre de mois, c’est-à-dire du nombre de tours complets du plateau de jeu que va durer la partie.\r\n"
				+ "\r\n"
				+ "On peut décider de jouer pendant un mois, un trimestre voire même une année entière. Chaque joueur pose son pion sur la case Départ. \r\n"
				+ "Le jeu se déroule dans le sens des aiguilles d’une montre. A son tour de jeu, chaque joueur lance le dé et avance du nombre de cases correspondant au chiffre indiqué par le dé. \r\n"
				+ "A son tour de jeu, chaque joueur se retrouve donc sur une case dont il doit suivre les instructions.\r\n"
				+ "Pour jouer vous devez gérer au mieux votre budget pour cela vous avez la possibilité de faire des prêts auprès de la banque et aussi d’épargner votre argent.\r\n"
				+ "\r\n"
				+ "L’EPARGNE : Le banquier est responsable des opérations. Si un joueur possède une épargne il ne peut faire un emprunt auprès de la banque.\r\n"
				+ "L’épargnant met l’argent dans son livret. Si, par exemple, à la fin du mois il a épargné 1500 euros (ou 15 000 francs), il touchera 150 euros d’intérêts.\r\n"
				+ "\r\n"
				+ "Attention, l’épargnant ne peut toucher ses intérêts à la fin du mois, que s’il a versé les sommes dans son livret avant le 23 du mois (avant la case 23).\r\n"
				+ "Après le 23 du mois, il est en effet interdit de mettre de l’argent dans son livret.\r\n"
				+ "En revanche, si au cours du mois, il fait un retrait quelconque, il doit verser immédiatement 100 euros (ou 1000 francs) à la Banque, \r\n"
				+ "quel que soit le montant de son retrait.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "LES PRETS : \r\n"
				+ "\r\n"
				+ "-Les emprunts se font également à la Banque. Le montant d’un prêt est  de 1000 euros. \r\n"
				+ "Le banquier donne l’argent à l’emprunteur avec une carte de PRÊT qui sert de contrôle permanent.\r\n"
				+ "A la fin du mois, l’emprunteur paye les intérêts qui sont dus à la Banque. \r\n"
				+ "Les sommes empruntées peuvent être conservées par l’emprunteur sans les rembourser à la Banque pendant le mois,\r\n"
				+ "durant lequel l’emprunt a été contracté et durant les 2 mois suivants.Mais le joueur endetté doit obligatoirement rembourser,\r\n"
				+ " son emprunt le 31 du deuxième mois, sans recourir évidemment à un autre emprunt à la Banque à ce moment-là !\"\r\n"
				+ "");
	}

}

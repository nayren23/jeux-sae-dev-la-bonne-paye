package debut;
public class CaseAcquisitions {

	//tableau acquisition à la place de switch
	//tab deux dimensions chaque case acquisitions contient 1 acquisistion
	/**
	 * java doc
	 * @param cartes
	 */
	public static void menueAleatoireAcquisitions(String [][] cartes) {
		System.out.println("Piochez une carte");
		int choix = (int)(Math.random()*(15));//fois une variable car carte diminue avec le jeu
		CartesAcquisition.dessinCarte(CartesAcquisition.recupererCartesAcquisitions()[choix]);
	}
}
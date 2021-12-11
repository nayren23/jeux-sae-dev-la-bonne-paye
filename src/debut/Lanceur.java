package debut;
import java.util.Scanner;

public class Lanceur {


	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		CaseAcquisitions.menueAleatoireAcquisitions(CartesAcquisition.recupererCartesAcquisitions());
		
		Menu.menue(saisie);
		
		
		

		

	}


}

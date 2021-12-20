package debut;

public class PlateauClassique {
	static int cases =0;  // mettre maj kamel
	static int acionJoueur1=1;
	static int acionJoueur2=2;
	static int acionJoueur3=3;
	static int acionJoueur4=4;
	static int acionJoueur5=5;
	static int acionJoueur6=6;
	static int effetCase=7;




public static String[][] tableau (){
	String tableau[][] = new String [31][5];
	

	
	return tableau;
	
}

public static void remplirTableau (String[] [] tab,int) {
	
	
}

public static String[] creerCarteAcquisitions (String nom,  int prixAchat,int valeurReelle, int commission) {			//1 BELLE ANTIQUITE
	String[]carte = new String[4];
	carte [carteNom]= nom;
	carte [cartePrixAchat]= String.valueOf(prixAchat);
	carte [carteValeurReelle]= String.valueOf(valeurReelle);//caste int en string
	carte [carteCommission]=String.valueOf(commission) ;
	return carte;
}

}

package debut;

public class CartesCourrier{

    public static String[] creerCarteCourrier (String nom,  String texte ) {            
        String[]carte = new String[2];
        carte [0]= nom;
        carte [1]= String.valueOf(texte);

        return carte;
    }

    public static String[][] recupererCartesCourrier() {            
        String[][] cartes = new String[20][2];//2 pour les 2 chaines de caract�res
        cartes [0]=creerCarteCourrier("1 lettre de vos grand-parents","Salut mon petit loup , nous t'invitons papito et moi a venir passez les f�tes � la maison. " );     // Lettre RolePlay
        cartes [1] =creerCarteCourrier("1 lettre de vos grand-parents","Salut mon champion alors ce date tinder ?");                                                     // Lettre RolePlay
        cartes [2]=creerCarteCourrier("1 lettre de vos grand-parents","Salut mon petit bout de chou, tout va bien ? Ici on s'ennuis, la retraite quoi. " );                // Lettre RolePlay    
        cartes [3]=creerCarteCourrier("1 Assurance maladie","Vous etes couvert par la s�curit� social pendant 1 mois" );                                // Dispense de payer les frais m�dicaux ( pendant 1 mois )
        cartes [4]=creerCarteCourrier("1 Assurance voiture","Votre garagiste vous aime bien ! surtout votre femme" );                                    // Dispense de payer les frais de r�paration( pendant 1 mois )
        cartes [5]=creerCarteCourrier("1 Assurance maladie","Votre medecin a flash� sur vous !" );                                                        // Dispense de payer les frais m�dicaux ( pendant 1 mois )
        cartes [6]=creerCarteCourrier("1 Assurance voiture","Votre garagiste vous aime bien ! surtout votre femme");                                    // Dispense de payer les frais de r�paration ( pendant 1 mois )
        cartes [7]=creerCarteCourrier("1 Rendez-vous chez le medecin","Vous etes atteins du Covid-67, vous devez payer 200euros de frais m�dicaux." );    // payer 200 de Frais m�dicaux                 
        cartes [8]=creerCarteCourrier("1 Constat d'accident","Vous avez roul� sur un caillou un peu gros, payer 200euros de frais de r�paration " );    // payer 200 de Frais de r�paration
        cartes [9]=creerCarteCourrier("1 Lettre du tribunal", " Votre ex-femme vous poursuis en justice, payer 200 euros d'avocats" );                    // payer 200  
        cartes [10]=creerCarteCourrier("1 Concours de beaut�", " Vous avez �t� rep�rer par les dirigeants du concours et vous y �tes invit�");            // lettre RolePlay                
        cartes [11]=creerCarteCourrier("1 Lettre du maire ","Le maire vous envois ses voeux de fin d'ann�e 2020 ( oui en retard )" );                    // lettre RolePlay    
        cartes [12]=creerCarteCourrier("1 Lettre du comissariat","vous etes convoqu� au comissariat suite a une affaire de rixe" );                        // lettre RolePlay        
        cartes [13]=creerCarteCourrier("1 Journal m�t�o","il fait beau aujourd'hui ( presque genre juste quelques nuages gris )." );                    // lettre RolePlay
        cartes [14]=creerCarteCourrier("1 Rendez-vous chez le medecin","Vous avez un m�chant rhume et vous devez payer 200 euros de frais m�dicaux" );    // payer 200 de frais m�dicaux
        cartes [15]=creerCarteCourrier("1 Publicit�","Vous disposez de 50% sur la nouvelle Fiat Multiplat au concessionnaire de votre ville" );            // lettre RolePlay
        cartes [16]=creerCarteCourrier("1 Amende","vous avez �t� flash� a plus de 20 KM/H au dessus de la limitation de vitesse, -2 points sur le permis et 200euros a payer� la banque." ); // payer 200
        cartes [17]=creerCarteCourrier("1 Constat d'accident","Vous devez payer 200 euros de r�paration pour votre nouvelle trotinette" );                 // payer 200 de frais de r�paration
        cartes [18]=creerCarteCourrier("1 Constat d'accident","Vous vous avez d�cid� de drifter comme dans un film et devez changer vos pneus, payer 200 euros de frais de r�paration" ); // payer 200 de frais de r�paration
        cartes [19]=creerCarteCourrier("1 Rendez vous chez le m�decin","Vous vous etes foul� la cheville en jonglant, payer 200 de frais m�dicaux" );    // payer 200 de frais m�dicaux
        return cartes;
    }
    
    public static void menueAleatoireCourrier(String [][] cartes,int Nbcartes) {
        System.out.println("Piochez une carte");
        int choix=0;    
        for ( int c = 0; c <= Nbcartes; c++) {
            choix=(int)(Math.random()*(14));
            dessinCarte(recupererCartesCourrier()[choix]);
        }
    }
    
    
    public static void dessinCarte (String[]carte) {
        for (int i=0; i<carte.length;i++) {


        }

        System.out.println(""
                + " __________________________________\r\n"
                + "| " +carte [0]  +"            |\r\n"
                + "|                                 |\r\n"
                + "|_________________________________|\r\n"
                + "|"+ carte[1] +"             |\r\n"
                + "|                                 |\r\n"
                + "|                                 |\r\n"
                + "|_________________________________|");
    }
}

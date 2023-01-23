import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class Reception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int DerniereChambre = 0;

		Hotel h1 = new Hotel("LeDosRond");
		Employe e1 = new Employe ( "login", "mdp");
		Chambre ch1 = new Chambre(1, "suite", 1, 100);
		Chambre ch2 = new Chambre(0, "single", 2, 10);
		Chambre ch3 = new Chambre(1, "twin", 3, 35);
		Chambre ch4 = new Chambre(0, "double", 4, 20);
		Chambre ch5 = new Chambre(1, "double", 5, 20);
		
		Client c1 = new Client("Oscar", "personne");
		
		
		
		ArrayList<Chambre> ListeChambre = new ArrayList<Chambre>();
		h1.ajouterChambre(ch1);
		h1.ajouterChambre(ch2);
		h1.ajouterChambre(ch3);
		h1.ajouterChambre(ch4);
		h1.ajouterChambre(ch5);
		
		
		ArrayList<Client> ListeClient = new ArrayList<Client>();
		ListeClient.add(c1);
		
		ArrayList<Reservation> ListeReservation = new ArrayList<Reservation>();
		
		

	
		

		
		
		int choix = 0;
		while (choix != 8) {

			choix = affichageMenu();

			System.out.println(choix);

			if (choix == 1) {

				int sousChoix;
				System.out.println( " Quelles données souhaitez vous voir ? ");
				System.out.println( " 1.Chambres 2.Reservation ");
				sousChoix = sc.nextInt();
				
				
				if ( sousChoix == 1 ) {
				h1.affichageChambre(); }
			
				
				

			}

			else if (choix == 2) {
				
				int element = h1.chambreReservees();
				System.out.println( " Le nombre de chambre(s) reservées est de : " + element );
			}

			else if (choix == 3) {
			
				int element = h1.chambreLibres();
				System.out.println( " Le nombre de chambre(s) libres est de : " + element );
				
				
			}

			else if (choix == 4) {

				h1.PremiereChambreVide();
				h1.PremiereChambreAseLiberer();

			}

			else if (choix == 5) {
			
			System.out.println( DerniereChambre); }

			else if (choix == 6) {

				e1.MotDePasse();
				
				
				
				int numero = h1.ReserverUneChambre();
				Reservation r = new Reservation ( numero, numero) ;
				h1.ajouterReservation(r);
				r.setDerniereChambreLibre(numero);
				int element = r.nouvelleReservation();
				h1.ajouterReservation(r);
				System.out.println( " Merci de votre réservation, votre séjour sera de " + element + "jours");
				DerniereChambre = r.getDerniereChambreLibre();

				
				
			}

			else if (choix == 7) {

				e1.MotDePasse();
				h1.libererLaChambre(DerniereChambre);
				
				
				
			}
		}
		
		
		
		
	
	
	
	}
	
	
	

	public static int affichageMenu() {

		Scanner clavierMenu = new Scanner(System.in);
		System.out.println(" \n                              -----MENU HOTEL CDA JAVA:-----                      ");
		System.out.println("\n - 1. - Afficher l'état de l'hôtel    ");
		System.out.println("\n - 2. - Afficher le nombre de chambres réservées");
		System.out.println("\n - 3. - Afficher le nombre de chambres libres");
		System.out.println("\n - 4. - Afficher le numéro de la première chambre vide");
		System.out.println("\n - 5. - Afficher le numéro de la dernière chambre vide");
		System.out.println("\n - 6. - Réserver une chambre");
		System.out.println("\n - 7. - Libérer une chambre");
		System.out.println("\n - 8. - Quitter");
		System.out.println("-------------------------------------------------------------------------------------");

		int choix;
		System.out.println("Votre choix :");
		choix = clavierMenu.nextInt();
		return choix;

	}

}

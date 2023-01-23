

import java.util.ArrayList;
import java.util.Scanner;


public class Hotel {

	private String nom;
	private ArrayList<Chambre> ListeChambre = new ArrayList<>();
	private ArrayList<Reservation> ListeReservation = new ArrayList<>();
	private ArrayList<Client> ListeClient = new ArrayList<Client>();

	public Hotel(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Chambre> getListeChambre() {
		return ListeChambre;
	}

	public void setListeChambre(ArrayList<Chambre> listeChambre) {
		ListeChambre = listeChambre;
	}

	public ArrayList<Reservation> getListeReservation() {
		return ListeReservation;
	}

	public void setListeReservation(ArrayList<Reservation> listeReservation) {
		ListeReservation = listeReservation;
	}

	public ArrayList<Client> getListeClient() {
		return ListeClient;
	}

	public void setListeClient(ArrayList<Client> listeClient) {
		ListeClient = listeClient;
	}

	@Override
	public String toString() {
		return "Hotel [nom=" + nom + ", ListeChambre=" + ListeChambre + ", ListeReservation=" + ListeReservation
				+ "]";
	}

	public void affichageChambre() {
		for (Chambre chambre : ListeChambre) {
			System.out.println(chambre.toString());
		}
	}

	public void affichageClient() {
		for (Client client : ListeClient) {
			System.out.println(client.toString());
		}
	}

	public void affichageReservation() {
		for (Reservation reservation : ListeReservation) {
			System.out.println(reservation.toString());
		}
	}

	public void ajouterChambre(Chambre chambre) {
		ListeChambre.add(chambre);
	}

	public void ajouterClient(Client client) {
		ListeClient.add(client);
	}
	
	public void ajouterReservation(Reservation reservation) {
		ListeReservation.add(reservation);
	}
	
	
	public int chambreReservees() {
		int sommeChambre = 0;
		for (Chambre chambre : ListeChambre) {
			if (chambre.getLibre() == 1) {
				sommeChambre++;
			}
		}
		return sommeChambre;
	}

	public int chambreLibres() {
		int sommeChambre = 0;
		for (Chambre chambre : ListeChambre) {
			if (chambre.getLibre() == 0) {
				sommeChambre++;
			}
		}
		return sommeChambre;
	}

	public void PremiereChambreVide() {

		int PremiereChambreVide = 0;
		for (Chambre chambre : ListeChambre) {
			if (chambre.getLibre() == 0) {
				PremiereChambreVide = chambre.getNumero();

				System.out.println(" La premiere chambre vide est la : " + PremiereChambreVide);
				break;
			} 
			

		}
	}

	public void PremiereChambreAseLiberer() {

		for (Reservation reservation : ListeReservation) {
			int Durée = 5;
			if (reservation.getDurée() < Durée) {
				Durée = reservation.getDurée();
				int numero = reservation.getNumero();

				System.out.println(" la chambre " + numero + " sera liberer dans : " + Durée);
			}
			break;
		}

	}

	public void DerniereChambreVide() {
		for (Reservation reservation : ListeReservation) {
			int Depart = 1;
			if (reservation.getDurée() == 1) {
				int numero = reservation.getNumero();
				System.out.println(" La dernière chambre qui a été libérée est la : " + numero);
			}

		}
	}

	public int ReserverUneChambre() {

		int PremiereChambreVide = 0;
		for (Chambre chambre : ListeChambre) {
			if (chambre.getLibre() == 0) {
				PremiereChambreVide = chambre.getNumero();

				System.out.println(" Votre chambre sera la  : " + PremiereChambreVide);
				System.out.println(chambre.toString());
				chambre.setLibre(1);
				PremiereChambreVide = chambre.getNumero();
				break;
		}  
		
	} return PremiereChambreVide;

}

	public void libererLaChambre(int numero) {

		int DerniereChambreVide=0;
		for (Chambre chambre : ListeChambre) {
			if (chambre.getNumero()== numero) {
				chambre.setLibre(0);
				System.out.println( " La chambre numero : " + numero + " est libre ");
				break;
		}  
		
	} 

}	
	
	
	
	
	
}	
	
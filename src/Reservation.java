import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Reservation  {


private int numero;
private String DateDeDebut;
private String DateDeFin;
private int Durée;
private Client client;
private int derniereChambreLibre;



public int getDerniereChambreLibre() {
	return derniereChambreLibre;
}
public void setDerniereChambreLibre(int derniereChambreLibre) {
	this.derniereChambreLibre = derniereChambreLibre;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}


public Reservation(int numero, int derniereChambreLibre) {
	this.numero = numero;
	 this.derniereChambreLibre= derniereChambreLibre;
}


public int nouvelleReservation () {
	
	Scanner clavier = new Scanner (System.in);
	SimpleDateFormat formatter = new SimpleDateFormat( "dd-MM-yyyy");
	
	System.out.println(" Quel est votre nom ? ");
	String nom = clavier.next();
	System.out.println(" Quel est votre type ? ");
	String type = clavier.next();

	Client client = new Client(nom, type);
	this.client=client;
	
	

	System.out.println( " Renseignez la date d'entrée au format dd-MM-yyyy ");
	this.DateDeDebut = clavier.next();
	
	System.out.println( " Renseignez la date de depart au format dd-MM-yyyy ");
	this.DateDeFin = clavier.next();

	
	
	
	try {
		Date date = formatter.parse(DateDeFin);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		Date date1 = formatter.parse(DateDeDebut);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	this.Durée = DateDeFin.compareTo(DateDeDebut);
	return Durée;
	
}




public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getDateDeDebut() {
	return DateDeDebut;
}
public void setDateDeDebut(String dateDeDebut) {
	DateDeDebut = dateDeDebut;
}
public String getDateDeFin() {
	return DateDeFin;
}
public void setDateDeFin(String dateDeFin) {
	DateDeFin = dateDeFin;
}

public int getDurée() {
	return Durée;
}
public void setDurée(int durée) {
	Durée = durée;
}
@Override
public String toString() {
	return "Reservation [numero=" + numero + ", DateDeDebut=" + DateDeDebut + ", DateDeFin=" + DateDeFin + ", Durée="
			+ Durée + ", client=" + client +  "]";
}


}















	



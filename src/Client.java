import java.util.Scanner;



public class Client {

	private String nom;
	private String type;
	
	public Client(String nom, String type) {
		this.nom = nom;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", type=" + type + "]";
	}
	

	
	
	
	
}

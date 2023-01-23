public class Chambre {

	private int numero, prix, libre;
	private String type;

	public Chambre(int numero, String type, int libre, int prix) {
		this.numero = numero;
		this.prix = prix;
		this.libre = libre;
		this.type = type;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getLibre() {
		return libre;
	}

	public void setLibre(int libre) {
		this.libre = libre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chambre [numero=" + numero + ", prix=" + prix + ", libre=" + libre + ", type=" + type + "]";
	}


	
}

import java.util.Scanner;

public class Employe {

private String login;
private String mdp;


public Employe(String login, String mdp) {
	super();
	this.login = login;
	this.mdp = mdp;


}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}



@Override
public String toString() {
	return "Employe [login=" + login + ", mdp=" + mdp + "]";
}


public void MotDePasse () {
	Scanner clavier = new Scanner (System.in);
	
	String login="login";
	System.out.println( " Quel est votre login ? ");
	String TestL = clavier.next();
	
	if ( TestL.equals(login)) {
	
	String mdp="mdp";
	System.out.println( " Quel est votre mdp ? ");
	String TestM = clavier.next(); 
	
	if ( TestM.equals(mdp)) {
		System.out.println( " Acces autorisé ");
	}
	
	}
	else { System.out.println( " Acces refusé, login faux " ); }
}

	
	
	
	
}

package modele;

public class Client{
	
private String nom ;
private String prenom ;
private String adresse ;
private String telephone ;
private String email ;
public Client (){
	Setnom("");
	Setprenom("");
	setadresse("");
	settelephone("");
	setemail("");
}
public void Setprenom( String prenom) {
	this.prenom= prenom ;
	
}
public void Setnom(String nom) {
	this.nom=nom ;
	
}
public void setadresse(String adresse) {
	this.adresse=adresse ;
}
public void settelephone( String telephone) {
	this.telephone= telephone ;
	
}
public void setemail( String email) {
	this.email=email ;
	
}

	


}

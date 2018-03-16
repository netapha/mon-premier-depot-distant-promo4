public Employe{

private String nomEmploye;
private String prenomEmploye;
public Employe(){
}
// Constructeur avec un parametre

public Employe(String nomEmploye){
this.nomEmploye = nomEmploye}

public Employe(String nomEmploye,String prenomEmploye){
this.nomEmploye = nomEmploye
this.prenomEmploye = prenomEmploye}
// Getters et Setters
public String getNomEmploye(){
	return this.nomEmploye
}

public void setNomEmploye(String nomEmploye){
	this.nomEmploye = nomEmploye;
}
}
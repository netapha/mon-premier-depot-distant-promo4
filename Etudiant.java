public Etudiant{

private String nomEtudiant;
private String prenomEtudiant;
public Etudiant(){
}

public Etudiant(String nomEtudiant){
this.nomEtudiant = nomEtudiant}
public Etudiant(String nomEtudiant, String prenomEtudiant){
this.nomEtudiant = nomEtudiant
this.prenomEtudiant = prenomEtudiant
}
// Getters et Setters
public String getNomEtudiant(){
	return this.nomEtudiant
}
public void setNomEtudiant(String nomEtudiant){
	this.nomEtudiant = nomEtudiant;
}
public void affiche(){
	system.out.println(this.nomEtudiant+ " "+ this.prenomEtudiant)
}
}
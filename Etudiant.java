public Etudiant{

private String nomEtudiant;
private String nomEtudiant;
public Etudiant(){
}

public Etudiant(String nomEtudiant){
this.nomEtudiant = nomEtudiant}
// Getters et Setters
public String getNomEtudiant(){
	return this.nomEtudiant
}
public void setNomEtudiant(String nomEtudiant){
	this.nomEtudiant = nomEtudiant;
}
// Ajout de méthode métier
public void afficheInfo(){
	system.out.println(this.nomEtudiant+ " "+ this.prenomEtudiant);
}
}
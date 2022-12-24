package dao;
 public class Entreprise {
   private int id_Entreprise;
   private String nom_Entreprise;
   private region r;
 public Entreprise(int id_Entreprise, String nom_Entreprise, region r) {
	this.id_Entreprise = id_Entreprise;
	this.nom_Entreprise = nom_Entreprise;
	this.r = r;
}
 
public Entreprise() {
	super();
}

public int getId_Entreprise() {
	return id_Entreprise;
}
public void setId_Entreprise(int id_Entreprise) {
	this.id_Entreprise = id_Entreprise;
}
public String getNom_Entreprise() {
	return nom_Entreprise;
}
public void setNom_Entreprise(String nom_Entreprise) {
	this.nom_Entreprise = nom_Entreprise;
}
public region getR() {
	return r;
}
public void setR(region r) {
	this.r = r;
}


}

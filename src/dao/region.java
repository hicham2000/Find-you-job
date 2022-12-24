package dao;

import java.util.ArrayList;

public class region {
private int id_region;
private String nom_region;
//private ArrayList entreprises=new ArrayList(); 

public int getId_region() {
	return id_region;
}

public String getNom_region() {
	return nom_region;
}

//public ArrayList getEntreprises() {
	//return entreprises;
//}

public void setId_region(int id_region) {
	this.id_region = id_region;
}

public void setNom_region(String nom_region) {
	this.nom_region = nom_region;
}

//public void setEntreprises(ArrayList entreprises) {
//	this.entreprises = entreprises;
//}

public region(int id_region, String nom_region) {
	this.id_region = id_region;
	this.nom_region = nom_region;
	//this.entreprises = entreprises;
}

public region() {
	
}
}

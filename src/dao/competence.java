package dao;

import java.util.ArrayList;

public class competence {
	
private int id_competence;
private String comp;
private Poste poste;
private Secteur secteur;
public competence(int id_competence, String comp, Poste poste, Secteur secteur) {
	this.id_competence = id_competence;
	this.comp = comp;
	this.poste = poste;
	this.secteur = secteur;
}


public competence() {
	super();
}


public int getId_competence() {
	return id_competence;
}
public void setId_competence(int id_competence) {
	this.id_competence = id_competence;
}
public String getComp() {
	return comp;
}
public void setComp(String comp) {
	this.comp = comp;
}
public Poste getPoste() {
	return poste;
}
public void setPoste(Poste poste) {
	this.poste = poste;
}
public Secteur getSecteur() {
	return secteur;
}
public void setSecteur(Secteur secteur) {
	this.secteur = secteur;
}


}
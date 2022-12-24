package dao;

public class Missions {
 private int id_missions;
 private String nom_mission;
 private Poste poste;
 public Missions(int id_missions, String nom_mission, Poste poste) {
	this.id_missions = id_missions;
	this.nom_mission = nom_mission;
	this.poste = poste;
}
 
public int getId_missions() {
	return id_missions;
}
public void setId_missions(int id_missions) {
	this.id_missions = id_missions;
}
public String getNom_mission() {
	return nom_mission;
}
public void setNom_mission(String nom_mission) {
	this.nom_mission = nom_mission;
}
public Poste getPoste() {
	return poste;
}
public void setPoste(Poste poste) {
	this.poste = poste;
}
 
 
}

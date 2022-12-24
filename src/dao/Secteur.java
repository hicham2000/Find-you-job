package dao;

public class Secteur {

	private int id_secteur;
	private String nom_secteur;
	public Secteur(int id_secteur, String nom_secteur) {
		super();
		this.id_secteur = id_secteur;
		this.nom_secteur = nom_secteur;
	}
	
	public Secteur() {
		super();
	}

	public int getId_secteur() {
		return id_secteur;
	}
	public void setId_secteur(int id_secteur) {
		this.id_secteur = id_secteur;
	}
	public String getNom_secteur() {
		return nom_secteur;
	}
	public void setNom_secteur(String nom_secteur) {
		this.nom_secteur = nom_secteur;
	}
}

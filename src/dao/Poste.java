package dao;

public class Poste {

	private int id_poste;
	private String nom_poste;
	public Poste(int id_poste, String nom_poste) {
		this.id_poste = id_poste;
		this.nom_poste = nom_poste;
	}
	public int getId_poste() {
		return id_poste;
	}
	public void setId_poste(int id_poste) {
		this.id_poste = id_poste;
	}
	public String getNom_poste() {
		return nom_poste;
	}
	public void setNom_poste(String nom_poste) {
		this.nom_poste = nom_poste;
	}
	public Poste() {
		// TODO Auto-generated constructor stub
	}

}

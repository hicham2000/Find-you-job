package dao;

import java.util.ArrayList;

public class offre {
	private int id_offre;
	private static int compteur;
	private String nom_Offre;
    private Entreprise entreprise;
	public offre(int id_offre, String nom_Offre, Entreprise entreprise) {
		this.id_offre = id_offre;
		this.nom_Offre = nom_Offre;
		this.entreprise = entreprise;
	}
	
	public offre() {
		super();
	}

	public int getId_offre() {
		return id_offre;
	}
	public void setId_offre(int id_offre) {
		this.id_offre = id_offre;
	}
	public static int getCompteur() {
		return compteur;
	}
	public static void setCompteur(int compteur) {
		offre.compteur = compteur;
	}
	public String getNom_Offre() {
		return nom_Offre;
	}
	public void setNom_Offre(String nom_Offre) {
		this.nom_Offre = nom_Offre;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	
}

package dao;

import java.util.ArrayList;

public class Profil_Rechercher {
	protected int id_profil;
	protected String Niveau_Etude;
	protected String niveau_Experience;
	protected Poste poste;
	public Profil_Rechercher(int id_profil, String niveau_Etude, String niveau_Experience, Poste poste) {
		this.id_profil = id_profil;
		Niveau_Etude = niveau_Etude;
		this.niveau_Experience = niveau_Experience;
		this.poste = poste;
	}
	
	public Profil_Rechercher() {
		super();
	}

	public int getId_profil() {
		return id_profil;
	}
	public void setId_profil(int id_profil) {
		this.id_profil = id_profil;
	}
	public String getNiveau_Etude() {
		return Niveau_Etude;
	}
	public void setNiveau_Etude(String niveau_Etude) {
		Niveau_Etude = niveau_Etude;
	}
	public String getNiveau_Experience() {
		return niveau_Experience;
	}
	public void setNiveau_Experience(String niveau_Experience) {
		this.niveau_Experience = niveau_Experience;
	}
	public Poste getPoste() {
		return poste;
	}
	public void setPoste(Poste poste) {
		this.poste = poste;
	}
	
}
   
    
	
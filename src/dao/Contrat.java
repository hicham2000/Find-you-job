package dao;

public class Contrat {
	
private int id_Contrat;
private String type_Contrat;
private Profil_Rechercher profil;
private offre Offre;
public Contrat(int id_Contrat, String type_Contrat, Profil_Rechercher profil, offre offre) {
	this.id_Contrat = id_Contrat;
	this.type_Contrat = type_Contrat;
	this.profil = profil;
	Offre = offre;
}

public Contrat() {
	super();
}

public int getId_Contrat() {
	return id_Contrat;
}
public void setId_Contrat(int id_Contrat) {
	this.id_Contrat = id_Contrat;
}
public String getType_Contrat() {
	return type_Contrat;
}
public void setType_Contrat(String type_Contrat) {
	this.type_Contrat = type_Contrat;
}
public Profil_Rechercher getProfil() {
	return profil;
}
public void setProfil(Profil_Rechercher profil) {
	this.profil = profil;
}
public offre getOffre() {
	return Offre;
}
public void setOffre(offre offre) {
	Offre = offre;
}

}

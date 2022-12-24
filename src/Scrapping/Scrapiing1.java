package Scrapping;
import java.io.*;



import java.sql.*;
import java.util.ArrayList;
import javax.swing.plaf.synth.Region;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import dao.Contrat;
import dao.Entreprise;
import dao.Missions;
import dao.Profil_Rechercher;
import dao.Secteur;
import dao.competence;
import dao.offre;
import dao.region;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
public class Scrapiing1 {


	public static void main(String[] args) {
		
		String NomEntreprise;
		String h="";
		String competence = " ";
		Entreprise E1=new Entreprise();
		String nom_offre;
		offre O1= new offre();
		competence c1=new competence();
		String  Region;
		region R1=new region();
		String experience;
		String niveauEtude;
		Profil_Rechercher P1 =new Profil_Rechercher();
		String Type_contrat;
		Contrat C1 =new Contrat();
		String Secteur;
		Secteur S1 =new Secteur();
		ArrayList<String> returnList = new ArrayList<String>();
		ArrayList<String> rl = new ArrayList<String>();
		ArrayList<String> competences = new ArrayList<String>();
		competences.add("jee");
		competences.add("sql");
		competences.add("postgre sql");
		competences.add("bpmn");
		competences.add("bpmn ve");
		competences.add("solutions mdm");
		competences.add("devops");
		competences.add("gestion de logs");
		competences.add("monitoring");
		competences.add("cloud");
		competences.add("système d’information");
		competences.add("dotnet");
		competences.add("secteur des télécoms");
		competences.add("javaee");
		competences.add("spring");
		competences.add("hibernate");
		competences.add("git");
		competences.add("jenkins");
		competences.add("maven");
		competences.add("j2ee");
		competences.add("angular");
		competences.add("node js");
		competences.add("angular 11");
		competences.add("jsf");
		competences.add("jenkins ide");
		competences.add("perl");
		competences.add("sql server");
		competences.add("mvc");
		competences.add("batch");
		competences.add("jquery");
		competences.add("hibernate");
		competences.add("seleniumrc");
		competences.add("jenkins");
		competences.add("sonar");
		competences.add("svn");
		competences.add("debian");
		competences.add("rhel");
		competences.add("vmware");
		competences.add("nutanix");
		competences.add("kvm");
		competences.add("tcp/ip");
		competences.add("web services");
		competences.add("architectures 2/3 et 3/3");
		competences.add("scripting type shell");
		competences.add("python");
		competences.add("terraform");
		competences.add("ansible");
		competences.add("docker");
		competences.add("microservices");
		competences.add("système");
		competences.add("bases de données");
	   	competences.add("réseaux");
	   	competences.add("sécurité");
	   	competences.add("Oauth2");
	   	competences.add("gitLab ci/cd");
	   	competences.add("keycloak");
	   	competences.add("swagger");
	   	competences.add("api/rest");
	   	competences.add("scrum");
	   	competences.add("kubernetes");
		competences.add("architecture micro services");
		competences.add("google clould");
		competences.add("aws");
		competences.add("Podman");
		competences.add("jenkins");
		competences.add("jobs");
		competences.add("plugins");
		competences.add("prometheus");
		competences.add("grafana");
		competences.add("langage de commande de windows");
		competences.add("postgre SQL");
		competences.add("dotnet");
		competences.add("javascript");
		competences.add("angular");
		competences.add("node js");
		competences.add("php");
		competences.add("bdd");
		competences.add("atdd");
		competences.add("mapping");
		competences.add("maitrise de gherkin");
		competences.add("xray");
		competences.add("jira");
		competences.add("ms office");
		competences.add("Capacité d’analyse");
		competences.add("tws");
		competences.add("azure");
		competences.add("aws");
		competences.add("sql server");
		competences.add("oracle");
		competences.add("robot framework");
		competences.add("html");
		competences.add("xpath");
		competences.add("json");
		competences.add("selenium");
		competences.add("collections");
		competences.add("excel");
		competences.add("mail");
		competences.add("eclipse");
		competences.add("visual studio code");	
		//String req="";
		final String url1 ="https://www.rekrute.com/offres.html?s=3&p=1&o=1&sectorId%5B0%5D=24"; // 50 sur page 1
		final String url2 ="https://www.rekrute.com/offres.html?s=3&p=2&o=1&sectorId%5B0%5D=24"; // 50 sur page 1
		final String url3 ="https://www.rekrute.com/offres.html?s=3&p=3&o=1&sectorId%5B0%5D=24";
		final String url4 ="https://www.rekrute.com/offres.html?s=3&p=4&o=1&sectorId%5B0%5D=24"; // 50 sur page 1
		final String url5 ="https://www.rekrute.com/offres.html?s=3&p=5&o=1&sectorId%5B0%5D=24"; // 50 sur page 1
		final String url6 ="https://www.rekrute.com/offres.html?s=3&p=6&o=1&sectorId%5B0%5D=24";
		final String url7 ="https://www.rekrute.com/offres.html?s=3&p=7&o=1&sectorId%5B0%5D=24";
		final String url8 ="https://www.rekrute.com/offres.html?s=3&p=8&o=1&sectorId%5B0%5D=24";
		final String url9 ="https://www.rekrute.com/offres.html?s=3&p=9&o=1&sectorId%5B0%5D=24";
		final String url10="https://www.rekrute.com/offres.html?s=3&p=10&o=1&sectorId%5B0%5D=24";
		final String url11="https://www.rekrute.com/offres.html?s=2&p=1&o=1&sectorId%5B0%5D=24";
		final String url12="https://www.rekrute.com/offres.html?s=2&p=2&o=1&sectorId%5B0%5D=24";
		final String url13="https://www.rekrute.com/offres.html?s=2&p=3&o=1&sectorId%5B0%5D=24";
		final String url14="https://www.rekrute.com/offres.html?s=2&p=4&o=1&sectorId%5B0%5D=24";
		final String url15="https://www.rekrute.com/offres.html?s=2&p=5&o=1&sectorId%5B0%5D=24";
		final String url16="https://www.rekrute.com/offres.html?s=2&p=6&o=1&sectorId%5B0%5D=24";
		final String url17="https://www.rekrute.com/offres.html?s=2&p=7&o=1&sectorId%5B0%5D=24";
		final String url18="https://www.rekrute.com/offres.html?s=2&p=8&o=1&sectorId%5B0%5D=24";
		final String url19="https://www.rekrute.com/offres.html?s=2&p=9&o=1&sectorId%5B0%5D=24";
		final String url20="https://www.rekrute.com/offres.html?s=2&p=10&o=1&sectorId%5B0%5D=24";
		final String url21="https://www.rekrute.com/offres.html?s=2&p=11&o=1&sectorId%5B0%5D=24";
		final String url22="https://www.rekrute.com/offres.html?s=2&p=12&o=1&sectorId%5B0%5D=24";
	
		final String[] urls = {url1,url4,url5,url3,url4,url5,url6,url7,url8,url9,url10,url11,url12,url13,url14,url15,url16,url17,url18,url19,url20,url21,url22};
		try {
			for (String url : urls)
			{
				//recuperer le document http ou url
			final Document doc = Jsoup.connect(url).get();
		    Elements elements =doc.getElementsByClass("post-id");
		    for (Element link1: elements)
		    {
		        Elements TitreElement=link1.select("div.col-sm-2.col-xs-12 > a > img");
			    for (Element nom : TitreElement)
			    {
				   NomEntreprise=nom.attr("title");
				   System.out.println(NomEntreprise);
				   E1.setNom_Entreprise(NomEntreprise);
				
			    }
			   Elements element2=link1.select("h2 > a[href]");	
	           for (Element link: element2)
		       {
			       nom_offre=link.text();
			       System.out.println(nom_offre);
			       O1.setNom_Offre(nom_offre);
	
				  String href=link.attr("href");
				  String lien1="https://www.rekrute.com";
	     
		     final String[] lien2= {lien1+href};
		     for (String z : lien2)
		     {
		        try {
                   final Document doc1= Jsoup.connect(z).get();
					competence=doc1.select("div.col-md-12.blc:nth-of-type(5) > p").text();
                    System.out.println(competence);
					Elements Element4=doc1.select("div.col-md-10.col-sm-12.col-xs-12 > ul");
                    for (Element li : Element4)
                          {
                          Region=li.select("li:nth-of-type(2)").text();
                          System.out.println(Region);
                          R1.setNom_region(Region);
	                      }
			        }
	         				
            
			     catch (Exception e)//
			   {
				e.printStackTrace();
			   }
		   }
		Elements info = link1.getElementsByClass("info").get(2).getElementsByTag("ul").get(0).getElementsByTag("li");
		 for (Element liElement: info)
		 {
			   //secteur
			    Secteur=info.get(0).getElementsByTag("a").text();
				System.out.println(Secteur);
				//fonction
			    String fonction=info.get(1).getElementsByTag("a").text();
				System.out.println(fonction);
				//experience
				experience = info.get(2).getElementsByTag("a").text();
				System.out.println(experience);
			    //niveau Etude
				niveauEtude = info.get(3).getElementsByTag("a").text();
				System.out.println(niveauEtude);
				S1.setNom_secteur(Secteur);
				P1.setNiveau_Etude(niveauEtude);
				P1.setNiveau_Experience(experience);
				Type_contrat =info.get(4).getElementsByTag("a").text();
				System.out.println(Type_contrat);
			    C1.setType_Contrat(Type_contrat);
}
		 competence = competence.toLowerCase().trim().replaceAll("\\s+", " ").replaceAll("\\p{Punct}", "");
   		 for (String t : competences) {
   				
   				if (competence.contains(" " + t + " ") && t != null)
   					rl.add(t);
   				}

   				
   				// remove duplicates
   				for (String string : rl) {
   					if (!returnList.contains(string))
   					returnList.add(string);
   				}
   				//c1.setReturnList(returnList);
   				h=String.join(",",returnList);
   				c1.setComp(h);
   				//Insertion dans la base de donée
//		 try {
//			 
//				conexion_base test =new conexion_base();
//				Connection con=test.Connection();
//				Statement st=con.createStatement();
//				 String sql="INSERT INTO `offre`(`nom_offre`,`Secteur` ,`Type_contrat`, `nom_entreprise`, `niveau_etude`, `niveau_experience`, `competences`) VALUES ('"+O1.getNom_Offre()+"','"+S1.getNom_secteur()+"','"+C1.getType_Contrat()+"','"+E1.getNom_Entreprise()+"','"+P1.getNiveau_Etude()+"','"+P1.getNiveau_Experience()+"','"+c1.getComp()+"')";
//				 int r=st.executeUpdate(sql);
//				}
//			 catch(Exception e6){
//		  		    e6.printStackTrace();
//			    }
		
		 rl.clear();
		 returnList.clear();
}
	           }
	}
	}
catch(Exception e) {
e.printStackTrace();
} 
}
}


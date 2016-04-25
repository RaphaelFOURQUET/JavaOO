/**
 * 
 */
package fr.adaming.genericite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author INTI-0332
 *
 */
public class VoitureSansPermis extends Voiture {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")	//RFRF : Ne pas signaler les variables inutilisées comme warning.
	public static void main(String[] args) {
		// Auto-generated method stub
		List<Voiture> listVoiture1 = new ArrayList<Voiture>();
		List<VoitureSansPermis> listVoitureSPTest = new ArrayList<VoitureSansPermis>();
		//		listVoiture1 = listVoitureSPTest;   //Interdit ! Gestion de covariance Java pas top !

		//RFRF : Solution 1 ?
		//List n'acceptant que des instances de Voiture ou de ses sousclasses
		List<? extends Voiture> listVoitureSP1 = new ArrayList<VoitureSansPermis>();
		afficher(listVoitureSP1);
		//listVoitureSP1.add(new VoitureSansPermis());	//RFRF : Liste verrouillée en lecture seule si wildcard (?)

		//Liste de voiture
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		listVoiture.add(new Voiture());
		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		listVoitureSP.add(new VoitureSansPermis());
		listVoitureSP.add(new VoitureSansPermis());
		affiche(listVoiture);
		affiche(listVoitureSP); 
		
		
		//super
		System.out.println("----super : affiche2-------");
		 List<Voiture> listVoiture2 = new ArrayList<Voiture>();
		 listVoiture2.add(new Voiture());
		 listVoiture2.add(new Voiture());
		 List<Object> listVoitureSP2 = new ArrayList<Object>();
		 listVoitureSP2.add(new Object());
		 listVoitureSP2.add(new Object());
		 affiche2(listVoiture);
		 affiche2(listVoitureSP2);
	}

	//Méthode générique !
	static void afficher(List<? extends Voiture> list){
		//System.out.println("afficher()!");
		for(Voiture v : list)
			System.out.println(v);
	}

	//Avec cette méthode, on accepte aussi bien les collections de Voiture que les collection de VoitureSansPermis
	static void affiche(List<? extends Voiture> list){
		for(Voiture v : list)
			System.out.println(v.toString());
	}

	static void affiche2(List<? super Voiture> list){	//RFRF : extends peut etre remplace par super pour autoriser les super classes de voiture
		for(Object v : list) 
			System.out.println(v.toString());
	}




}

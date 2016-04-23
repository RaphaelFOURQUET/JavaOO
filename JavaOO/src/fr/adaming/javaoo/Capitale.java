/**
 * 
 */
package fr.adaming.javaoo;

//author : Raphael date : 21/04/2016
/**
 * @author INTI-0332
 *
 */
public class Capitale extends Ville {
	
	private String monument;
	
	//Accesseurs
	/**
	 * @return le nom du monument.
	 */
	public String getMonument() {
		return this.monument;
	}
	
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	//Constructeurs
	public Capitale() {
		//super();	//L'appel à super semble être automatique pour constructeur sans paramêtre
		this.setNomVille("Paris");
		this.monument = "aucun";
	}
	
	public Capitale(String nomVille) {
		super(nomVille);	//Idem, appel automatisé au constructeur Sans paramêtre si pas de super precise.	
		//this.setNomVille(nomVille);
		this.monument = "aucun";
	}
	
	/**
	 * @param nomVille
	 * @param nomPays
	 * @param nbreHabitants
	 * @param monument
	 */
	public Capitale(String nomVille, String nomPays, int nbreHabitants, String monument) {
		super(nomVille, nomPays, nbreHabitants);
		this.monument = monument;
	}

	/** 
	 * Description d'une capitale 
	 * @return String retourne la description de l'objet 
	 */  
	public String toString(){
		//String str = "[monument=" + this.monument + "]";
		String str = super.toString()+ "[monument=" + this.monument + "]";
		return str;
	} 



}

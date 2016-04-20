/**
 * 
 */
package test;

//author : Raphael date : 20/04/2016
/**
 * @author INTI-0332
 *
 */
public class Ville {
	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private double superficie;
	private String maire;
	private String nomHabitants;
	private char categorie;

	//Get/Set
	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/**
	 * @param nomPays the nomPays to set
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @return the nbreHabitants
	 */
	public int getNbreHabitants() {
		return nbreHabitants;
	}

	/**
	 * @param nbreHabitants the nbreHabitants to set
	 */
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
		choixCategorie();
	}
	
	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the maire
	 */
	public String getMaire() {
		return maire;
	}

	/**
	 * @param maire the maire to set
	 */
	public void setMaire(String maire) {
		this.maire = maire;
	}

	/**
	 * @return the nomHabitants
	 */
	public String getNomHabitants() {
		return nomHabitants;
	}

	/**
	 * @param nomHabitants the nomHabitants to set
	 */
	public void setNomHabitants(String nomHabitants) {
		this.nomHabitants = nomHabitants;
	}
	
	public char getCategorie() {
		return categorie;
	}

	//Constructeurs
	public Ville() {
		System.out.println("Création d'une Ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}

	/**
	 * @param nomVille Nom de la ville.
	 */
	public Ville(String nomVille) {
		System.out.println("Création de la Ville "+nomVille+".");
		this.nomVille = nomVille;
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}

	/**
	 * @param nomVille Nom de la ville.
	 * @param nbreHabitants Nombre d'habitants.
	 */
	public Ville(String nomVille, int nbreHabitants) {
		this.nomVille = nomVille;
		this.nbreHabitants = nbreHabitants;
		nomPays = "Inconnu";
		choixCategorie();
	}

	/**
	 * @param nomVille Nom de la ville.
	 * @param nomPays Nom du pays.
	 */
	public Ville(String nomVille, String nomPays) {
		System.out.println("Création de la Ville "+nomVille+" en "+nomPays+".");
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		nbreHabitants = 0;
	}

	/**
	 * @param nomVille Nom de la ville.
	 * @param nbreHabitants Nombre d'habitants.
	 * @param nomPays Nom du pays.
	 */
	public Ville(String nomVille, String nomPays, int nbreHabitants) {
		System.out.println("Création de la Ville "+nomVille+" en "+nomPays+" avec "+nbreHabitants+" habitants.");
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.nbreHabitants = nbreHabitants;
		choixCategorie();
	}
	
	public Ville(String nomVille, String nomPays, int nbreHabitants, double superficie, String maire, String nomHabitants) {
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.nbreHabitants = nbreHabitants;
		this.superficie = superficie;
		this.maire = maire;
		this.nomHabitants = nomHabitants;
		choixCategorie();
	}
	
	public String toString() {
		return "Ville [nomVille=" + nomVille + ", nomPays=" + nomPays + ", nbreHabitants=" + nbreHabitants
				+ ", superficie=" + superficie + ", maire=" + maire + ", nomHabitants=" + nomHabitants + ", categorie="
				+ categorie + "]";
	}

	private void choixCategorie() {	//plus propre par set comme dans la solution p79
		if(this.nbreHabitants<1000)
			categorie = 'A';
		else if(this.nbreHabitants<10_000)
			categorie = 'B';
		else categorie = 'C';
		
	}
	
	public String comparer(Ville v) {
		String res = new String();
		if(this.nbreHabitants < v.getNbreHabitants())
			res = v.getNomVille()+" est plus peuplee que "+this.nomVille+".";
		else if(this.nbreHabitants > v.getNbreHabitants())
			res = v.getNomVille()+" est moins peuplee que "+this.nomVille+".";
		else res = v.getNomVille()+ " et "+this.getNomVille()+" ont le meme nombre d habitants.";
		return res;
	}

}

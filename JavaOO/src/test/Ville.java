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
	
	//Variables publiques qui comptent les instances  
	public static int nbreVilles = 0;
	
	//Variable privée qui comptera aussi les instances
	private static int nbreVillesBis = 0; 

	//Get/Set
	
	public static int getNbreVillesBis() {
		return nbreVillesBis;
	}
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
		choixCategorie();
		nbreVilles++;
		nbreVillesBis++;
	}

	/**
	 * @param nomVille Nom de la ville.
	 */
	public Ville(String nomVille) {
		System.out.println("Création de la Ville "+nomVille+".");
		this.nomVille = nomVille;
		nomPays = "Inconnu";
		nbreHabitants = 0;
		choixCategorie();
		nbreVilles++;
		nbreVillesBis++;
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
		nbreVilles++;
		nbreVillesBis++;
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
		choixCategorie();
		nbreVilles++;
		nbreVillesBis++;
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
		nbreVilles++;
		nbreVillesBis++;
	}
	
	public Ville(String nomVille, String nomPays, int nbreHabitants, double superficie, String maire, String nomHabitants) {
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.nbreHabitants = nbreHabitants;
		this.superficie = superficie;
		this.maire = maire;
		this.nomHabitants = nomHabitants;
		choixCategorie();
		nbreVilles++;
		nbreVillesBis++;
	}
	
	public String toString() {
		return "Ville [nomVille=" + nomVille + ", nomPays=" + nomPays + ", nbreHabitants=" + nbreHabitants
				+ ", superficie=" + superficie + ", maire=" + maire + ", nomHabitants=" + nomHabitants + ", categorie="
				+ categorie + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categorie;
		result = prime * result + ((maire == null) ? 0 : maire.hashCode());
		result = prime * result + nbreHabitants;
		result = prime * result + ((nomHabitants == null) ? 0 : nomHabitants.hashCode());
		result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
		result = prime * result + ((nomVille == null) ? 0 : nomVille.hashCode());
		long temp;
		temp = Double.doubleToLongBits(superficie);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		//On vérifie si les references d'objet sont identiques.
		if (this == obj)
			return true;
		
		//Si objet null
		if (obj == null)
			return false;
		
		//Verification de la classe des objets.
		if (getClass() != obj.getClass())
			return false;
		
		//Comparaison des attributs
		Ville other = (Ville) obj;
		if (categorie != other.categorie)
			return false;
		if (maire == null) {
			if (other.maire != null)
				return false;
		} else if (!maire.equals(other.maire))
			return false;
		if (nbreHabitants != other.nbreHabitants)
			return false;
		if (nomHabitants == null) {
			if (other.nomHabitants != null)
				return false;
		} else if (!nomHabitants.equals(other.nomHabitants))
			return false;
		if (nomPays == null) {
			if (other.nomPays != null)
				return false;
		} else if (!nomPays.equals(other.nomPays))
			return false;
		if (nomVille == null) {
			if (other.nomVille != null)
				return false;
		} else if (!nomVille.equals(other.nomVille))
			return false;
		if (Double.doubleToLongBits(superficie) != Double.doubleToLongBits(other.superficie))
			return false;
		return true;
	}
	
	private void choixCategorie() {	//plus propre par set comme dans la solution p79 mais si tableau tres grand else if mieux.
		if(this.nbreHabitants == 0)
			categorie = '?';
		else if(this.nbreHabitants < 1000)
			categorie = 'A';
		else if(this.nbreHabitants < 10_000)
			categorie = 'B';
		else categorie = 'C';
		
	}
	
	public String comparer(Ville v) {
		String res = " ";
		if(this.nbreHabitants < v.getNbreHabitants())
			res = v.getNomVille()+" est plus peuplee que "+this.nomVille+".";
		else if(this.nbreHabitants > v.getNbreHabitants())
			res = v.getNomVille()+" est moins peuplee que "+this.nomVille+".";
		else res = v.getNomVille()+ " et "+this.nomVille+" ont le meme nombre d habitants.";
		return res;
	}

}

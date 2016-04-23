/**
 * 
 */
package fr.adaming.javaoo;

//author : Raphael date : 20/04/2016
/**
 * @author INTI-0332
 *
 */
public class Village extends Ville{

	//Constructeurs
	/**
	 * 
	 */
	public Village() {
		super();
		System.out.println("Creation d'un Village !");
	}

	/**
	 * @param nomVille
	 * @param nbreHabitants
	 * @throws NombreHabitantsException 
	 * @throws NomVilleException 
	 */
	public Village(String nomVille, int nbreHabitants) throws NombreHabitantsException, NomVilleException {
		super(nomVille, nbreHabitants);
		// Auto-generated constructor stub
	}

	/**
	 * @param nomVille
	 * @param nomPays
	 * @param nbreHabitants
	 */
	public Village(String nomVille, String nomPays, int nbreHabitants) {
		super(nomVille, nomPays, nbreHabitants);
		// Auto-generated constructor stub
	}

	/**
	 * @param nomVille
	 * @param nomPays
	 */
	public Village(String nomVille, String nomPays) {
		super(nomVille, nomPays);
		// Auto-generated constructor stub
	}

	/**
	 * @param nomVille
	 */
	public Village(String nomVille) {
		super(nomVille);
		// Auto-generated constructor stub
	}

	public String toString() {
		return "Village [getNomVille()=" + getNomVille() + ", getNomPays()=" + getNomPays() + ", getNbreHabitants()="
				+ getNbreHabitants() + ", getSuperficie()=" + getSuperficie() + ", getMaire()=" + getMaire()
				+ ", getNomHabitants()=" + getNomHabitants() + ", getCategorie()=" + getCategorie() + "]";
	}
	

}

/**
 * 
 */
package test;

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
	 */
	public Village(String nomVille, int nbreHabitants) {
		super(nomVille, nbreHabitants);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nomVille
	 * @param nomPays
	 * @param nbreHabitants
	 */
	public Village(String nomVille, String nomPays, int nbreHabitants) {
		super(nomVille, nomPays, nbreHabitants);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nomVille
	 * @param nomPays
	 */
	public Village(String nomVille, String nomPays) {
		super(nomVille, nomPays);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nomVille
	 */
	public Village(String nomVille) {
		super(nomVille);
		// TODO Auto-generated constructor stub
	}
	

}

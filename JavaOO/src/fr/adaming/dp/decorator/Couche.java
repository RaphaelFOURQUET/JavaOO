/**
 * 
 */
package fr.adaming.dp.decorator;

/**
 * @author INTI-0332
 *
 */
public abstract class Couche extends Patisserie {
	//Variables
	protected Patisserie pat;
	protected String nom;
	
	public Couche(Patisserie pat) {
		this.pat = pat;
	}
	
	public String preparer() {
		return pat.preparer()+nom;
	}

}

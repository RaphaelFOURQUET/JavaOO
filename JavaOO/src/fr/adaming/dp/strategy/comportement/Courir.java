/**
 * 
 */
package fr.adaming.dp.strategy.comportement;

/**
 * @author INTI-0332
 *
 */
public class Courir implements IDeplacement {

	/* (non-Javadoc)
	 * @see fr.adaming.dpstrategy.IDeplacement#deplacer()
	 */
	@Override
	public void deplacer() {
		System.out.println("Je me deplace en courant !");

	}

}

/**
 * 
 */
package fr.adaming.dp.strategy.comportement;

/**
 * @author INTI-0332
 *
 */
public class PremierSoin implements ISoin {

	/* (non-Javadoc)
	 * @see fr.adaming.dpstrategy.ISoin#soigne()
	 */
	@Override
	public void soigner() {
		System.out.println("Je donne les premiers soins !");

	}

}

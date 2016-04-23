/**
 * 
 */
package fr.adaming.dpstrategy.comportement;

/**
 * @author INTI-0332
 *
 */
public class AucunSoin implements ISoin {

	/* (non-Javadoc)
	 * @see fr.adaming.dpstrategy.ISoin#soigne()
	 */
	@Override
	public void soigner() {
		System.out.println("Je ne donne aucun soin !");
	}

}

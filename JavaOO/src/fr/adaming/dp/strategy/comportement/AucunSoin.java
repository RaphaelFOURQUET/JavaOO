/**
 * 
 */
package fr.adaming.dp.strategy.comportement;

/**
 * @author INTI-0332
 *
 */
public class AucunSoin implements ISoin {

	/* (non-Javadoc)
	 * @see fr.adaming.dpstrategy.ISoin#soigner()
	 */
	@Override
	public void soigner() {
		System.out.println("Je ne donne aucun soin !");
	}

}

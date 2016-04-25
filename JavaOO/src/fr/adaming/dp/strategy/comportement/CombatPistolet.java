/**
 * 
 */
package fr.adaming.dp.strategy.comportement;

/**
 * @author INTI-0332
 *
 */
public class CombatPistolet implements IEspritCombatif {

	/* (non-Javadoc)
	 * @see fr.adaming.dpstrategy.EspritCombatif#combat()
	 */
	@Override
	public void combattre() {
		System.out.println("Je me bats au pistolet !");

	}

}

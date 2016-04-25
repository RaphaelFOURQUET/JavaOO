/**
 * 
 */
package fr.adaming.dp.strategy.comportement;

/**
 * @author INTI-0332
 *
 */
public class Pacifiste implements IEspritCombatif {

	/* (non-Javadoc)
	 * @see fr.adaming.dpstrategy.EspritCombatif#combat()
	 */
	@Override
	public void combattre() {
		System.out.println("Je ne combats pas !");

	}

}

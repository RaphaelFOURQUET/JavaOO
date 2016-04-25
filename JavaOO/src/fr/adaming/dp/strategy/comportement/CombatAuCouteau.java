/**
 * 
 */
package fr.adaming.dp.strategy.comportement;

/**
 * @author INTI-0332
 *
 */
public class CombatAuCouteau implements IEspritCombatif {

	@Override
	public void combattre() {
		System.out.println("Je me bats au couteau !");
	}

}
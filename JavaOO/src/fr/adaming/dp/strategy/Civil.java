/**
 * 
 */
package fr.adaming.dp.strategy;

import fr.adaming.dp.strategy.comportement.*;

/**
 * @author INTI-0332
 *
 */
public class Civil extends Personnage {

	/*@Override
	public void seDeplacer() {
		System.out.println("Je me déplace à pied.");
	}

	@Override
	public void combattre() {
		System.out.println("Je ne combats PAS !");	
	}*/

	//	public void combattre(){
	//		if(this.getArmes().equals("couteau")) 
	//			System.out.println("Attaque au couteau !");
	//		else      System.out.println("Je ne combats PAS !"); 
	//	} 


	public Civil() {}

	public Civil(IEspritCombatif esprit, ISoin soin, IDeplacement dep) { 
		super(esprit, soin, dep); 
	} 

}

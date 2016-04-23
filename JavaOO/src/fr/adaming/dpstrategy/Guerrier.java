/**
 * 
 */
package fr.adaming.dpstrategy;

import fr.adaming.dpstrategy.comportement.*;
/**
 * @author INTI-0332
 *
 */
public class Guerrier extends Personnage {

	//RFRF : remonté dans superclasse Personnage
	/*@Override
	public void seDeplacer() {
		 System.out.println("Je me déplace à pied.");

	}*/

	//	public void combattre() {
	//		if(this.getArmes().equals("pistolet"))
	//			System.out.println("Attaque au pistolet !");
	//		else if(this.getArmes().equals("fusil de sniper"))
	//			System.out.println("Attaque au fusil de sniper !");
	//		else      System.out.println("Attaque au couteau !");
	//	}
	//	
	//	public void soigner() {
	//		if(!this.getSacDeSoin().equals(""))
	//			System.out.println("J'administre les premiers soins !");
	//		else System.out.println("Je ne soigne pas !");
	//	}

	public Guerrier(){
		this.espritCombatif = new CombatAuCouteau();
	} 

	public Guerrier(IEspritCombatif esprit, ISoin soin, IDeplacement dep) { 
		super(esprit, soin, dep); 
	} 

}

/**
 * 
 */
package fr.adaming.dpstrategy;

import fr.adaming.dpstrategy.comportement.*;
/**
 * @author INTI-0332
 *
 */
public class Medecin extends Personnage {

	/*@Override
	public void seDeplacer() {
		System.out.println("Je me déplace à pied.");		
	}*/

	/*public void soigner() {
		System.out.println("Je soigne les blessures."); 
	}*/

	//RFRF : Ajout de combattre() en classe abstraite Personnage.
	/*@Override
	public void combattre() {
		System.out.println("Vive le scalpel !");		
	}*/

	//	public void combattre() { 
	//		if(this.getArmes().equals("pistolet"))  
	//			System.out.println("Attaque au pistolet !");
	//		else      System.out.println("Vive le scalpel !");
	//	} 
	//
	//	public void soigner(){  
	//		if(this.getSacDeSoin().equals("petit sac"))   
	//			System.out.println("Je peux recoudre des blessures.");  
	//		else      System.out.println("Je soigne les blessures."); 
	//	} 

	public Medecin() { 
		this.soin = new PremierSoin();
	} 

	public Medecin(IEspritCombatif esprit, ISoin soin, IDeplacement dep) {  
		super(esprit, soin, dep); 
	} 

}

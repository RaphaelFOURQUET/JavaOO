/**
 * 
 */
package fr.adaming.dp.strategy;

import fr.adaming.dp.strategy.comportement.*;

//author : Raphael date : 22/04/2016
/**
 * @author INTI-0332
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//		// Auto-generated method stub
		//		Personnage[] tPers = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()}; 
		//		String[] tArmes = {"pistolet", "pistolet", "couteau", "fusil à pompe", "couteau"};
		//
		//		for(int i = 0; i < tPers.length; i++){
		//			System.out.println("\nInstance de " + tPers[i].getClass().getName());
		//			System.out.println("*****************************************"); 
		//			tPers[i].combattre(); 
		//			tPers[i].setArmes(tArmes[i]);
		//			tPers[i].combattre();  
		//			tPers[i].seDeplacer(); 
		//			tPers[i].soigner(); 
		//		}

		Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};
		for(int i = 0; i < tPers.length; i++){
			System.out.println("\nInstance de " + tPers[i].getClass().getName()); 
			System.out.println("*****************************************");  
			tPers[i].combattre(); 
			tPers[i].seDeplacer(); 
			tPers[i].soigner();  
		} 
		
		System.out.println("---------Test ajout comportement !-----");
		Personnage pers = new Guerrier();
		
		pers.soigner();
		pers.setSoin(new PremierSoin());
		pers.soigner();
		System.out.println();
		
		pers.combattre();
		pers.setEspritCombatif(new CombatPistolet());
		pers.combattre();
		System.out.println();
		
		pers.seDeplacer();
		pers.setDeplacement(new Courir());
		pers.seDeplacer();
		
	} 
}


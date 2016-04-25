/**
 * 
 */
package fr.adaming.dp.strategy;

import fr.adaming.dp.strategy.comportement.*;
/**
 * @author INTI-0332
 *
 */
public abstract class Personnage {
	
	/*private String armes = "";
	private String chaussure = "";
	private String sacDeSoin = "";*/
	
	 //Nos instances de comportement
	protected IEspritCombatif espritCombatif = new Pacifiste();
	protected ISoin soin = new AucunSoin();
	protected IDeplacement deplacement = new Marcher();
	
	//RFRF : Accesseurs
//	/**
//	 * @return the arme
//	 */
//	public String getArmes() {
//		return armes;
//	}

	/**
	 * @return the espritCombatif
	 */
	public IEspritCombatif getEspritCombatif() {
		return espritCombatif;
	}

	/**
	 * @param espritCombatif the espritCombatif to set
	 */
	public void setEspritCombatif(IEspritCombatif espritCombatif) {
		this.espritCombatif = espritCombatif;
	}

	/**
	 * @return the soin
	 */
	public ISoin getSoin() {
		return soin;
	}

	/**
	 * @param soin the soin to set
	 */
	public void setSoin(ISoin soin) {
		this.soin = soin;
	}

	/**
	 * @return the deplacement
	 */
	public IDeplacement getDeplacement() {
		return deplacement;
	}

	/**
	 * @param deplacement the deplacement to set
	 */
	public void setDeplacement(IDeplacement deplacement) {
		this.deplacement = deplacement;
	}

//	/**
//	 * @param arme the arme to set
//	 */
//	public void setArmes(String arme) {
//		this.armes = arme;
//	}

//	/**
//	 * @return the chaussure
//	 */
//	public String getChaussure() {
//		return chaussure;
//	}

//	/**
//	 * @param chaussure the chaussure to set
//	 */
//	public void setChaussure(String chaussure) {
//		this.chaussure = chaussure;
//	}
//
//	/**
//	 * @return the sacDeSoin
//	 */
//	public String getSacDeSoin() {
//		return sacDeSoin;
//	}
//
//	/**
//	 * @param sacDeSoin the sacDeSoin to set
//	 */
//	public void setSacDeSoin(String sacDeSoin) {
//		this.sacDeSoin = sacDeSoin;
//	}
	
	//RFRF : Constructeurs
	 //Constructeur sans paramêtre
	public Personnage(){}   
	
	//Constructeur avec paramètres
	public Personnage(IEspritCombatif espritCombatif, ISoin soin, IDeplacement deplacement) {
		this.espritCombatif = espritCombatif;
		this.soin = soin;
		this.deplacement = deplacement; 
	}

	//RFRF : Methodes
	public void seDeplacer() {
		//On utilise les objets de déplacement de façon polymorphe
		deplacement.deplacer();
	}
	
	public void combattre() {
//		System.out.println("Je ne combats PAS !");
		//On utilise les objets de déplacement de façon polymorphe
		espritCombatif.combattre(); 
	}
	
	public void soigner(){
//		System.out.println("Je ne soigne pas.");
		//On utilise les objets de déplacement de façon polymorphe
		soin.soigner(); 
	} 
	

}

/**
 * 
 */
package fr.adaming.io;

/**
 * @author INTI-0332
 *
 */
public class Notice {
	private String langue;

	public Notice(){
		this.langue = "Fran�ais";
	}

	public Notice(String lang){
		this.langue = lang;
	}

	public String toString() {
		return "\t Langue de la notice : " + this.langue + "\n";
	} 

}

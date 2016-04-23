/**
 * 
 */
package fr.adaming.enumeration;

/**
 * @author INTI-0332
 *
 */
//public enum Langage {
//	JAVA,
//	C,
//	CPlus,
//	PHP;
//}

public enum Langage {
	JAVA("Langage JAVA", "Eclipse"),
	C("Langage C", "Code Blocks"),
	CPlus("Langage C++", "Visual Studio"),
	PHP("Langage PHP", "PS Pad");

	private String name = "";
	private String editor = "";
	
	//Accesseurs
	public String getEditor() {
		return this.editor;
	}

	//Constructeur  
	Langage(String name, String editor){
		this.name = name;
		this.editor = editor;
	}

	public String toString(){
		return name;
	} 

}

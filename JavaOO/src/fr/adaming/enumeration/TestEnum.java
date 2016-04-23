/**
 * 
 */
package fr.adaming.enumeration;

/**
 * @author INTI-0332
 *
 */
public class TestEnum {

	public static void main(String args[]){
		for(Langage lang : Langage.values()){
			if(Langage.JAVA.equals(lang))
				System.out.println("J'aime le : " + lang);
			else
				System.out.println(lang);
		}

		Langage l1 = Langage.JAVA;
		Langage l2 = Langage.C;

		System.out.println("Editeur : "+l1.getEditor());
		System.out.println("Editeur : "+l2.getEditor());
	}

}

/**
 * 
 */
package fr.adaming.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author INTI-0332
 *
 */
public class TestGenericite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		System.out.println("Liste de String !");
		System.out.println("------------------------------");
		List<String> listeString = new ArrayList<String>();
		listeString.add("Une cha�ne");
		listeString.add("Une autre");
		listeString.add("Encore une autre");
		listeString.add("Allez, une derni�re");
		for(String str : listeString)
			System.out.println(str);
		
		System.out.println("\nListe de float");
		System.out.println("------------------------------");
		List<Float> listeFloat = new ArrayList<Float>();
		listeFloat.add(12.25f);
		listeFloat.add(15.25f);
		listeFloat.add(2.25f);
		listeFloat.add(128764.25f);
		for(float f : listeFloat) 
			System.out.println(f); 
	}

}

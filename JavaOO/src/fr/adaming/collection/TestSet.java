/**
 * 
 */
package fr.adaming.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author INTI-0332
 *
 */
public class TestSet {	//RFRF : Set Pas de doublons mais utile pour manipuler un grand nombre de données.
						//RFRF : TreeSet pour une collection constamment trié.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("\nParcours avec un tableau d'objet");
		System.out.println("-----------------------------------");
		Object[] obj = hs.toArray();
		for(Object o : obj)
			System.out.println(o);
		
	}

}

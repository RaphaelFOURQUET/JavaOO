/**
 * 
 */
package fr.adaming.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author INTI-0332
 *
 */
public class TestMap {	//RFRF : Les Map ne sont pas tri�es.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Hashtable<Integer, Object> ht = new Hashtable<>();	//RFRF : HashTable n'accepte pas null mais est Thread safe.
		 ht.put(1, "printemps");
		 ht.put(10, "�t�");
		 ht.put(12, "automne");
		 ht.put(45, "hiver");
		 
		 Enumeration<Object> e = ht.elements();
		 while(e.hasMoreElements())
			 System.out.println(e.nextElement());
		 
		 //RFRF : HashMap accepte null mais non Thread Safe.

	}

}

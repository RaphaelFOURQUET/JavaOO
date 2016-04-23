/**
 * 
 */
package fr.adaming.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author INTI-0332
 *
 */
public class TestList {	//RFRF : Listes, indice + non unicit� des valeurs.

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Object> l = new LinkedList<Object>();	//RFRF : Rajout en mileu de liste simplifi�.
		l.add(12);
		l.add("toto ! !");
		l.add(12.20f);
		for(int i = 0; i < l.size();i++)
			System.out.println("�l�ment � l'index " + i + " = " + l.get(i));

		System.out.println("\n \tParcours avec un it�rateur ");
		System.out.println("-----------------------------------");
		ListIterator<Object> li = l.listIterator();
		while(li.hasNext())
			System.out.println(li.next()); 
		System.out.println();

		ArrayList<Object> al = new ArrayList<Object>();	//RFRF : Rapide en lecture.
		al.add(15);
		al.add("Une cha�ne de caract�res !");
		al.add(152.50f);
		al.add('d');
		for(int i = 0; i < al.size(); i++)
			System.out.println("donn�e � l'indice " + i + " = " + al.get(i));
		
		System.out.println("\n \tParcours avec un it�rateur ");
		System.out.println("-----------------------------------");
		ListIterator<Object> li1 = al.listIterator();
		while(li1.hasNext())
			System.out.println(li1.next()); 
		System.out.println();

	} 

}

/**
 * 
 */
package fr.adaming.reflexivite;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author INTI-0332
 *
 */
public class TestReflexivite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub

		Class<String> c = String.class;
		Class<? extends String> c2 = new String().getClass();
		System.out.println("String.class : "+c);
		System.out.println("new String().getClass() : "+c2);
		//La fameuse méthode finale dont je vous parlais dans le chapitre sur l'héritage
		//Cette méthode vient de la classe Object 

		//RFRF : connaitre la superclasse.
		System.out.println("La superclasse de la classe " + String.class.getName() + " est : " + String.class.getSuperclass());
		System.out.println("La superclasse de la classe " + Object.class.getName() + " est : " + Object.class.getSuperclass());

		//RFRF : Liste des interfaces d'une classe
		System.out.println("------------------Liste des interfaces------------");
		//On récupère un objet Class

		//Class<? extends String> c3 = new String().getClass();
		Class<? extends String> c3 = String.class; //Les deux façons sont équivalentes.

		//La méthode getInterfaces retourne un tableau de Class
		Class<?>[] faces = c3.getInterfaces();

		//Pour voir le nombre d'interfaces
		System.out.println(c3+" a " + faces.length + " interfaces implémentées :");
		//On parcourt le tableau d'interfaces
		for(int i = 0; i < faces.length; i++)
			System.out.println("\t"+faces[i]);

//		for(Class c : faces)
//		System.out.println(c);	//RFRF : TODO c duplicate var ? pourquoi ?

		//RFRF : methodes d'une classe.
		System.out.println("------------------Liste des methodes------------");
		Method[] m = c3.getMethods();

		System.out.println("Il y a " + m.length + " méthodes dans cette classe");
		//On parcourt le tableau de méthodes
		for(int i = 0; i < m.length; i++)
			System.out.println(m[i]); 

		//RFRF : champs
		System.out.println("------------------Liste des champs	------------");
		Field[] m2 = c3.getDeclaredFields();
		System.out.println("Il y  a " + m2.length + " champs dans cette classe");
		//On parcourt le tableau de méthodes
		for(int i = 0; i < m2.length; i++)
			System.out.println(m2[i].getName());


		//RFRF : on peut afficher les constructeurs de la classe.
		System.out.println("------------------Liste des constructeurs	------------");
		Constructor<?>[] construc = c3.getConstructors();
		System.out.println("Il y a " + construc.length + " constructeurs dans cette classe");
		//On parcourt le tableau des constructeurs
		for(int i = 0; i < construc.length; i++){
			System.out.println(construc[i].getName());
			Class<?>[] param = construc[i].getParameterTypes();
			for(int j = 0; j < param.length; j++)
				System.out.println(param[j]);
			System.out.println("-----------------------------\n");  } 


	}

}

/**
 * 
 */
package fr.adaming.reflexivite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author INTI-0332
 *
 */
public class Paire {

	//
	private String valeur1, valeur2;

	//RFRF : Constructeurs
	public Paire(){
		this.valeur1 = null;
		this.valeur2 = null;
		System.out.println("Instanciation !");
	}

	public Paire(String val1, String val2){
		this.valeur1 = val1;
		this.valeur2 = val2;
		System.out.println("Instanciation avec des param�tres !");
	} 


	public String toString(){ 
		return  "Je suis un objet qui a pour valeur : " + this.valeur1 +  " - " + this.valeur2;
	} 

	public String getValeur1() { 
		return valeur1;
	} 

	public void setValeur1(String valeur1) { 
		this.valeur1 = valeur1;
	} 

	public String getValeur2() {  
		return valeur2; 
	} 

	public void setValeur2(String valeur2) {  
		this.valeur2 = valeur2; 
	} 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		String nom = Paire.class.getName();
		try {
			//On cr�e un objet Class
			Class<?> cl = Class.forName(nom);
			//Nouvelle instance de la classe Paire 
			Object o = cl.newInstance();

			//On cr�e les param�tres du constructeur 
			Class<?>[] types = new Class[]{String.class, String.class};
			//On r�cup�re le constructeur avec les deux param�tres 
			Constructor<?> ct = cl.getConstructor(types);

			//On instancie l'objet avec le constructeur surcharg� !
			Object o2 = ct.newInstance((Object[])new String[]{"valeur 1 ", "valeur 2"} );	
			//RFRF : rajout cast (Object[]) pour emp�cher le warning.
			
			 //On va chercher la m�thode toString, elle n'a aucun param�tre
			Method m = cl.getMethod("toString",(Class<?>[]) null);
			
			//La m�thode invoke ex�cute la m�thode sur l'objet pass� en param�tre
			//Pas de param�tre, donc null en deuxi�me param�tre de la m�thode invoke !
			System.out.println("----------------------------------------");
			System.out.println("M�thode " + m.getName() + " sur o2: " +m.invoke((Object)o2, (Object[]) null));
			System.out.println("M�thode " + m.getName() + " sur o: " +m.invoke((Object)o, (Object[]) null)); 

		} catch (SecurityException e) { 
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { 
			e.printStackTrace(); 
		} catch (InstantiationException e) { 
			e.printStackTrace(); 
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace(); 
		} catch (InvocationTargetException e) { 
			e.printStackTrace(); 
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}


}

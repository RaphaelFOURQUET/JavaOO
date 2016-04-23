/**
 * 
 */
package fr.adaming.javaoo;

/**
 * @author INTI-0332
 *
 */
@SuppressWarnings("serial")
public class NombreHabitantsException extends Exception {
	
	public NombreHabitantsException() {
		erreurMessage();	
	}
	
	public NombreHabitantsException(int nb) {
		erreurMessage();
		System.out.println("\t => "+nb);
	}
	
	private void erreurMessage() {
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
	}

}

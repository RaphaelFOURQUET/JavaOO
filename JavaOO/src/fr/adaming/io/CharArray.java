/**
 * 
 */
package fr.adaming.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @author INTI-0332
 *
 */
public class CharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		CharArrayWriter caw = new CharArrayWriter();
		CharArrayReader car;
		
		try {
			caw.write("Coucou les Z�ros");
			//Appel � la m�thode toString de notre objet de mani�re tacite
			System.out.println(caw);
			//caw.close() n'a aucun effet sur le flux
			//Seul caw.reset() peut tout effacer
			caw.close();
			
			//On passe un tableau de caract�res � l'objet qui va lire le tampon
			car = new CharArrayReader(caw.toCharArray());
			int i;
			
			//On remet tous les caract�res lus dans un String
			String str = "";
			while(( i = car.read()) != -1)
				str += (char) i;
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();  
		}
	}

}

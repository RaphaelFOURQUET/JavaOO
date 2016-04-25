/**
 * 
 */
package fr.adaming.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author INTI-0332
 *
 */
public class StringWR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		StringWriter sw = new StringWriter();
		StringReader sr;

		try {
			sw.write("Coucou les Z�ros");
			//Appel � la m�thode toString de notre objet de mani�re tacite
			System.out.println(sw);
			//sw.close() n'a aucun effet sur le flux
			//Seul sw.reset() peut tout effacer
			sw.close();
			
			//On passe un tableau de caract�res � l'objet qui va lire le tampon
			sr = new StringReader(sw.toString());
			int i ;
			
			//On remet tous les caract�res lus dans un String
			String str = "";
			while(( i = sr.read()) != -1)
				str += (char) i;
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}

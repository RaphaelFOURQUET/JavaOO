/**
 * 
 */
package fr.adaming.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author INTI-0332
 *
 */
public class FileRW {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		File file = new File("IO/testFileWriter.txt");
		FileWriter fw;
		FileReader fr;
		
		try {
			//Cr�ation de l'objet
			fw = new FileWriter(file);
			String str = "Bonjour � tous, amis Z�ros !\n";
			str += "\tComment allez-vous ? \n";
			//On �crit la cha�ne
			fw.write(str);
			//On ferme le flux
			fw.close();
			
			//Cr�ation de l'objet de lecture
			fr = new FileReader(file);
			str = "";      int i = 0;
			//Lecture des donn�es
			while((i = fr.read()) != -1)
				str += (char)i;
			
			//Affichage
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}

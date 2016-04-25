/**
 * 
 */
package fr.adaming.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author INTI-0332
 *
 */
public class TryWithRessource {
	
	private static int TAILLE_BUFFER = 8;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("IO/testtwr.txt");	//RFRF : attention à la déclaration p180
				FileOutputStream fos = new FileOutputStream("IO/testtwr2.txt")) {
			byte[] buf = new byte[TAILLE_BUFFER];
			
			@SuppressWarnings("unused")
			int n = 0;
			while((n = fis.read(buf)) >= 0){
				fos.write(buf);
				for(byte bit : buf)
					System.out.print("\t" + bit + "(" + (char)bit + ")");
				System.out.println("");
			}
			
			System.out.println("Copie terminée !");
			
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}

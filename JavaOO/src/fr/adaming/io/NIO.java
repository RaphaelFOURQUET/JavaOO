/**
 * 
 */
package fr.adaming.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author INTI-0332
 *
 */
public class NIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		FileInputStream fis = null;
		BufferedInputStream bis = null ;
		FileChannel fc = null;
		
		try {
			//Cr�ation des objets
			fis = new FileInputStream(new File("IO/test.txt"));
			bis = new BufferedInputStream(fis);
			//D�marrage du chrono
			long time = System.currentTimeMillis();
			//Lecture
			while(bis.read() != -1);
			//Temps d'ex�cution
			System.out.println("Temps d'ex�cution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));
			
			//Cr�ation d'un nouveau flux de fichier
			fis = new FileInputStream(new File("IO/test.txt"));
			//On r�cup�re le canal
			fc = fis.getChannel();
			//On en d�duit la taille
			int size = (int)fc.size();
			//On cr�e un buffer correspondant � la taille du fichier
			ByteBuffer bBuff = ByteBuffer.allocate(size);
			
			//D�marrage du chrono
			time = System.currentTimeMillis();
			//D�marrage de la lecture
			fc.read(bBuff);
			//On pr�pare � la lecture avec l'appel � flip
			bBuff.flip();
			//Affichage du temps d'ex�cution
			System.out.println("Temps d'ex�cution avec un nouveau buffer : " + (System.currentTimeMillis() - time));
			
			//Puisque nous avons utilis� un buffer de byte afin de r�cup�rer les donn�es
			//Nous pouvons utiliser un tableau de byte
			//La m�thode array retourne un tableau de byte
			@SuppressWarnings("unused")
			byte[] tabByte = bBuff.array();
			
			//RFRF : fermeture, selon les cas ici ou dans un autre bloc try/catch.
			if(fc != null)fc.close();
			if(bis != null)bis.close();
			if(fis != null)fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {	//RFRF : probleme de try catch ? mieux dans le try ???
//			if(fc != null) fc.close();
//			if(bis != null) bis.close();
//			if(fis != null) fis.close();
			
		}
		
//		System.out.println("Test !");

	}

}

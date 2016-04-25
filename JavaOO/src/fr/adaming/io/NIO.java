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
			//Création des objets
			fis = new FileInputStream(new File("IO/test.txt"));
			bis = new BufferedInputStream(fis);
			//Démarrage du chrono
			long time = System.currentTimeMillis();
			//Lecture
			while(bis.read() != -1);
			//Temps d'exécution
			System.out.println("Temps d'exécution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));
			
			//Création d'un nouveau flux de fichier
			fis = new FileInputStream(new File("IO/test.txt"));
			//On récupère le canal
			fc = fis.getChannel();
			//On en déduit la taille
			int size = (int)fc.size();
			//On crée un buffer correspondant à la taille du fichier
			ByteBuffer bBuff = ByteBuffer.allocate(size);
			
			//Démarrage du chrono
			time = System.currentTimeMillis();
			//Démarrage de la lecture
			fc.read(bBuff);
			//On prépare à la lecture avec l'appel à flip
			bBuff.flip();
			//Affichage du temps d'exécution
			System.out.println("Temps d'exécution avec un nouveau buffer : " + (System.currentTimeMillis() - time));
			
			//Puisque nous avons utilisé un buffer de byte afin de récupérer les données
			//Nous pouvons utiliser un tableau de byte
			//La méthode array retourne un tableau de byte
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

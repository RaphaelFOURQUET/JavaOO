/**
 * 
 */
package fr.adaming.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author INTI-0332
 *
 */
public class NIO2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		Path path = Paths.get("IO/testnio2.txt");
		System.out.println("Chemin absolu du fichier : " + path.toAbsolutePath());
		System.out.println("Est-ce qu'il existe ? " + Files.exists(path));
		System.out.println("Nom du fichier : " + path.getFileName());
		System.out.println("Est-ce un répertoire ? " + Files.isDirectory(path));

		//On récupère maintenant la liste des répertoires dans une collection typée
		//Via l'objet FileSystem qui représente le système de fichier de l'OS hébergeant la JVM
		Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

		//Maintenant, il ne nous reste plus qu'à parcourir
		for(Path chemin : roots) {
			System.out.println("\n"+chemin);

			//Pour lister un répertoire, il faut utiliser l'objet DirectoryStream
			//L'objet Files permet de créer ce type d'objet afin de pouvoir l'utiliser
			try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin)) {
//			try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin,"*.txt")){	//RFRF : pour ne garder que les .txt
				int i = 0;
				for(Path nom : listing) {
					System.out.print("\t\t" + ((Files.isDirectory(nom)) ? nom+"/" : nom));
					i++;
					if(i%4 == 0) System.out.println("");
				}
			} catch (IOException e) {
				System.out.println("IOException detectee !");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Une erreur non prévue !");
			}


		}

		Path source = Paths.get("IO/testnio2.txt");
		Path cible = Paths.get("IO/testnio2w.txt");
		try {  
			Files.copy(source, cible, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}


		System.out.println("Fin du programme !");

	}

}

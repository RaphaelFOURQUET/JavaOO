/**
 * 
 */
package fr.adaming.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author INTI-0332
 *
 */
@SuppressWarnings("unused")
public class NIO2Flux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		Path source = Paths.get("IO/test.txt");

		//Ouverture en lecture :
		try ( InputStream input = Files.newInputStream(source) ) {
			//insert code here.
		} catch(Exception e) {
			e.printStackTrace();
		}

		//Ouverture en écriture :
		try ( OutputStream output = Files.newOutputStream(source) )  {
			//insert code here.
		} catch(Exception e) {
			e.printStackTrace();
		}

		//Ouverture d'un Reader en lecture :
		try ( BufferedReader reader = Files.newBufferedReader(source, StandardCharsets.UTF_8) )  {
			//insert code here.
		} catch(Exception e) {
			e.printStackTrace();
		}

		//Ouverture d'un Writer en écriture :
		try ( BufferedWriter writer = Files.newBufferedWriter(source, StandardCharsets.UTF_8) )  {
			//insert code here.
		} catch(Exception e) {
			e.printStackTrace();
		}

		//RFRF : TODO à tester !
//		// Création d'un système de fichiers en fonction d'un fichier ZIP
//		try (FileSystem zipFS = FileSystems.newFileSystem(Paths.get("IO/monFichier.zip"), null)) {
//			//Suppression d'un fichier à l'intérieur du ZIP :
//			Files.deleteIfExists( zipFS.getPath("IO/testzip.txt") );
//
//			//Création d'un fichier à l'intérieur du ZIP :
//			Path path = zipFS.getPath("IO/nouveau.txt");
//			String message = "Hello World !!!";
//			Files.write(path, message.getBytes());
//
//			//Parcours des éléments à l'intérieur du ZIP :
//			try (DirectoryStream<Path> stream = Files.newDirectoryStream(zipFS.getPath("/"))) {
//				for (Path entry : stream) {
//					System.out.println(entry);
//				}
//			}
//			
//			//Copie d'un fichier du disque vers l'archive ZIP :
//			Files.copy(Paths.get("IO/fichierSurDisque.txt"), zipFS.getPath("IO/fichierDansZIP.txt"));
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
	}



}


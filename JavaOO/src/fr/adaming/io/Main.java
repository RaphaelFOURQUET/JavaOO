/**
 * 
 */
package fr.adaming.io;

//Package � importer afin d'utiliser l'objet File
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author INTI-0332
 *
 */
public class Main {

	private static int TAILLE_BUFFER = 8;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub

		//Cr�ation de l'objet File
		File f = new File("IO/testio.txt");	//RFRF : Dans un repertoire IO : le / est transform� en \ seul, \\ marche aussi
		System.out.println(f);
		System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		System.out.println("Nom du fichier : " + f.getName()); 
		System.out.println("Est-ce qu'il existe ? " + boolToFr(f.exists()));
		System.out.println("Est-ce un r�pertoire ? " + boolToFr(f.isDirectory()));
		System.out.println("Est-ce un fichier ? " + boolToFr(f.isFile()));
		System.out.println("Affichage des lecteurs � la racine du PC : ");

		for(File file : File.listRoots()) {
			System.out.println(file.getAbsolutePath()); 
			try {
				int i = 1;   
				//On parcourt la liste des fichiers et r�pertoires 
				for(File nom : file.listFiles()) {
					//S'il s'agit d'un dossier, on ajoute un "/" 
					System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName())); 
					if((i%4) == 0) {	//RFRF : 4 affichages par ligne.
						System.out.print("\n");
					}   
					i++;
				}
				System.out.println("\n"); 
			} catch (NullPointerException e) {
				//L'instruction peut g�n�rer une NullPointerException s'il n'y a pas de sous-fichier !
				//System.out.println("NullPointerException !");
			}  
		}

		//RFRF : FileInputStream et FileOutputStream
		// Nous d�clarons nos objets en dehors du bloc try/catch
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {         
			// On instancie nos objets :
			// fis va lire le fichier
			// fos va �crire dans le nouveau !
			fis = new FileInputStream(new File("IO/testio.txt"));
			fos = new FileOutputStream(new File("IO/testio2.txt"));

			// On cr�e un tableau de byte pour indiquer le nombre de bytes lus � chaque tour de boucle
			byte[] buf = new byte[TAILLE_BUFFER];

			// On cr�e une variable de type int pour y affecter le r�sultat de la lecture
			// Vaut -1 quand c'est fini
			int n = 0;

			// Tant que l'affectation dans la variable est possible, on boucle
			// Lorsque la lecture du fichier est termin�e l'affectation n'est plus possible !
			// On sort donc de la boucle
			while ((n = fis.read(buf)) >= 0) {
				//System.out.println("n : "+n);
				// On �crit dans notre deuxi�me fichier avec l'objet ad�quat
				//fos.write(buf);
				fos.write(buf, 0, n);	//RFRF : ecrire seulement n char, plus propre.
				// On affiche ce qu'a lu notre boucle au format byte et au format char
				for (byte bit : buf) {	//RFRF : pas super propre si on ecrit seulement n elements car differe de l ecriture reelle.
					//System.out.print("\t" + bit + "(" + (char) bit + ")");
					//RFRF : Modif affichage \n \r
					System.out.print("\t" + bit + "(");
					if(((char)bit) == '\n')
						System.out.print("\\n)");
					else if (((char)bit) == '\r')
						System.out.print("\\r)");
					else System.out.print((char) bit + ")");
					System.out.println(""); 
				}
				//Nous r�initialisons le buffer � vide au cas o� les derniers byte lus ne soient pas un multiple de TAILLE_BUFFER
				//Ceci permet d'avoir un buffer vierge � chaque lecture et ne pas avoir de doublon en fin de fichier
				buf = new byte[TAILLE_BUFFER];	//RFRF : inutile si modif write pour n elements.
			}
			System.out.println("Copie termin�e !");
		} catch (FileNotFoundException e) {// Cette exception est lev�e si l'objet FileInputStream ne trouve aucun fichier
			e.printStackTrace();
		} catch (IOException e) {         // Celle-ci se produit lors d'une erreur d'�criture ou de lecture
			e.printStackTrace();
		} finally {        
			// On ferme nos flux de donn�es dans un bloc finally pour s'assurer que ces instructions seront ex�cut�es
			// dans tous les cas m�me si une exception est lev�e !
			try {            
				if (fis != null) 
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public static String boolToFr(boolean b) {
		if(b) return "Oui";
		return "Non";
	}
}
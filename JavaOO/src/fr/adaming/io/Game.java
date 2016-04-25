/**
 * 
 */
package fr.adaming.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;	//RFRF : new
import java.io.ObjectOutputStream;	//RFRF : new

//Package à importer 
import java.io.Serializable;	//RFRF : new

//RFRF : ObjectInputStream et ObjectOutputStream + Serializable.


/**
 * @author INTI-0332
 *
 */
@SuppressWarnings("serial")
public class Game implements Serializable {
	private String nom, style;
	private double prix;
//	private Notice notice;	//Ne compile plus car notice non serializable : le noter Serializable ou utiliser transient
	private transient Notice notice;	//transient indique au compilateur que notice ne doit pas être sérialisé, est-ce une solution viable ?

	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice();
	}

	public String toString() {
		return "Nom du jeu : " + this.nom + "\n Style de jeu : " + this.style + "\n Prix du jeu : " + this.prix + "\n";
	}
	
	public Notice getNotice() {
		return this.notice;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game g;
		//Nous déclarons nos objets en dehors du bloc try/catch
		ObjectInputStream ois;
		ObjectOutputStream oos;
		try {      
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("IO/game.txt"))));

			//Nous allons écrire chaque objet Game dans le fichier
			Game g0 = new Game("Assassin Creed", "Aventure", 45.69);
			oos.writeObject(g0);
			oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
			oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
			
			//RFRF : Test affichage notice
			System.out.println("Premier jeu :\n"+g0+" "+g0.getNotice());	//RFRF : Bien affiché.
			
			//Ne pas oublier de fermer le flux !
			oos.close();
			
			//On récupère maintenant les données !
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("IO/game.txt"))));
			try {
				System.out.println("Affichage des jeux :");
				System.out.println("*************************\n");
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println((Game)ois.readObject());
				g = (Game) ois.readObject();
				System.out.println(g);
				System.out.println("Notice : "+g.getNotice());	//RFRF : retourne null si transient.
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}

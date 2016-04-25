/**
 * 
 */
package fr.adaming.genericite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author INTI-0332
 *
 */
public class Garage {

	List<Voiture> list = new ArrayList<Voiture>();

	public void add(List<? extends Voiture> listVoiture){
		for(Voiture v : listVoiture) 
			list.add(v); 
		System.out.println("Contenu de notre garage :"); 
		for(Voiture v : list)  
			System.out.println(v.toString()); 
	} 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		 List<Voiture> listVoiture = new ArrayList<Voiture>();
		 listVoiture.add(new Voiture());
		 List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		 listVoitureSP.add(new VoitureSansPermis());
		 Garage garage = new Garage();
		 garage.add(listVoiture);
		 System.out.println("--------------------------");
		 garage.add(listVoitureSP);

	}

}

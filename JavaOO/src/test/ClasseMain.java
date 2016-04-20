/**
 * 
 */
package test;

//author : Raphael date : 20/04/2016
/**
 * @author INTI-0332
 *
 */
public class ClasseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Auto-generated method stub
		Ville ville = new Ville();
		Ville ville1 = new Ville("Villespy","France",258);
		
		/*System.out.println(ville.nomVille);
		System.out.println(ville1.nomVille);
		
		ville.nomVille = "FakeNameTown";	
		System.out.println(ville.nomVille);*/
		//RFRF : creation d'Accesseurs.
		
		System.out.println("ville.getNomVille() : "+ville.getNomVille());
		System.out.println("ville.getMaire() : "+ville.getMaire());
		
		System.out.println("ville1.getNomVille() : "+ville1.getNomVille());
		
		ville.setNomVille("FakeNameTown");
		System.out.println("ville.getNomVille() : "+ville.getNomVille());
		
		System.out.println("Test Village !");
		Village village = new Village();
		System.out.println("village.getNomVille() : "+village.getNomVille());
		
		Ville v2 = new Ville("Toulouse","France",1251561,54654,"Dupont","Toulousains");
		System.out.println(v2);
		
		System.out.println(v2.comparer(ville1));
		System.out.println(v2.comparer(v2));

	}

}

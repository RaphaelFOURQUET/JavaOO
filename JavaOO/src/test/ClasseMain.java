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
		
		System.out.println("Nombre de villes : "+Ville.nbreVilles);
		System.out.println("Nombre de villes bis : "+Ville.getNbreVillesBis());
		
		Village village1 = new Village();
		village1.setSuperficie(1.0);
		System.out.println(village1);
		
		System.out.println("Nombre de villes : "+Ville.nbreVilles);
		System.out.println("Nombre de villes bis : "+Ville.getNbreVillesBis());
		
		Capitale c = new Capitale();
		System.out.println(c);
		
		System.out.println("Nombre de villes : "+Ville.nbreVilles);
		System.out.println("Nombre de villes bis : "+Ville.getNbreVillesBis());
		
		Capitale c1 = new Capitale("Londres");
		System.out.println(c1);
		
		System.out.println("Nombre de villes : "+Ville.nbreVilles);
		System.out.println("Nombre de villes bis : "+Ville.getNbreVillesBis());
		
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
		
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "Paris", "paris", "PARIS"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		
		//Les trois premiers éléments du tableau seront des villes, et le reste, des capitales
		for(int i = 0; i < 6; i++) {
			if (i <3) {
				tableau[i] = new Ville(tab[i], "France", tab2[i]);
			} else {
				tableau[i] = new Capitale(tab[i], "France", tab2[i], "la tour Eiffel");
			}
		}
		
		//Il ne nous reste plus qu'à décrire tout notre tableau ! 
		for(Ville v : tableau) {
			System.out.println(v+"\n");	//RFRF : polymorphisme : le langage appelle toString() de Ville ou Capitale seul.
		}
		
		//Il ne nous reste plus qu'à décrire tout notre tableau !	RFRF : C'est la même chose dans ce cas.
		for(Object obj : tableau) {
			System.out.println(obj+"\n");
		}
		
		System.out.println(c1.equals(c1));
		System.out.println(ville.equals(v2));
		
		Double d = Double.NaN;
		System.out.println("Test NaN : "+d);
		
		//RFRF : + voir classe Objects (avec un s!) de java.util.Objects p93 pour des simplifications d'ecriture sur equals hashcode.

	}

}

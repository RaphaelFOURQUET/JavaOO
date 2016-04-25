package fr.adaming.genericite;

/**
 * 
 * @author INTI-0332
 *
 * @param <T> parametre generique.
 */
public class Solo<T> {

	//Variable d'instance  
	private T valeur;          
	
	//Constructeur sans parametre 
	public Solo() {    
		this.valeur = null;  
	}  
	
	//Constructeur avec param�tre inconnu pour l'instant  
	public Solo(T valeur) {    
		this.valeur = valeur;  
	}          
	
	//D�finit la valeur avec le param�tre  
	public void setValeur(T valeur) {    
		this.valeur = valeur;  
	}          
	
	//Retourne la valeur d�j� � cast�e � par la signature de la m�thode !  
	public T getValeur() {    
		return this.valeur;  
	}       
	
	
	public static void main(String[] args) {
		//Auto-generated method stub
		
		//RFRF : Il faut utiliser les classes de type primitifs (avec Maj), appel�es aussi classes wrapper.
		 Solo<Integer> val = new Solo<Integer>(12);  
		 int nbre = val.getValeur(); 
		 System.out.println("nbre : "+nbre);
		 
		 Solo<Double> d = new Solo<Double>(5.2);
		 double nb = d.getValeur();
		 System.out.println("nb : "+nb);
		 
		 Solo<Integer> valI = new Solo<Integer>();
		 Solo<String> valS = new Solo<String>("TOTO");
		 Solo<Float> valF = new Solo<Float>(12.2f);
		 Solo<Double> valD = new Solo<Double>(12.202568);
		 System.out.println("\t getValeur()\nvalI : "+valI.getValeur()+"\nvalS : "+valS.getValeur()+"\nvalF : "+valF.getValeur()+"\nvalD : "+valD.getValeur());
		 
//		 Solo<Integer> v2 = new Solo<Integer>("toto");
//		 //Ici, on essaie de mettre une cha�ne de caract�res � la place d'un entier
//		 int nb2 = v2.getValeur();
		 
//		 Solo<Integer> v3 = new Solo<Integer>(12);
//		 v3.setValeur(12.2f);
//		 //Ici, on essaie de mettre un nombre � virgule flottante � la place d'un entier
		 
	}

}

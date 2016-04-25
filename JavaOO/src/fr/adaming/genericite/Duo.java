/**
 * 
 */
package fr.adaming.genericite;

/**
 * @author INTI-0332
 *
 */
public class Duo<T, S> {

	//Variable d'instance de type T
	private T valeur1;	
	//Variable d'instance de type S
	private S valeur2;

	//Constructeur sans parametre
	public Duo(){
		this.valeur1 = null;
		this.valeur2 = null;
	}

	//Constructeur avec param�tres
	public Duo(T val1, S val2){
		this.valeur1 = val1;
		this.valeur2 = val2;
	}

	//M�thodes d'initialisation des deux valeurs
	public void setValeur(T val1, S val2){
		this.valeur1 = val1;
		this.valeur2 = val2;
	}

	//Retourne la valeur T
	public T getValeur1() {
		return valeur1;
	} 

	//D�finit la valeur T
	public void setValeur1(T valeur1) {
		this.valeur1 = valeur1;
	}

	//Retourne la valeur S
	public S getValeur2() {
		return valeur2;
	} 

	//D�finit la valeur S
	public void setValeur2(S valeur2) {
		this.valeur2 = valeur2;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Auto-generated method stub
		 Duo<String, Boolean> dual = new Duo<String, Boolean>("toto", true);
		 System.out.println("Valeur de l'objet dual : val1 = " + dual.getValeur1() + ", val2 = " + dual.getValeur2());
		 
		 Duo<Double, Character> dual2 = new Duo<Double, Character>(12.2585, 'C');
		 System.out.println("Valeur de l'objet dual2 : val1 = " + dual2.getValeur1() + ", val2 = " + dual2.getValeur2());
		 
//		 Duo<String, Boolean> dual3 = new Duo<String, Boolean>("toto", true);
//		 System.out.println("Valeur de l'objet dual: val1 = " + dual.getValeur1() + ", val2 = " + dual.getValeur2());
//		 dual3 = new Duo<Double, Character>();	//Cannot convert from Duo<Double, Character> to Duo<String, Boolean>
	}

}

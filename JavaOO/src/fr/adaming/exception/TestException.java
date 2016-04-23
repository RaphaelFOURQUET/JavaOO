/**
 * 
 */
package fr.adaming.exception;

/**
 * @author INTI-0332
 *
 */
public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Auto-generated method stub

		int j = 20, i = 0;

		//RFRF : Try catch simple
		System.out.println("Try catch simple");
		try {
			System.out.println(j/i);
		} catch (ArithmeticException e) {
			//Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error : "+e.getMessage());	// / by zero
			//System.out.println("Error : "+e.getLocalizedMessage());	// idem : / by zero
		}
		//System.out.println("Hello World !");

		//try multi catch
		System.out.println("Try multi catch");
		try {
			System.out.println(j/i);
		} catch (ArithmeticException |NullPointerException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}


		//finally
		System.out.println("try catch finally");
		try {
			System.out.println(" =>" + (1/0));
		}
		catch (ClassCastException e) {	//RFRF : mauvais catch donc pas affiche
			System.out.println("ClassCastException"); 
		}
		catch (ArithmeticException e) {	//RFRF : bonne exception
			System.out.println("ArithmeticException");
		}
		finally{  
			System.out.println("action faite systématiquement !"); //tjrs affiche
		}

		System.out.println("Fin !");


		//RFRF : Suite des tests exception dans exemple Ville fr.adaming.javaoo.Ville
	}

}

/**
 * 
 */
package fr.adaming.dp.decorator;

/**
 * @author INTI-0332
 *
 */
public class MainDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		Patisserie pat = new CoucheChocolat(
				new CoucheCaramel(
						new CoucheBiscuit(
								new Gateau())));

		System.out.println(pat.preparer()); 

	}

}

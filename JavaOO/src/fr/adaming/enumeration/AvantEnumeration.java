/**
 * 
 */
package fr.adaming.enumeration;

/**
 * @author INTI-0332
 *
 */
public class AvantEnumeration {

	public static final int PARAM1 = 1;
	public static final int PARAM2 = 2;

	public void faire(int param){
		if(param == PARAM1)
			System.out.println("Fait à la façon N°1");
		if(param == PARAM2)
			System.out.println("Fait à la façon N°2");
	}

	public void fait(Langage param){
		if(param.equals(Langage.JAVA))
			System.out.println("Fait à la façon N°1");
		if(param.equals(Langage.PHP))
			System.out.println("Fait à la façon N°2");
	} 

	public static void main(String args[]){
		AvantEnumeration ae = new AvantEnumeration();
		ae.faire(AvantEnumeration.PARAM1);
		ae.faire(AvantEnumeration.PARAM2);
		ae.faire(1);	//Fait à la façon N°1
		ae.faire(4);
		
		ae.fait(Langage.JAVA);
		//ae.fait(1);//Impossible d utiliser un int.
	} 

}

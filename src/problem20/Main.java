package problem20;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		BigInteger factorielle = new BigInteger("1");
		
		for (int i = 100; i > 0; i--) {
			//System.out.println(factorielle);
			factorielle = factorielle.multiply(new BigInteger(Integer.toString(i)));
		}
		
		System.out.println(factorielle);
	
		long somme = 0;
		for(int i = 0; i < factorielle.toString().length(); i++) {
			System.out.println("  " + somme);
			System.out.println("+ " + factorielle.toString().charAt(i));
			System.out.println("---------------------");
			
			somme += Integer.parseInt(factorielle.toString().substring(i, i+1));
			
			System.out.println("  " + somme);
			System.out.println();
		}
		
		System.out.println("Somme : " + somme);
	}
}

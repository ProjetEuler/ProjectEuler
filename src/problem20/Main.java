package problem20;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		BigInteger factorielle = new BigInteger("1");
		
		for (int i = 100; i > 0; i--) {
			factorielle = factorielle.multiply(new BigInteger(Integer.toString(i)));
		}
	
		long somme = 0;
		for(int i = 0; i < factorielle.toString().length(); i++) {
			somme += Integer.parseInt(factorielle.toString().substring(i, i+1));
		}
		
		System.out.println("Somme : " + somme);

		EulerUtils.getExecutionTime(start);
	}
}

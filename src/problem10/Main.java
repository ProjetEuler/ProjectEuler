package problem10;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		long somme = 0;
		for(int nombre = 2; nombre < 2000000; nombre++) {
			if(EulerUtils.isPrime(nombre)) {
				somme += nombre;
			}
		}
		
		System.out.println("Somme : " + somme);
		
		EulerUtils.getExecutionTime(start);
	}
}

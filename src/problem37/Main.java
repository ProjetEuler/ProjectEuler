package problem37;

import java.util.Arrays;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {

		int counter = 0;
		int somme = 0;
		int escapeNumber[] = {2, 3, 5, 7};
		int i = 2;

		while(counter != 11) {
			if (EulerUtils.isPrime(i) && Arrays.binarySearch(escapeNumber, i) < 0) {
				if(checkByRight(i) && checkByLeft(i)) {
					counter++;
					somme += i;
				}
			}
			
			i++;
		}
		
		System.out.println("Somme : " + somme);
	}

	public static boolean checkByLeft(int nb) {

		String str = String.valueOf(nb);
		for (int i = 0; i < str.length(); i++) {
			if(!EulerUtils.isPrime(Integer.parseInt(str.substring(i, str.length())))) {
				return false;
			}
		}

		return true;
	}
	public static boolean checkByRight(int nb) {

		String str = String.valueOf(nb);
		for (int i = 0; i < str.length(); i++) {
			if(!EulerUtils.isPrime(Integer.parseInt(str.substring(0, str.length()-i)))) {
				return false;
			}
		}

		return true;
	}
}

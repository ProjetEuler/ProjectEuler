package problem37;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int counter = 0;
		int somme = 0;
		int escapeNumber[] = {2, 3, 5, 7};
		int i = 2;

		while(counter != 11) {
			if (isPremier(i) && Arrays.binarySearch(escapeNumber, i) < 0) {
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
			if(!isPremier(Integer.parseInt(str.substring(i, str.length())))) {
				return false;
			}
		}

		return true;
	}
	public static boolean checkByRight(int nb) {

		String str = String.valueOf(nb);
		for (int i = 0; i < str.length(); i++) {
			if(!isPremier(Integer.parseInt(str.substring(0, str.length()-i)))) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPremier(int nombre) {
		if(nombre == 1) {
			return false;
		} else if(nombre == 2) {
			return true;
		} else {
			boolean isPremier = true;

			for(int i=2; i<= Math.ceil(Math.sqrt(nombre)); i++) {
				if((nombre % i) == 0) {
					isPremier = false;
				}
			}

			if(isPremier) {
				return true;
			} else {
				return false;
			}
		}
	}
}

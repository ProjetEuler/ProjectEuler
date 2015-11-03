package problem36;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		int somme = 0;
		
		for (int i = 0; i < 1000000; i++) {
			if(EulerUtils.isPalindrome(String.valueOf(i)) && EulerUtils.isPalindrome(EulerUtils.convertToBin(i))) {
				System.out.println("i : " + i + " /// Bin : " + EulerUtils.convertToBin(i));
				somme += i;
			}
		}
		
		System.out.println("\nSomme : " + somme);
	}
}

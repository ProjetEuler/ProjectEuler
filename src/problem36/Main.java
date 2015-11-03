package problem36;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		int somme = 0;
		
		for (int i = 0; i < 1000000; i++) {
			if(EulerUtils.isPalindrome(String.valueOf(i)) && EulerUtils.isPalindrome(EulerUtils.convertToBin(i))) {
				somme += i;
			}
		}
		
		System.out.println("Somme : " + somme);
		
		EulerUtils.getExecutionTime(start);
	}
}

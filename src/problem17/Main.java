package problem17;

import utils.EulerUtils;

public class Main {

	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		long somme = 0;
		
		for (int i = 1; i <= 1000; i++) {
			somme += EulerUtils.escapeCharacter("\\s", EulerUtils.numberToWords(i)).length();
		}

		System.out.println("Somme : " + somme);
		
		EulerUtils.getExecutionTime(start);
	}
}

package problem48;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {
	public static void main(String args[]) {
		long start = EulerUtils.getTime();
		
		BigInteger somme = new BigInteger("0");
		
		for (int i = 1; i <= 1000; i++) {
			somme = somme.add(EulerUtils.pow(new BigInteger(String.valueOf(i)), i));
		}
		
		String str_somme = somme.toString();
		System.out.println("10 derniers chiffres de la somme : " + str_somme.substring(str_somme.length() - 10));

		EulerUtils.getExecutionTime(start);
	}
}

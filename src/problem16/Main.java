package problem16;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		BigInteger number = new BigInteger("1");
		
		for (int i = 0; i < 1000; i++) {
			number = number.multiply(new BigInteger("2"));
		}
		
		System.out.println(number);
		System.out.println(number.toString().length());
		
		long somme = 0;
		for(int i = 0; i < number.toString().length(); i++) {
			somme += Integer.parseInt(number.toString().substring(i, i+1));
		}
		
		System.out.println("Somme : " + somme);
		
		EulerUtils.getExecutionTime(start);
	}

}

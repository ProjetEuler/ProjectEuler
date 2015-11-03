package problem30;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {	
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		int pow = 5;
		BigInteger somme = new BigInteger("0");
		
		for(int i = 2; i < 10000000; i++) {
			BigInteger j = new BigInteger(String.valueOf(i));
			if(j.compareTo(EulerUtils.sumOfPowDigits(new BigInteger(String.valueOf(i)), pow)) == 0) {
				somme = somme.add(j);
			}
		}
		
		System.out.println("Somme : " + somme);
		
		EulerUtils.getExecutionTime(start);
	}

}

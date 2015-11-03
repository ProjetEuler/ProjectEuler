package problem56;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		BigInteger greatest = new BigInteger("0");
		
		for(int i = 1; i < 100; i++) {
			for(int j = 1; j < 100; j++) {
				
				int tmp = EulerUtils.addDigits(EulerUtils.pow(new BigInteger(String.valueOf(i)), j));
				if(greatest.compareTo(new BigInteger(String.valueOf(tmp))) == -1) {
					greatest = new BigInteger(String.valueOf(tmp));
				}
			}
		}
		
		System.out.println("Somme : " + greatest.toString());
		
		EulerUtils.getExecutionTime(start);
	}
}

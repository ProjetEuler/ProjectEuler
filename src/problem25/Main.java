package problem25;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		int counter = 2;
		
		do {
			sum = a.add(b);
			a = b;
			b = sum;
			
			counter++;
		}while(sum.toString().length() < 1000);
		
		System.out.println("Length : "+sum.toString().length());
		System.out.println("F"+counter+" : "+sum);
		
		EulerUtils.getExecutionTime(start);
	}
}

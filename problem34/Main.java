package problem34;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {

	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		BigInteger total_sum = new BigInteger("0");
		
		for(int i = 3; i < 100000; i++) {
			BigInteger factorial_digit_sum = new BigInteger("0");
			for (int digit : EulerUtils.decomposeByDigits(i)) {
				factorial_digit_sum = factorial_digit_sum.add(EulerUtils.factorial(new BigInteger(String.valueOf(digit))));
			}

			if(factorial_digit_sum.compareTo(new BigInteger(String.valueOf(i))) == 0) {
				total_sum = total_sum.add(new BigInteger(String.valueOf(i)));
			}
		}
		
		System.out.println("Somme : " + total_sum);
		EulerUtils.getExecutionTime(start);
	}
}

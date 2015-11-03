package problem25;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
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
	}
	
	public static BigInteger fibo(BigInteger n) {
		if(n.compareTo(new BigInteger("1")) == -1 || n.compareTo(new BigInteger("1")) == 0) {
			return n;
		} else {
			return fibo(n.subtract(new BigInteger("2"))).add(fibo(n.subtract(new BigInteger("1"))));
		}
	}
}

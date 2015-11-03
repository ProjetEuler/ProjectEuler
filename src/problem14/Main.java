package problem14;

import utils.EulerUtils;

public class Main {
	public static void main(String args[]) {
		long start = EulerUtils.getTime();
		
		long index = 0;
		long collatz_length = 0;
		
		for(long i = 0; i <= 1000000; i++) {
			int size = EulerUtils.getCollatz(i);
			if(size > collatz_length) {
				collatz_length = size;
				index = i;
			}
		}
		
		System.out.println("Value : " + index + " / Size : " + EulerUtils.getCollatz(index));

		EulerUtils.getExecutionTime(start);
	}
}

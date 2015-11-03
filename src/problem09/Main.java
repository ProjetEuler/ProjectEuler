package problem09;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		for(int a = 0; a<1000; a++) {
			for(int b = 0; b<1000; b++) {
				for(int c = 0; c<1000; c++) {
					if(EulerUtils.isPythagoreanTriplet(a, b, c) && isRightSum(a, b, c) && a < b && b < c) {
						System.out.println("A : " + a);
						System.out.println("B : " + b);
						System.out.println("C : " + c);
						System.out.println("Produit : " + (a*b*c));
					}
				}
			}
		}
		
		EulerUtils.getExecutionTime(start);
	}

	public static boolean isRightSum(int a, int b, int c) {
		if(a + b + c == 1000)
			return true;
		else
			return false;
	}
}

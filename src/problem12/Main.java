package problem12;

import utils.EulerUtils;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		
		while(EulerUtils.getdivisors(EulerUtils.getDecrementSum(i)).size() < 500) {
			i++;
			System.out.println("i : " + i + " -> " + EulerUtils.getdivisors(EulerUtils.getDecrementSum(i)).size());
		}

		System.out.println(EulerUtils.getDecrementSum(i));
	}

}

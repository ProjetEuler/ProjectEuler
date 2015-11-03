package problem24;

import java.util.Arrays;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int counter = 1;
		
		do {
			counter++;
		} while (EulerUtils.nextPermutation(array) && counter != 1000000);
		
		System.out.println(Arrays.toString(array).toString().replace(", ", ""));
		
		EulerUtils.getExecutionTime(start);
	}
}

package problem29;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		ArrayList<BigInteger> arr = new ArrayList<>();
		
		for(int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				arr.add(new BigInteger(String.valueOf(i)).pow(j));
			}
		}
		
		arr = new ArrayList<BigInteger>(new LinkedHashSet<BigInteger>(arr));
		
		System.out.println(arr.size());
		EulerUtils.getExecutionTime(start);
	}
}

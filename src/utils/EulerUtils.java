package utils;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;

public final class EulerUtils {
	private EulerUtils() { }

	public static void getExecutionTime(long start) {
		long end = System.nanoTime();

		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(5);

		System.out.println("Execution time : " +  df.format((end - start)/1000000000.0) + "s.");
	}

	public static long getTime() {
		return System.nanoTime();
	}

	public static int getDecrementSum(int nb) {
		int sum = 0;
		for (int i = nb; i > 0; i--) {
			sum += i;
		}

		return sum;
	}

	public static int addDigits(BigInteger nb) {
		char[] k = nb.toString().toCharArray();
		int sum = 0;
		for(int i = 0; i < k.length; i++){
			sum += Character.getNumericValue(k[i]);
		}
		return sum;
	}

	public static ArrayList<Integer> getdivisors(int nb) {
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = nb; i > 0; i--) {
			if(nb % i == 0) {
				arr.add(i);
			}
		}

		return arr;
	}

	public static int getCollatz(long nb) {
		int counter = 1;

		while(nb > 1) {
			counter++;
			if(nb % 2 == 0) {
				nb = nb / 2;
			} else {
				nb = (3 * nb) + 1;
			}
		}

		return counter;
	}

	public static BigInteger pow(BigInteger nb, int pow) {
		return nb.pow(pow);
	}

	public static String escapeCharacter(String pattern, String str) {
		return str.replaceAll(pattern, "");
	}

	public static String numberToWords(Integer i) {
		String[] units = {"Zero","One","Two","Three","Four",
				"Five","Six","Seven","Eight","Nine","Ten",
				"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
				"Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
				"Sixty","Seventy","Eighty","Ninety"};

		if( i < 20)  return units[i];
		if( i < 100) return tens[i/10] + ((i % 10 > 0)? " " + numberToWords(i % 10):"");
		if( i < 1000) return units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + numberToWords(i % 100):"");
		if( i < 1000000) return numberToWords(i / 1000) + " Thousand " + ((i % 1000 > 0)? " " + numberToWords(i % 1000):"") ;
		return numberToWords(i / 1000000) + " Million " + ((i % 1000000 > 0)? " " + numberToWords(i % 1000000):"") ;
	}

	public static BigInteger sumOfPowDigits(BigInteger nb, int pow) {
		BigInteger somme = new BigInteger("0");

		char[] array = nb.toString().toCharArray();


		for (char c : array) {
			somme = somme.add(new BigInteger(String.valueOf(c)).pow(pow));
		}

		return somme;
	}

	public static boolean isPrime(int num) {
		if (num == 2 ) return true;
		if (num % 2 == 0) return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0) return false;
		return true;
	}
	
	public static int[] decomposeByDigits(int nb) {
		String raw = String.valueOf(nb);

		int[] array = new int[raw.length()];

		for (int k = 0; k < raw.length(); k++) {
			array[k] = raw.charAt(k) - '0';
		}
		
		return array;
	}

	public static boolean nextPermutation(int[] array) {
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i]) {
			i--;
		}

		if (i <= 0) {
			return false;
		}

		int j = array.length - 1;
		while (array[j] <= array[i - 1]) {
			j--;
		}

		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		return true;
	}

	public static BigInteger factorial(BigInteger n) {
		BigInteger factorial = new BigInteger("1");
		
	    for (int i = 1; i <= n.intValue(); i++)
	        factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
	        
	    return factorial;
	}
	
	public static boolean isPalindrome(String str) {
		String tmp_str = str.replaceAll("\\s", "");
		if(tmp_str.equals(reverseStr(tmp_str))) {
			return true;
		}
		
		return false;
	}
	
	public static String reverseStr(String str) {
		StringBuilder letterBuff = new StringBuilder(str);
		return letterBuff.reverse().toString();
	}
	
	public static String convertToBin(int nb) {
		return Integer.toBinaryString(nb);
	}
	
	public static boolean isPythagoreanTriplet(int a, int b, int c) {
		return (a*a + b*b) == c*c;
	}
}

package problem36;

public class Main {
	public static void main(String[] args) {
		int somme = 0;
		
		for (int i = 0; i < 1000000; i++) {
			if(isPalindrome(String.valueOf(i)) && isPalindrome(convertToBin(i))) {
				System.out.println("i : " + i + " /// Bin : " + convertToBin(i));
				somme += i;
			}
		}
		
		System.out.println("\nSomme : " + somme);
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
}

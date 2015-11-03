package problem35;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		int count_circular_prime = 0;

		for (int nb = 2; nb < 1000000; nb++) {
			String raw = String.valueOf(nb);

			int[] array = new int[raw.length()];

			for (int k = 0; k < raw.length(); k++) {
				array[k] = raw.charAt(k) - '0';
			}

			boolean bool_primes = true;

			for (int i = 0; i < array.length; i++) {
				int depart = i;
				int length = array.length;
				int counter = depart;

				int j = 0;
				int arr[] = new int[array.length];

				while(counter < length) {
					arr[j] = array[counter];

					counter++;

					if(counter == length) {
						length = depart;
						counter = 0;
						depart = 0;
					}

					j++;
				}

				StringBuilder strNum = new StringBuilder();

				for (int num : arr) {
					strNum.append(num);
				}

				int permutation = Integer.parseInt(strNum.toString());

				if(!EulerUtils.isPrime(permutation)) {
					bool_primes = false;
				}
			}

			if (bool_primes) {
				count_circular_prime += 1;
			}
		}

		System.out.println("Circular prime bellow 1 000 000 count : " + count_circular_prime);
		EulerUtils.getExecutionTime(start);
	}
}


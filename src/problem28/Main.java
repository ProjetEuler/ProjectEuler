package problem28;

import java.math.BigInteger;

import utils.EulerUtils;

public class Main {
	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		int n = 1001;
		int matrice[][] = createMatix(n);
		
		BigInteger somme = new BigInteger("0");
		
		int counter_x = 0;
		int counter_y = 0;
		
		while(counter_x < n) {
			somme = somme.add(new BigInteger(String.valueOf(matrice[counter_x][counter_y])));
			counter_x++;
			counter_y++;
		}
		
		counter_x = n-1;
		counter_y = 0;
		
		while(counter_x >= 0) {
			somme = somme.add(new BigInteger(String.valueOf(matrice[counter_x][counter_y])));
			counter_x--;
			counter_y++;
		}
		
		System.out.println(somme.subtract(new BigInteger("1")).toString());
		
		EulerUtils.getExecutionTime(start);
	}

	public static int[][] createMatix(int n) {
		int A[][] = new int[n][n];
		int k = n * n, c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1;

		while (k >= 1) {
			for (int i = c1; i <= c2; i++) {
				A[r1][i] = k--;
			}

			for (int j = r1 + 1; j <= r2; j++) {
				A[j][c2] = k--;
			}

			for (int i = c2 - 1; i >= c1; i--) {
				A[r2][i] = k--;
			}

			for (int j = r2 - 1; j >= r1 + 1; j--) {
				A[j][c1] = k--;
			}

			c1++;
			c2--;
			r1++;
			r2--;
		}
		
		return A;
	}
}

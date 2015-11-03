package problem39;

import utils.EulerUtils;

public class Main {

	public static void main(String[] args) {
		long start = EulerUtils.getTime();
		
		int nb_trilpet = 0;
		int nb_solution_max = 0;
		int index = 0;
		
		for (int p = 0; p <= 1000; p++) {
			nb_trilpet = 0;
			for (int a = 1; a < p/2; a++) {
				for (int b = 1; b < p/2; b++) {
					for (int c = 1; c < p/2; c++) {
						if(a+b+c == p && EulerUtils.isPythagoreanTriplet(a, b, c)) {
							nb_trilpet++;
						}
					}
				}
			}
			
			if(nb_trilpet > nb_solution_max) {
				index = p;
				nb_solution_max = nb_trilpet;
			}
		}

		System.err.println("P : " + index);
		EulerUtils.getExecutionTime(start);
	}
}

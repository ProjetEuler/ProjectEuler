package problem10;

public class Main {
	public static void main(String[] args) {
		long somme = 0;
		for(int nombre = 2; nombre < 2000000; nombre++) {
			if(isPremier(nombre)) {
				System.out.println(nombre);
				somme += nombre;
			}
		}
		
		System.out.println("Somme : " + somme);
	}

	public static boolean isPremier(int nombre) {
		if(nombre == 2) {
			return true;
		} else {
			boolean isPremier = true;
			
			for(int i=2; i<= Math.ceil(Math.sqrt(nombre)); i++) {
				if((nombre % i) == 0) {
					isPremier = false;
				}
			}
			
			if(isPremier) {
				return true;
			} else {
				return false;
			}
		}
	}
}

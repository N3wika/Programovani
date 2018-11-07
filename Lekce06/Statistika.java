public class Statistika {
    public static void main(String[] args) {
		
		double soucet = 0.0;
		double soucetCtverec = 0.0;
		//nejmenší hodnota se inicializuje na max. možnou a obráceně
		double nejvetsi = -Double.MAX_VALUE;
		double nejmensi = Double.MAX_VALUE;
		int pocet = 0;
		
		System.out.println("Prosim, zadejte hodnoty oddelene ENTER. Zadavani ukoncete Ctrl+Z.");
					
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
        while (sc.hasNextDouble()) {
			double cislo = sc.nextDouble();
			
			//Soucet
			soucet += cislo;
			soucetCtverec += cislo*cislo;
			
			//Minimum
			if (cislo < nejmensi) {
				nejmensi = cislo;
			}
			
			//Maximum
			if (cislo > nejvetsi) {
				nejvetsi = cislo;
			}
			
			//Prumer - viz PrumerOprava
			
			++pocet;
		}
		//odchylka
		double prumer = soucet / pocet;
		double odchylka = Math.sqrt(soucetCtverec / pocet - (prumer * prumer));
		if (pocet != 0){
			System.out.printf("Soucet zadanych cisel je %f.\n", soucet);
			System.out.printf("Nejmensi ze zadanych cisel je %f.\n", nejmensi);
			System.out.printf("Nejvetsi ze zadanych cisel je %f.\n", nejvetsi);
			System.out.printf("Prumer je %f.\n", prumer);
			System.out.printf("Smerodatna odchylka je %f.\n", odchylka);
		} else {
			System.out.println("Nebyly zadany zadne hodnoty.");
		}	
	}
}

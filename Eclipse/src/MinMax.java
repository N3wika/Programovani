import java.io.FileNotFoundException;
import java.io.FileReader;

public class MinMax {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader soubor = new FileReader("cisla.txt");
		java.util.Scanner scanner = new java.util.Scanner(soubor);
		
		najdiMaximum(scanner);
        
        najdiMinimum(scanner);
        
	}

	private static void najdiMinimum(java.util.Scanner scanner) {
		int minimum = Integer.MAX_VALUE;
        boolean prvni = true;
        while (scanner.hasNextInt()) {
            int cislo = scanner.nextInt();
             
            if (prvni) {
                minimum = cislo;
                prvni = false;
            } else {
                if (cislo < minimum) {
                    minimum = cislo;
                }
            }
        }
        System.out.printf("Minimum je %d", minimum);
	}

	private static void najdiMaximum(java.util.Scanner scanner) {
		int maximum = Integer.MIN_VALUE;
        boolean prvni = true;
        while (scanner.hasNextInt()) {
            int cislo = scanner.nextInt();
             
            if (prvni) {
                maximum = cislo;
                prvni = false;
            } else {
                if (cislo > maximum) {
                    maximum = cislo;
                }
            }
        }
        System.out.printf("Maximum je %d", maximum);
	}

}

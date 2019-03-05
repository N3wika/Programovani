import java.io.FileNotFoundException;
import java.io.FileReader;

public class MinMax {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader soubor = new FileReader("cisla.txt");
		java.util.Scanner scanner = new java.util.Scanner(soubor);
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		
		while (scanner.hasNextInt()) {
            int cislo = scanner.nextInt();
            if (cislo < minimum) {
                minimum = cislo;
            } else if (cislo > maximum) {
                maximum = cislo;
            }
		}
		System.out.printf("Minimum je %d\n", minimum);
		System.out.printf("Maximum je %d\n", maximum);
		
	}
}
public class Sude {
    public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if ((a % 2) == 0) {
			System.out.printf("Cislo je sude");
		} else {
			System.out.printf("Cislo je liche");
		}	
	}
}
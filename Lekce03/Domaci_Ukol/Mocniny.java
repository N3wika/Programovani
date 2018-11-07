public class Mocniny {
	public static void main(String[] args) {
		int cislo = Integer.parseInt(args[0]);
		for (int a = 1; a * a < cislo; ++a) {
			System.out.printf("%d\t", a * a);
		}
	}
}
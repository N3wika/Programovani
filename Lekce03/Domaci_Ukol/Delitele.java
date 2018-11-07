public class Delitele {
	public static void main(String[] args) {
		int cislo = Integer.parseInt(args[0]);
		for (int delitel = 1; delitel < cislo + 1; ++delitel)
		if ((cislo % delitel) == 0) {
			System.out.printf("%d\t", delitel);
		}
	}
}
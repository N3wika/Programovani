public class Trojuhelnik2{
    public static void main(String[] args) {
		for (int delka = 5; delka >= 1; --delka) {
			for (int i = 0; i < delka; ++i) {
				System.out.printf(" ");
			}
			for (int j = 0; j < 5 - delka; ++j) {
				System.out.printf("X");
			}
			System.out.println();
        }
    }
}

public class Ramecek{
    public static void main(String[] args) {
		int sirka = 20;
		int vyska = 3;
		// horni linka
        for (int y = 0; y < 2; ++y) {
          for (int x = 0; x < sirka + 4; ++x) {
            System.out.printf("X");
          }
          System.out.println ("") ;
        }
		// strany
		for (int y = 0; y < vyska; ++y) {
			System.out.print("XX");
			for (int x = 0; x < sirka; ++x) {
				System.out.printf(" ");
			}
			System.out.println("XX");
        }
		// spodni linka
		for (int y = 0; y < 2; ++y) {
          for (int x = 0; x < sirka + 4; ++x) {
            System.out.printf("X");
          }
          System.out.println ("") ;
        }
    }
}

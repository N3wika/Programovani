public class RamecekLepsi{
    public static void main(String[] args) {
		int sirka = 20;
		int vyska = 3;
        for (int y = 0; y < vyska + 4; ++y) {
			for (int x = 0; x < sirka + 4; ++x) {
				if (y < 2 || y >= vyska + 2 || x < 2 || x >= sirka + 2){
					System.out.printf("X");
				} else {
					System.out.print(" ");
				}
          }
          System.out.println ("") ;
        }
    }
}

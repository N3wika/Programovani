
public class LinearniRovnice {

	public static void main(String[] args) {
		int pocetX = Integer.parseInt(args[0]);
		
		int[][] rovnice = vytvorMatici(pocetX);
		
		for (int sloupec = 0; sloupec < pocetX; ++sloupec){
			for (int kolikrat = pocetX - sloupec; kolikrat > 0; --kolikrat){
				rovnice[][sloupec]
			}
		}
	}

	private static int[][] vytvorMatici(int pocetX) {
		int[][] rovnice = new int [pocetX][pocetX + 1];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int radek = 0; radek < pocetX; ++radek){
			for (int cislo = 0; cislo < pocetX + 1; ++cislo){
				rovnice[radek][cislo] = sc.nextInt();
			}
		}
		return rovnice;
	}

}

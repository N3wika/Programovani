public class Krizek {
    public static void main(String[] args) {
        int velikost = Integer.parseInt(args[0]);
		
		for (int i = 0; i < velikost; ++i){
			mezery(' ', velikost);
			vypln('X', velikost);
			mezery(' ', velikost);
			System.out.println();
		}	
		
		for (int j = 0; j < (2 * velikost)/3; ++j) {
			celyRadek('X', velikost);
			System.out.println();
		}
		
		for (int k = 0; k < velikost; ++k){
			mezery(' ', velikost);
			vypln('X', velikost);
			mezery(' ', velikost);
			System.out.println();
		}
		
    }
	
	public static void mezery (char znak, int velikost){
		int pocetMezer = velikost + velikost / 3;
		while (pocetMezer > 0) {
			System.out.printf("%c", znak);
			--pocetMezer;
		}
	}
	
	public static void vypln (char znak, int velikost){
		int pocetX = velikost;
		while (pocetX > 0) {	
			System.out.printf("%c", znak);
			-- pocetX;
		}
	}
	
	public static void celyRadek (char znak, int velikost){
		int xVRadku = 3 * velikost + velikost/3 + velikost/3;
		while (xVRadku > 0){
			System.out.printf("%c", znak);
			--xVRadku;
		}
	}
}
public class KombinacniCislo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
		int k = Integer.parseInt(args[1]);
				
		if (n > k){
			long kombinace = pocitamNKFaktorial(k, n) / pocitamFaktorial(n - k);
			System.out.printf("Lze vytvorit %d kombinaci.", kombinace);
		} else {
			System.out.print("Pocet clenu v kombinaci nesmi byt vetsi nez pocet clenu v mnozine!");
		}
	}
	
	private static long pocitamFaktorial(int cislo) {
		long faktorial = 1;
		for (int i = 1; i <= cislo; ++i){
			faktorial *= i;
		}
		return faktorial;
	}
	
	//nFaktorian / kFaktorial -> pro presnost
	private static long pocitamNKFaktorial(int k, int n){
		long NKFaktorial = 1;
		for (int i = k + 1; i <= n; ++i){
			NKFaktorial *= i;
		}
		return NKFaktorial;
	}
}
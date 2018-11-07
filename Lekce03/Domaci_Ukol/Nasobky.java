public class Nasobky {
	public static void main(String[] args) {
		int pozice = 0;
		for (int i = 0 ; i < 11 ; ++i){
			System.out.printf("%d\t", 3 * i);
			if ( ++pozice == 4 ) {
				System.out.println();
				pozice = 0;
			}
		}
	}
}

public class Figurka {

	public static void main(String[] args) {
		int cil = Integer.parseInt(args[0]);
		int velikostDesky = 100;
		int policka[] = new int[velikostDesky];
		int krok = 0;
		
		if (cil != 0){
			while(policka[cil] != 0){
				//dopsat postup
				krok++;
			}
		} else {
			System.out.printf("Figurka se na %d dostane za %d kroku." cil, krok)
		}
		
	}

}

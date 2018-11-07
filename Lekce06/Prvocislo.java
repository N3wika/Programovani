public class Prvocislo {
    public static void main(String[] args) {
        int cislo = Integer.parseInt(args[0]);
		
		boolean jePrvocislo = true;
		for (int a = 2; a < cislo - 1; ++a){
			if (cislo % a == 0){
				jePrvocislo = false;
				break;
			} 
		}
		if (jePrvocislo) 
			System.out.println("Zadane cislo je prvocislem.");
		else
			System.out.println("Zadane cislo neni prvocislem.");
    }
}

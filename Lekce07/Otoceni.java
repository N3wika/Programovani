public class Otoceni {
    public static void main(String[] args) {
        awh.IntList cisla = awh.IntList.create();
 
        // Nacteme vsechna cisla.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
            cisla.add(sc.nextInt());
        }
		
		cisla.reverse();
		System.out.printf("%s ", cisla);
       
    }
}
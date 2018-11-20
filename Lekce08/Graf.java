 public class Graf {
    public static void main(String[] args) {
        tiskGrafu();
    }
    
    
    private static void tiskGrafu() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(sc.hasNextInt()) {
            int dalsiPolozka = sc.nextInt();
            tiskRadku('X', dalsiPolozka);
        }
    }
    private static void tiskRadku(char znak, int velikost){
        while (velikost > 0) {    
            System.out.printf("%c", znak);
            -- velikost;
        }
        System.out.println();
    }
    
}


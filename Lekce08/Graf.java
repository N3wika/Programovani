 public class Graf {
    public static void main(String[] args) {
        awh.IntList vsechnyHodnoty = awh.IntList.create();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        while (sc.hasNextInt()) {
            vsechnyHodnoty.add(sc.nextInt());
        }
        tiskGrafu(vsechnyHodnoty);
    }
    
    
    private static void tiskGrafu(awh.IntList vsechnyHodnoty) {
        
        int pocetHodnot = vsechnyHodnoty.size();
        int poradi = 0;
        while(pocetHodnot > 0) {
            int dalsiPolozka = vsechnyHodnoty.get(poradi);
            tiskRadku('X', dalsiPolozka);
            --pocetHodnot;
            ++poradi;
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


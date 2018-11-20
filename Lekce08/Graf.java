public class Graf {
    public static void main(String[] args) {
        awh.DoubleList vsechnyHodnoty = awh.DoubleList.create();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        while (sc.hasNextDouble()) {
            vsechnyHodnoty.add(sc.nextDouble());
        }
        tiskGrafu(aplikujiMeritko(vsechnyHodnoty));
    }
    //uprava hodnot
    private static awh.DoubleList aplikujiMeritko (awh.DoubleList vsechnyHodnoty){
        awh.DoubleList usmerneneHodnoty = awh.DoubleList.create();
        double nejvetsi = hledamNejvetsi(vsechnyHodnoty);
        if(nejvetsi > 60) {
            int poradi = 0;
            int pocetHodnot = vsechnyHodnoty.size();
            while(pocetHodnot > 0){
                usmerneneHodnoty.add(vsechnyHodnoty.get(poradi) * hledamMeritko(nejvetsi));
                --pocetHodnot;
                ++poradi;
            }
        } else {
            usmerneneHodnoty = vsechnyHodnoty;
        }
        return usmerneneHodnoty;
    }
    private static double hledamMeritko(double nejvetsi) {
        double meritko = (60 / nejvetsi); 
        return meritko;
    }
    private static double hledamNejvetsi (awh.DoubleList vsechnyHodnoty) {
        double nejvetsi = vsechnyHodnoty.get(0);
        int poradi = 0;
        for (int pocetHodnot = vsechnyHodnoty.size(); pocetHodnot > 0; --pocetHodnot) {
            double aktualni = vsechnyHodnoty.get(poradi);
            if (aktualni > nejvetsi) {
                nejvetsi = aktualni;
            }
            ++poradi;
        }
        return nejvetsi;
    }
    //tisk
    private static void tiskGrafu(awh.DoubleList usmerneneHodnoty) {
        
        int poradi = 0;
        for (int pocetHodnot = usmerneneHodnoty.size(); pocetHodnot > 0; --pocetHodnot) {
            double dalsiPolozka = usmerneneHodnoty.get(poradi);
            tiskRadku('X', dalsiPolozka);
            ++poradi;
        }
    }
    private static void tiskRadku(char znak, double velikost){
        while (velikost > 0) {
            velikost = (int)velikost;
            System.out.printf("%c", znak);
            -- velikost;
        }
        System.out.println();
    }
}
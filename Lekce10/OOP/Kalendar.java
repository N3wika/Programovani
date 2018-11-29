public class Kalendar {
    private int den;
    private int mesic;
    private int rok;
    public Kalendar(int r, int m, int d) {
        rok = r;
        mesic = m;
        den = d;
    }
 
    public boolean jePrestupnyRok() {
        boolean delitelny4 = (rok % 4) == 0;
        boolean delitelny100 = (rok % 100) == 0;
        boolean delitelny400 = (rok % 400) == 0;
 
        if (delitelny400) {
            return true;
        } else if (delitelny100) {
            return false;
        } else {
            return delitelny4;
        }
    }
 
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", rok, mesic, den);
    }
}
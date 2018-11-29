public class Ukazka {
    public static void main(String[] args) {
        Kalendar kal = new Kalendar(2015, 11, 12);
        if (kal.jePrestupnyRok()) {
            /* Interne se zavola kal.toString() */
            System.out.printf("%s je z prestupneho roku.\n", kal);
        } else {
            System.out.printf("%s neni z prestupneho roku.\n", kal);
        }
    }
}
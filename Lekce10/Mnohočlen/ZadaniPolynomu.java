public class ZadaniPolynomu {
    public static void main(String[] args) {
        Polynom p1 = new Polynom(-7.0, 3.0, 0.0, -5.0);
        Polynom p2 = new Polynom(-1.0, 2.0, 6.0, 0.0, 4.0);
        
        //soucet
        System.out.println( "Soucet" );
        p1.tiskni();
        System.out.println( "+" );
        p2.tiskni();
        
        p1.pricti(p2);
        
        System.out.println( "=" );
        p1.tiskni();
        
        //odcitani
        System.out.println( "Odcitani" );
        p1.tiskni();
        System.out.println( "-" );
        p2.tiskni();
        
        p1.odecti(p2);
        
        System.out.println( "=" );
        p1.tiskni();
        
        //nasobeni 
        System.out.println( "Nasobeni" );
        p1.tiskni();
        System.out.println( "*" );
        p2.tiskni();
        
        p1.nasob(p2);
        
        System.out.println( "=" );
        p1.tiskni();
    }
}
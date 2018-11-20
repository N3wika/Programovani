public class Graf {

    public static void main( String[] args ) {
        System.out.println("Vlozte cislicka - vypadne graf :]");
        awh.DoubleList vsechnyHodnoty = awh.DoubleList.create();
        java.util.Scanner sc = new java.util.Scanner( System.in );

        while ( sc.hasNextDouble() ) {
            vsechnyHodnoty.add( sc.nextDouble() );
        }
        tiskGrafu( aplikujiMeritko( vsechnyHodnoty ) );
    }


    //uprava hodnot

    private static awh.DoubleList aplikujiMeritko( awh.DoubleList vsechnyHodnoty ) {
        awh.DoubleList usmerneneHodnoty = awh.DoubleList.create();
        double nejvetsi = hledamNejvetsi( vsechnyHodnoty );
        if ( nejvetsi > 60.0 ) {
            for ( int i = 0; i < vsechnyHodnoty.size(); ++i ) {
                usmerneneHodnoty.add( vsechnyHodnoty.get( i ) * hledamMeritko( nejvetsi ) );
            }
        } else {
            usmerneneHodnoty = vsechnyHodnoty;
        }
        return usmerneneHodnoty;
    }


    private static double hledamMeritko( double nejvetsi ) {
        double meritko = 60.0 / nejvetsi;
        return meritko;
    }


    private static double hledamNejvetsi( awh.DoubleList vsechnyHodnoty ) {
        double nejvetsi = vsechnyHodnoty.get( 0 );
        for ( int i = 0; i < vsechnyHodnoty.size(); ++i ) {
            double aktualni = vsechnyHodnoty.get( i );
            if ( aktualni > nejvetsi ) {
                nejvetsi = aktualni;
            }
        }
        return nejvetsi;
    }


    //tisk

    private static void tiskGrafu( awh.DoubleList usmerneneHodnoty ) {
        for ( int i = 0; i < usmerneneHodnoty.size(); ++i ) {
            tiskRadku( 'X', usmerneneHodnoty.get( i ).intValue() );
        }
    }


    private static void tiskRadku( char znak, int velikost ) {
        for ( int i = 0; i < velikost; ++i ) {
            System.out.printf( "%c", znak );
        }
        System.out.println();
    }
}

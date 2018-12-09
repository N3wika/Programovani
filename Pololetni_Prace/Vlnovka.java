//program kresli vlnovku o zadane velikosti 

public class Vlnovka {

    public static void main( String args[] ) {
        int velikost = Integer.parseInt( args[0] );
        for ( int radek = 0; radek < velikost; ++radek ) {
            for ( int znak = 0; znak < 80; ++znak ) {
                if ( tiskZnaku( velikost, radek, znak ) ) {
                    System.out.print( "#" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println( );
        }
    }

    private static boolean tiskZnaku( int velikost, int radek, int znak ) {
        return ( znak + radek ) % ( 2 * velikost - 2 ) == 0 || ( znak - radek ) % ( 2 * velikost - 2 ) == 0;
    }
}

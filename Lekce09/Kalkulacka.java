public class Kalkulacka {

    public static void main( String[] args ) {
        String vstup = args[0];
        String[] scitance = vstup.split( "\\+" );

        int soucet = 0;
        for ( int i = 0; i < scitance.length; ++i ) {
            soucet += nasobeni( scitance[i] );
        }

        System.out.printf( "%d", soucet );
    }


    private static int nasobeni( String vstup ) {
        String[] cinitele = vstup.split( "x" );
        int soucin = 1;
        for ( int i = 0; i < cinitele.length; ++i ) {
            soucin *= Integer.parseInt( cinitele[i] );
        }
        return soucin;
    }
}

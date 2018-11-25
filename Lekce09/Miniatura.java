//vyuzit kod z https://alej.alisma.cz/prog1/pg09/index.html
public class Miniatura {

    public static void main( String[] args ) {
        String vstupniSoubor;
        int sirka = 300;
        int vyska = 150;
        String vystupniSoubor;
        boolean deformace = false;

        if ( args.length == 2 ) {
            vstupniSoubor = args[0];
            vystupniSoubor = args[1];
        } else if ( args.length == 3 ) {
            vstupniSoubor = args[0];
            String rozmer = args[1];
            vystupniSoubor = args[2];

            deformace = rozmer.endsWith( "!" );
            if ( deformace ) {
                rozmer = rozmer.substring( 0, rozmer.length() - 1 );
            }

            String[] rozmery = rozmer.split( "x" );
            if ( rozmery.length != 2 ) {
                awh.Sys.die( "Spatne zadane rozmery (%s).", args[1] );
            }
            sirka = Integer.parseInt( rozmery[0] );
            vyska = Integer.parseInt( rozmery[1] );
        } else {
            awh.Sys.die( "Pouziti: vstup.jpg [VxS] vystup.jpg" );
            // Bez returnu si bude prekladac stezovat
            return;
        }

        vytvorNahled( vstupniSoubor, vystupniSoubor, sirka, vyska, deformace );
    }


    private static void vytvorNahled( String vstupniSoubor, String vystupniSoubor, int sirka, int vyska, boolean deformace ) {
        if ( deformace ) {
            awh.Image obrazek = awh.Image.loadFromFile( vstupniSoubor );
            obrazek.rescale( sirka, vyska );
            obrazek.saveToFile( vystupniSoubor );
        } else {
            vytvorNahledBezDeformace( vstupniSoubor, vystupniSoubor, sirka, vyska );
        }
    }


    private static void vytvorNahledBezDeformace( String vstupniSoubor, String vystupniSoubor, int sirka, int vyska ) {
        awh.Image obrazek = awh.Image.loadFromFile( vstupniSoubor );
        int sirkaNahled = sirka;
        int vyskaNahled = vyska;
        if ( (double) obrazek.getWidth() / (double) obrazek.getHeight() > (double) sirka / (double) vyska ) {
            vyskaNahled = (int) ( (double) obrazek.getHeight() / ( (double) obrazek.getWidth() / sirka ) );
        } else {
            sirkaNahled = (int) ( (double) obrazek.getWidth() / ( (double) obrazek.getHeight() / vyska ) );
        }
        obrazek.rescale( sirkaNahled, vyskaNahled );

        awh.Image pozadi = awh.Image.createEmpty( sirka, vyska, awh.Color.GRAY );

        pozadi.pasteFrom( obrazek, ( sirka - sirkaNahled ) / 2, ( vyska - vyskaNahled ) / 2 );

        pozadi.saveToFile( vystupniSoubor );

    }

}

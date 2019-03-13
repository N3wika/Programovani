import java.io.IOException;
import java.io.PrintWriter;

public class Nasobky {

    public static void main( String[] args ) throws IOException {
        PrintWriter writer = new PrintWriter( "nasobky.txt" );
        int cislaNaRadku = 0;
        for ( int i = 0; i < 1000; i += 3 ) {

            writer.printf( "%d, ", i );
            cislaNaRadku++;
            if ( cislaNaRadku == 10 ) {
                writer.println();
                cislaNaRadku = 0;
            }
        }
        writer.close();
    }

}

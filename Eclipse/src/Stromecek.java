import java.io.File;

public class Stromecek {

    public static void main( String[] args ) {
        printFiles( new File( "." ), "" );
    }


    private static void printFiles( File dir, String indent ) {
        File[] files = dir.listFiles();

        for ( int i = 0; i < files.length; ++i ) {
            boolean posledni = i == files.length - 1;
            String novyIndent = posledni ? indent + "`--" : indent + "|--";
            

            System.out.printf( "%s%s\n", novyIndent, files[i].getName() );
            if ( files[i].isDirectory() ) {
                printFiles( files[i], indent + (posledni ? "    " : "|   " ));
            }
        }
    }
}

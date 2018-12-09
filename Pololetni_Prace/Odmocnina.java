// program vypocita treti odmocninu zadaneho cisla se zadanou presnosti, vyuziva knihovnu awh.jar

public class Odmocnina {

    public static void main( String[] args ) {
        // inicializace hodnot potrebnych k vypoctu
        double tretiMocnina = 0;
        double cilovaOdchylka = 0.0001;
        if ( args.length == 1 ) {
            tretiMocnina = Double.parseDouble( args[0] );
        } else if ( args.length == 2 ) {
            tretiMocnina = Double.parseDouble( args[0] );
            cilovaOdchylka = Double.parseDouble( args[1] );
        } else {
            awh.Sys.die( "Prosim zadejte argumenty v podobe: cislo_v_treti_mocnine pozadovana_minimalni_presnost" );
        }
        double odhad = tretiMocnina / 3.0;
        double odchylka = cilovaOdchylka * 2.0;

        // dokud neni dosazeno pozadovane odchylky, opakuje vypocet, ktery se postupne zpresnuje
        while ( odchylka > cilovaOdchylka ) {
            // pomoci Newtonovy metody odhaduje treti odmocninu 
            double novy = ( tretiMocnina / ( odhad * odhad ) + 2 * odhad ) / 3;
            odchylka = novy - odhad;
            if ( odchylka < 0.0 ) {
                odchylka = -odchylka;
            }
            odhad = novy;
        }
        System.out.printf( "Treti odmocnina z cisla %f je %f s odchylkou %f.", tretiMocnina, odhad, odchylka );

    }

}

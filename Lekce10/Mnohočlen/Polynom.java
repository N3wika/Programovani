public class Polynom {

    private double[] koeficienty;


    public Polynom( double... cisla ) {
        koeficienty = cisla.clone();
    }


    public void pricti( Polynom polynom ) {
        if ( this.koeficienty.length < polynom.koeficienty.length ) {
            zmenDelkuPolynomu( polynom.koeficienty.length );
        }
        for ( int i = 0; i < koeficienty.length; ++i ) {
            koeficienty[i] += polynom.koeficienty[i];
        }
        zkrat();
    }


    public void odecti( Polynom polynom ) {
        if ( this.koeficienty.length < polynom.koeficienty.length ) {
            zmenDelkuPolynomu( polynom.koeficienty.length );
        }
        for ( int i = 0; i < koeficienty.length; ++i ) {
            koeficienty[i] -= polynom.koeficienty[i];
        }
        zkrat();
    }


    public void nasob( Polynom polynom ) {
        double[] nove = new double[this.koeficienty.length * polynom.koeficienty.length];
        for ( int i = 0; i < this.koeficienty.length; ++i ) {
            for ( int j = 0; j < polynom.koeficienty.length; ++j ) {
                nove[i + j] += this.koeficienty[i] * polynom.koeficienty[j];
            }
        }
        this.koeficienty = nove;
        zkrat();
    }



    private void zmenDelkuPolynomu( int novaDelka ) {
        double[] noveKoeficienty = new double[novaDelka];
        for ( int i = 0; i < novaDelka; ++i ) {
            if ( i < this.koeficienty.length ) {
                noveKoeficienty[i] = this.koeficienty[i];
            } else {
                noveKoeficienty[i] = 0.0;
            }
        }
        this.koeficienty = noveKoeficienty;
    }


    public void tiskni() {
        boolean dalsiHodnota = false;
        for ( int i = koeficienty.length - 1; i >= 0; --i ) {
            //for ( int i = 0; i < koeficienty.length; ++i ) {
            if ( koeficienty[i] == 0.0 ) continue;
            if ( koeficienty[i] < 0.0 ) {
                System.out.print( " - " );
            } else if ( dalsiHodnota ) {
                System.out.print( " + " );
            }
            if ( i > 0 ) {
                System.out.printf( "%.2f*x^%d ", Math.abs( koeficienty[i] ), i );
            } else {
                System.out.printf( "%.2f ", Math.abs( koeficienty[i] ) );
            }
            dalsiHodnota = true;
        }
        System.out.println();
    }


    private void zkrat() {
        for ( int i = this.koeficienty.length - 1; i >= 0; --i ) {
            if ( this.koeficienty[i] != 0.0 ) {
                if ( i != this.koeficienty.length - 1 ) 
                    zmenDelkuPolynomu( i + 1 );
                break;
            }
        }
    }

}

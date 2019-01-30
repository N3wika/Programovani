
public class LinearniRovnice {

	public static void main(String[] args) {
		int pocetX = Integer.parseInt(args[0]);
		int clenyVRovnici = pocetX + 1;
		double[][] rovnice = vytvorMatici(pocetX, clenyVRovnici);
		eliminujNezname( pocetX, clenyVRovnici, rovnice );
		dosad( pocetX, clenyVRovnici, rovnice );
		vytiskniX( pocetX, clenyVRovnici, rovnice );
	}

    private static void vytiskniX( int pocetX, int clenyVRovnici, double[][] rovnice ) {
        for (int radek = 0; radek < pocetX; ++radek) {
		    System.out.printf( "x_%d = %.1f\n", radek + 1, rovnice[radek][clenyVRovnici - 1] );
		}
    }

    private static void dosad( int pocetX, int clenyVRovnici, double[][] rovnice ) {
        for (int radek = pocetX - 1; radek > 0; --radek) {
		    dosadRadek( clenyVRovnici, rovnice, radek );
		    normalizujRovnici( clenyVRovnici, rovnice, radek );
		}
    }

    private static void dosadRadek( int clenyVRovnici, double[][] rovnice, int radek ) {
        double x = rovnice[radek - 1][radek];
        for (int sloupec = 0; sloupec < clenyVRovnici; ++sloupec) {
            rovnice[radek - 1][sloupec] -= (x * rovnice[radek][sloupec]) ;
        }
    }

    private static void eliminujNezname( int pocetX, int clenyVRovnici, double[][] rovnice ) {
        for (int radek = 0; radek < pocetX; ++radek) {
            normalizujRovnici( clenyVRovnici, rovnice, radek );
            if (radek != pocetX - 1) {
                odectiRovnici( clenyVRovnici, rovnice, radek );
            }
		}
    }
    
    private static void normalizujRovnici( int clenyVRovnici, double[][] rovnice, int radek ) {
        double koeficient = rovnice[radek][radek];
        for (int sloupec = 0; sloupec < clenyVRovnici; ++sloupec) {
            rovnice[radek][sloupec] /= koeficient;
        }
    }
    

    private static void odectiRovnici( int clenyVRovnici, double[][] rovnice, int radek ) {
        double timhleNasobim = rovnice[radek + 1][radek];
        for (int sloupec = 0; sloupec < clenyVRovnici; ++sloupec) {
            rovnice[radek + 1][sloupec] -= (timhleNasobim * rovnice[radek][sloupec]) ;
      }
    }

	private static double[][] vytvorMatici(int pocetX, int clenyVRovnici) {
		double[][] rovnice = new double [pocetX][clenyVRovnici];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int radek = 0; radek < pocetX; ++radek){
			for (int cislo = 0; cislo < clenyVRovnici; ++cislo){
				rovnice[radek][cislo] = sc.nextInt();
			}
		}
		return rovnice;
	}
	
	//pro kontrolu v prubehu
    private static void tiskniMatici (int pocetX, int clenyVRovnici, double[][] rovnice) {
        for (int r = 0; r < pocetX; ++r) {
            for (int s = 0; s < clenyVRovnici; ++s) {
                System.out.printf( "%2.1f ", rovnice[r][s] );
            }
            System.out.println( );
        }
    }
}

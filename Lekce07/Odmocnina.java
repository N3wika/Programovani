public class Odmocnina {
    public static void main(String[] args) {
        double druhaMocnina = Double.parseDouble(args[0]); 
		double cilovaOdchylka = Double.parseDouble(args[1]);
		
		if (druhaMocnina > 0.0){
			double odhad = druhaMocnina/2.0;
			double odchylka = cilovaOdchylka * 2.0;
			
			while(odchylka > cilovaOdchylka) {
			    double novyOdhad = (odhad + (druhaMocnina / odhad)) / 2.0;
			    odchylka = novyOdhad - odhad;
			    if (odchylka < 0.0) {
			        odchylka = -odchylka;
			    }
			    odhad = novyOdhad;
			}
			
			System.out.printf("Druha odmocnina z cisla %f je %f s odchylkou %f.", druhaMocnina, odhad, odchylka);
		} else{
			System.out.printf("Druha odmocnina z cisla %f neexistuje, protoze cislo je zaporne nebo nula.", druhaMocnina);	
		}
	}
}
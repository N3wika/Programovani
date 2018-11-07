public class Nahled {
    public static void main(String[] args) {
        int sirka = 150;
        int vyska = 100;
 
        awh.Image obr = awh.Image.loadFromFile(args[0]);
		
		if ( (double)obr.getWidth() / (double)obr.getHeight() > (double)sirka / (double)vyska ) {
			//sirka zustava 150
			vyska = (int)((double)obr.getHeight() / ((double)obr.getWidth() / sirka));
		} else {
			sirka = (int)((double)obr.getWidth() / ((double)obr.getHeight() / vyska));
		}
        obr.rescale(sirka, vyska);
		
		awh.Image pozadi = awh.Image.createEmpty(150, 100, awh.Color.fromRgb( 128, 128, 128 ));
		
		pozadi.pasteFrom(obr, (150 - sirka) / 2, (100 - vyska) / 2);
		
		pozadi.saveToFile(args[1]);
    }
}
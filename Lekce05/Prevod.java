public class Prevod {
    public static void main(String[] args) {
        awh.Image obr = awh.Image.loadFromFile(args[0]);
        System.out.printf("Velikost %s: %dx%d\n",
                args[0],
                obr.getWidth(),
                obr.getHeight()
        );
 
        obr.saveToFile(args[1]);
    }
}
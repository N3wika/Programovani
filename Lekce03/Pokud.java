public class Pokud {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
          for (int j = 0; j < 6; j++) {
            if ((j * i) % 2 == 0) {
            System.out.printf("X");
          }  else {
          System.out.print ("-") ;
        }
    }
      System.out.println ("") ;
    }
}
}
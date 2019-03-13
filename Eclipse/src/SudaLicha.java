
import java.io.IOException;
import java.io.PrintWriter;
 
public class SudaLicha {
    public static void main(String[] args) throws IOException {
        int cislo = Integer.parseInt(args[0]);
        PrintWriter suda = new PrintWriter("suda.txt");
        PrintWriter licha = new PrintWriter("licha.txt");
        
        for (int i = 0; i < cislo; i++) {
            if(i%2==0) {
                suda.printf("%d ", i);
            } else {
                licha.printf("%d ", i);
            }
            
        }
        licha.close();
        suda.close();
    }
}
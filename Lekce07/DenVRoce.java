 public class DenVRoce {
    public static void main(String[] args) {
      int rok = Integer.parseInt(args[0]);
      int mesic = Integer.parseInt(args[1]);
      int den = Integer.parseInt(args[2]);
      
      dnyVMesici = dny(rok);
      
      int denVRoce = celkemDnyVMesicich + den
             
    }  

   public static boolean jePrestupny(int rok) {
        return (rok % 4) == 0;
   }

   public static awh.IntList dny(int rok) {
      if (jePrestupny(rok)) {
        return awh.IntList.create(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)          
      } else {
        return awh.IntList.create(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)   
      }
    }
    
    public static void celkemDnyVMesici (){
          int celeMesice = mesic - 1
    }
        
}

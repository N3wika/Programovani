 public class DenVRoce {
    public static void main(String[] args) {
		int den = Integer.parseInt(args[0]);
		int mesic = Integer.parseInt(args[1]);
		int rok = Integer.parseInt(args[2]);
	  
		awh.IntList dnyVMesici = dny(rok);
      
		int denVRoce = celkemDnyVMesicich(dnyVMesici, mesic) + den;
	  
	System.out.printf("%d", denVRoce);
             
    }  

	public static boolean jePrestupny(int rok) {
		return (rok % 4) == 0 && ((rok % 100) != 0 || (rok % 400) == 0);
		
	
   }

   public static awh.IntList dny(int rok) {
      if (jePrestupny(rok)) {
        return awh.IntList.create(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);          
      } else {
        return awh.IntList.create(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);   
      }
    }
    
    public static int celkemDnyVMesicich (awh.IntList dnyVMesici, int mesic){
		int soucetDnu = 0;
		
		//i < mesic - 1 => zaciname NULOU!!!
		for (int i = 0; i < mesic - 1; i++) {
			soucetDnu += dnyVMesici.get(i);
		}
		return soucetDnu;
    }
        
}

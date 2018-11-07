public class Maximum {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
		int nejvetsi = sc.nextInt();
        while (sc.hasNextInt()) {
			int a = sc.nextInt();
			if (a > nejvetsi) {
				nejvetsi = a;
			}
        }
		System.out.print("Nejvetsi ze zadanych cisel je ");
		System.out.printf("%d",nejvetsi);
    }
}
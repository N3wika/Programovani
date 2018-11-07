public class Kvadratika {
    public static void main(String[] args) {
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double Diskriminant = (b * b) - (4.0 * a * c);
	if (Diskriminant >= 0.0) {
		double x1 = (-b + Math.sqrt(Diskriminant) ) / (2.0 * a);
		double x2 = (-b - Math.sqrt(Diskriminant) ) / (2.0 * a);
		System.out.println("Koreny rovnice jsou:");
		System.out.printf("%f\n", x1);
		System.out.printf("%f\n", x2);
	} else {
		System.out.println("Rovnice nema reseni!");
	}	
    }
}
import java.util.Locale;
import java.util.Scanner;

public class U_1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double soma = 0.0;
		int contador = 0;
		double total;
		
		for(int i = 1; i <= 6; i++) {
			
			double a1 = sc.nextDouble();
			
			if (a1 > 0) {
				soma += a1;
				contador += 1;
			}
	
		}
		
		total = (double) soma / contador;
		
		System.out.println(contador + " valores positivos");
		System.out.printf("%.1f%n", total);
		
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class U_1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, raio;
		double n = 3.14159;
		
		raio = sc.nextDouble();
		
		area = n * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		
		
		sc.close();
	}

}

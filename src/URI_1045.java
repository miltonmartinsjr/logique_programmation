import java.util.Locale;
import java.util.Scanner;

public class URI_1045 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double aux = 0;
	
		while (B > A || C > A) {
			aux = A;
			A = B;
			B = aux;

			aux = A;
			A = C;
			C = aux;
		}
		 if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if(A * A == B * B + C * C) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if(A * A > B * B + C * C) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if(A * A < B * B + C * C) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if ( A == B && A == C && B == C ) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if(A == B || A == C || B == C) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		
		sc.close();
	}

}

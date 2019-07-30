import java.util.Locale;
import java.util.Scanner;

public class URI_1051 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto;

		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			imposto = (salario - 4500.0) * 0.28;
			imposto = imposto + 1500.0 * 0.18;
			imposto = imposto + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}

}

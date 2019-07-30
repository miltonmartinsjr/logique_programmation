import java.util.Locale;
import java.util.Scanner;

public class URI_1038 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		double valor = a, soma;

		switch (a) {
		case 1:
			valor = 4.00;
			break;
		case 2:
			valor = 4.50;
			break;
		case 3:
			valor = 5.00;
			break;
		case 4:
			valor = 2.00;
			break;
		case 5:
			valor = 1.50;
		default:
			break;
		}

		soma = (double) valor * b;

		System.out.printf("Total: R$ %.2f%n",soma);

		sc.close();
	}

}

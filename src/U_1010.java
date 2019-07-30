import java.util.Locale;
import java.util.Scanner;

public class U_1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1, qtd1, peca2, qtd2;
		double prix1, prix2, total;

		peca1 = sc.nextInt();
		qtd1 = sc.nextInt();
		prix1 = sc.nextDouble();
		peca2 = sc.nextInt();
		qtd2 = sc.nextInt();
		prix2 = sc.nextDouble();

		total = (qtd1 * prix1) + (qtd2 * prix2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

		sc.close();
	}

}

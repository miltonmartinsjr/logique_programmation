import java.util.Locale;
import java.util.Scanner;

public class U_1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFunc, horasTrab;
		double valorPorHora, total;

		numFunc = sc.nextInt();
		horasTrab = sc.nextInt();
		valorPorHora = sc.nextDouble();

		total = horasTrab * valorPorHora;

		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f%n", total);

		sc.close();
	}

}

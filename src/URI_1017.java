import java.util.Locale;
import java.util.Scanner;

public class URI_1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo, distancia;
		int kmLitro = 12;
		double resultado;

		tempo = sc.nextInt();
		distancia = sc.nextInt();

		resultado = (double)(tempo * distancia) / kmLitro;

		System.out.printf("%.3f%n", resultado);

		sc.close();
	}

}

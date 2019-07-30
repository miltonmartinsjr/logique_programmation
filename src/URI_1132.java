import java.util.Scanner;

public class URI_1132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int maior, menor;

		if (X < Y) {
			maior = Y;
			menor = X;
		} else {
			maior = X;
			menor = Y;
		}

		int soma = 0;

		for (int i = menor; i <= maior; i++) {

			if (i % 13 != 0) {
				soma = soma + i;
			}
		}

		System.out.println(soma);

		sc.close();
	}

}

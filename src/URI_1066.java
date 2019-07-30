import java.util.Scanner;

public class URI_1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

		for (int i = 0; i <= 4; i++) {

			int x = sc.nextInt();
			
			if (x % 2 == 0) {
				cont1 += 1;
			}
			if (x % 2 != 0) {
				cont2 += 1;
			}
			if (x > 0) {
				cont3 += 1;
			}
			if (x < 0) {
				cont4 += 1;
			}
		}

		System.out.println(cont1 + " valor(es) par(es)");
		System.out.println(cont2 + " valor(es) impar(es)");
		System.out.println(cont3 + " valor(es) positivo(s)");
		System.out.println(cont4 + " valor(es) negativo(s)");

		sc.close();
	}

}

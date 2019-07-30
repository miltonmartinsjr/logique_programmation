import java.util.Scanner;

public class URI_1042 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int aux = 0;

		int aux1 = a;
		int aux2 = b;
		int aux3 = c;

		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if (a > c) {

			aux = a;
			a = c;
			c = aux;
		}
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		if (b < a) {
			aux = b;
			b = a;
			a = aux;
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println(aux1);
		System.out.println(aux2);
		System.out.println(aux3);

		sc.close();
	}

}

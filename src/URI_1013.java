import java.util.Locale;
import java.util.Scanner;

public class URI_1013 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, E;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		D = (A + B + Math.abs(A - B)) / 2;

		E = (D + C + Math.abs(D - C)) / 2;

		System.out.println(E + " eh o maior");

		sc.close();
	}

}

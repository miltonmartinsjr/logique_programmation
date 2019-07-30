import java.util.Scanner;

public class URI_1158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			int cont = 0;

			if (x % 2 != 0) {
				for (int a = 1; a <= y; a++) {
					cont = cont + x;
					x += 2;
				}
			} else {
				x += 1;
				for (int a = 1; a <= y; a++) {
					cont = cont + x;
					x += 2;
				}

			}

			System.out.println(cont);
		}

		sc.close();
	}

}

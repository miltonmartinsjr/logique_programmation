import java.util.Scanner;

public class URI_1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X > 0 && Y > 0) {

			int max = X;
			int min = Y;

			if (Y > X) {
				max = Y;
				min = X;
			}
			
			int cont = 0;
			for (int i = min; i <= max; i++) {
				cont = cont + i;
				System.out.print(i + " ");
			}

			System.out.println("Sum=" + cont);
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();
	}

}

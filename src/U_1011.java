import java.util.Locale;
import java.util.Scanner;

public class U_1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		int volume = sc.nextInt();

		double total = (double) (4 / 3.0) * pi * Math.pow(volume, 3.0);

		System.out.printf("VOLUME = %.3f%n", total);

		sc.close();
	}

}

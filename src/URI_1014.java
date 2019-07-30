import java.util.Locale;
import java.util.Scanner;

public class URI_1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total;
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		total = X / Y;
		
		System.out.printf("%.3f km/l%n", total);
		
		sc.close();
	}

}

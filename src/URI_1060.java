

import java.util.Locale;
import java.util.Scanner;

public class URI_1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		double total;
		
		if(a > 0) {
			a = 1;
		}
		else if (a < 0) {
			a = 0;
		}
		if ( b > 0) {
			b = 1;
		}
		else if (b < 0) {
			b = 0;
		}
		if( c > 0) {
			c = 1;
		}
		else if (c < 0) {
			c = 0;
		}
		if( d > 0) {
			d = 1;
		}
		else if (d < 0) {
			d = 0;
		}
		if( e > 0) {
			e = 1;
		}
		else if (e < 0) {
			e = 0;
		}
		if( f > 0) {
			f = 1;
		}
		else if (f < 0) {
			f = 0;
		}
		
		total = a+b+c+d+e+f;
		
		System.out.printf("%.0f valores positivos%n", total);	
				
		sc.close();
	}

}

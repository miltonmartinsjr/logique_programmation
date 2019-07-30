import java.util.Locale;
import java.util.Scanner;

public class URI_1154 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int resultado = 0;
		int cont = 0;
		double media;
		
		while(idade >= 0) {
			resultado = resultado + idade;
			cont += 1;
			idade = sc.nextInt();
		}
		
		media = (double) resultado / cont;
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}

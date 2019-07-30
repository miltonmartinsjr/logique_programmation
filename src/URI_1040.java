import java.util.Locale;
import java.util.Scanner;

public class URI_1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		
		
		float media = (N1 * 2f + N2 * 3f + N3 * 4f + N4 * 1f) / 10f;
		
		System.out.printf("Media: %.1f%n", media);
		
		if(media < 5f) {
			
			System.out.println("Aluno reprovado.");
		}
		else if( media >= 7f) {

			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			float N5 = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", N5);
			float calculo = (N5 + media) / 2f;
			if(calculo >= 5f) {
				System.out.println("Aluno aprovado.");
					
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", calculo);
			
		}
		
		sc.close();
	}

}

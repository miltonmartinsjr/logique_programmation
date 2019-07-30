import java.util.Locale;
import java.util.Scanner;

public class URI_1094 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		int somaR = 0;
		int somaS = 0;
		int somaC = 0;
		
		for(int i = 1; i<= entrada; i++) {
			
			int qtd = sc.nextInt();
			char type = sc.next().charAt(0);
			
			if(type == 'R') {
				 somaR += qtd;
			}
			else if(type == 'S') {
				somaS += qtd;
			}
			else if(type == 'C') {
				somaC += qtd;
			}
		}
		
		int total = somaR + somaS + somaC;
		
		double perCol = (double) somaC / total * 100.0; 
		double perRat = (double) somaR / total * 100.0; 
		double perSap = (double) somaS / total * 100.0; 
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + somaC);
		System.out.println("Total de ratos: " + somaR);
		System.out.println("Total de sapos: " + somaS);
		
		System.out.printf("Percentual de coelhos: %.2f %%%n", perCol);
		System.out.printf("Percentual de ratos: %.2f %%%n", perRat);
		System.out.printf("Percentual de sapos: %.2f %%%n", perSap);
		
		
		sc.close();
	}

}

import java.util.Scanner;

public class URI_1134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		
		int entrada = sc.nextInt();
			
			while(entrada != 4) {
				
				if(entrada == 1) {
					cont1 += 1;	
				}
				else if(entrada == 2) {
					cont2 += 1;
				}
				else if (entrada == 3) {
					cont3 += 1;
				}
				
				entrada = sc.nextInt();
			}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + cont1);
		System.out.println("Gasolina: " + cont2);
		System.out.println("Diesel: " + cont3);
		
		sc.close();
	}

}

import java.util.Scanner;

public class URI_1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		for(int i = 0; i <= 4; i++) {
			
			int X = sc.nextInt();
			
			if( X % 2 == 0) {
				cont += 1;
			}
		}
		
		System.out.println(cont + " valores pares");
		
		sc.close();
	}

}

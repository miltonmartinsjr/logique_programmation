import java.util.Scanner;

public class URI_1080 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = sc.nextInt();
		int posicao = 1;
		
		for(int i = 2; i <= 100; i ++) {
			
			int X = sc.nextInt();
			
			if(X > maior) {
				maior = X;
				posicao = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();
	}

}

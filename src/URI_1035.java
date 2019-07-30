import java.util.Scanner;

public class URI_1035 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, soma1, soma2, teste;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		soma1 = C + D;
		soma2 = A + B;
		teste = A % 2;
		
		if(B > C && D > A && C > 0 && D > 0 && soma1 > soma2 && teste == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();
	}

}

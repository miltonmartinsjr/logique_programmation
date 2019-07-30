import java.util.Scanner;

public class URI_1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, resto, not100, not50, not20, not10, not5, not2, not1;

		N = sc.nextInt();
		System.out.println(N);

		not100 = N / 100;
		resto = N % 100;
		not50 = resto / 50;
		resto = resto % 50;
		not20 = resto / 20;
		resto = resto % 20;
		not10 = resto / 10;
		resto = resto % 10;
		not5 = resto / 5;
		resto = resto % 5;
		not2 = resto / 2;
		resto = resto % 2;
		not1 = resto / 1;
		
		System.out.println(not100 + " nota(s) de R$ 100,00");
		System.out.println(not50 + " nota(s) de R$ 50,00");
		System.out.println(not20 + " nota(s) de R$ 20,00");
		System.out.println(not10 + " nota(s) de R$ 10,00");
		System.out.println(not5 + " nota(s) de R$ 5,00");
		System.out.println(not2 + " nota(s) de R$ 2,00");
		System.out.println(not1 + " nota(s) de R$ 1,00");

		sc.close();
	}

}

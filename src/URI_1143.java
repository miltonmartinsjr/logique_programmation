import java.util.Scanner;

public class URI_1143 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ini = 1;

		for (int i = 1; i <= N; i++) {

			int seg = i * i;
			int ter = seg * i;

			System.out.printf("%d %d %d%n", i, seg, ter);

		}

		sc.close();
	}

}

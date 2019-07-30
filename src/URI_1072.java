import java.util.Scanner;

public class URI_1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int contOut = 0;
		int contIn = 0;
		
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			if(X >= 10 && X <= 20) {
				contIn +=1;
			}
			else {
				contOut +=1;
			}
		}
		
		System.out.println(contIn + " in");
		System.out.println(contOut + " out");
				
		sc.close();
	}

}

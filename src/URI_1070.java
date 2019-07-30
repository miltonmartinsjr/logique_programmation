import java.util.Scanner;

public class URI_1070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			
			for (int i = 0; i <=5; i++) {
				
				if(x % 2 == 0) {
					x += 1;
					System.out.println(x);
					x += 1;
				}
				else {
					x += 2;
					System.out.println(x);
				}
			}
		
		sc.close();
	}

}

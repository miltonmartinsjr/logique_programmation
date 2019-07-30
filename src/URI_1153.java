import java.util.Scanner;

public class URI_1153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fact = sc.nextInt();
		int mult = 1;
		
		for(int i = 1; i <=fact; i ++) {
			
			mult = mult * i;
		}
		
		System.out.println(mult);
		
		
		sc.close();
	}

}

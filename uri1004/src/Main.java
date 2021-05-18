import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X1, X2, PROD;
		
		X1 = sc.nextInt();
		X2 = sc.nextInt();
		
		PROD = X1 * X2;
		
		System.out.println("PROD = " + PROD);
		
		
		
		sc.close();

	}

}

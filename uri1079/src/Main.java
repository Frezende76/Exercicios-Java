import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double N1 = 0;
		double N2 = 0;
		double N3 = 0;
		double MP = 0;
		for (int i = 0;i < N; i++) {
			
			  N1 = sc.nextDouble();
			  N2 = sc.nextDouble();
			  N3 = sc.nextDouble();
			  MP = ((N1 * 2)+(N2 * 3)+(N3 * 5))/10.0;
			  
			  System.out.printf("%.1f%n", MP);
			 
		}
		  
		
		 
				
		sc.close();

	}

}

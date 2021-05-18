import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double sal = sc.nextDouble();
		double mont = sc.nextDouble();
		
		double total = sal + (mont * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		
		

	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal = sc.nextDouble();
		double perc;
		
		if (sal <= 400.0) {
			perc = 15.0;
			
		}
		else if (sal <= 800.0) {
			perc = 12.0;
			
		}
		else if (sal <= 1200.0) {
			perc = 10.0;
			
		}
		else if (sal <= 2000.0) {
			perc = 7.0;
			
		}
		else {
			 perc = 4.0;
			
		}
		
		double reajuste = sal * perc / 100.0;
		double novosal = sal + reajuste;
		
		System.out.printf("Novo salario: %.2f%n", novosal);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", perc);
		
		
	   	sc.close();

	}

}

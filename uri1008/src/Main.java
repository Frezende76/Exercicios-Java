import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n_func, h_trab;
		double valor, sal;
		
		n_func = sc.nextInt();
		h_trab = sc.nextInt();
		valor = sc.nextDouble();
		
		sal = h_trab * valor;
		
		System.out.println("NUMBER = " + n_func);
		System.out.printf("SALARY = U$ %.2f%n" , sal);
		sc.close();

	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_peca1, n_peca1, cod_peca2, n_peca2;
		double val_unit_peca1, val_unit_peca2, total;
		
		
		cod_peca1 = sc.nextInt();
		n_peca1 = sc.nextInt();
		val_unit_peca1 = sc.nextDouble();
		
		cod_peca2 = sc.nextInt();
		n_peca2 = sc.nextInt();
		val_unit_peca2 = sc.nextDouble();
		
		
		total = ((n_peca1 * val_unit_peca1) + (n_peca2 * val_unit_peca2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}

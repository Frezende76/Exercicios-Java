import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		double qtde = sc.nextDouble();
		double preco = 0;
		double total = 0;
		
		switch (cod) {
		case 1:
			preco = 4.00;
		    total = qtde * preco;
		    break;
		case 2:
			preco = 4.50;
		    total = qtde * preco;
		    break;
		case 3:
			preco = 5.00;
		    total = qtde * preco;
		    break;
		case 4:
			preco = 2.00;
		    total = qtde * preco;
		    break;
		case 5:
			preco = 1.50;
		    total = qtde * preco;
		    break;    
		 default:
			 System.out.println("Codigo invalido");
			 break;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		
		sc.close();

	}

}

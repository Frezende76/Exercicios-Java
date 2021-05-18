import java.util.Locale;
import java.util.Scanner;


public class Main_scanner {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Definido US como localidade padrão
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//x = sc.next(); //Digitar uma variável do tipo String 
		
		//int x;
		//x = sc.nextInt(); //Digitar uma variável do tipo Inteira
		
		//double x;
		//x = sc.nextDouble(); //Digitar uma variável do tipo Double
		
		//char x;
		//x = sc.next().charAt(0); //Para ler um caractere
		
		//Para ler vários dados na mesma linha
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}

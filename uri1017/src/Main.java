import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tgasto, vel_media;
		double qtde_litros;
		
		
		tgasto = sc.nextInt();
		vel_media = sc.nextInt();
		
		qtde_litros = (tgasto * vel_media) / 12.0;
		
		System.out.printf("%.3f%n", qtde_litros);
		
		sc.close();

	}

}

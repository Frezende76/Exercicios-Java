import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double somaPares = 0.0;
		int qtdePares = 0;
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
				somaPares = somaPares + vet[i];
				qtdePares++;
			}
		}
		
		if (qtdePares == 0) {
			System.out.println("Não havia nenhum numero par");
		}
		else {
			double media = somaPares / qtdePares;
			System.out.printf("%.1f%n", media);		
		}
		
		sc.close();
	}

}

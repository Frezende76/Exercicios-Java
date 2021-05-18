import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		while (M > 0 && N > 0) {
			
			int menor = M;
			int maior = N;
			
			if (M > N) {
				menor = N;
				maior = M;
			}
			int soma = 0;
			for (int i=menor; i<=maior;i++) {
				soma = soma + i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + soma);
			
			M = sc.nextInt();
			N = sc.nextInt();
		}
		
		sc.close();

	}

}

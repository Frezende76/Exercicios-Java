import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0, posicao = 0;
		for (int i = 1; i <= 100; i++) {
			int num = sc.nextInt();
			if (maior > num) {
				maior = maior;
				posicao = posicao;
			}else {
				posicao = i;
				maior = num;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();
	}

}

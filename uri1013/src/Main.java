import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maior, tot;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		maior = (a + b + Math.abs(a - b)) / 2;

		tot = (maior + c + Math.abs(maior - c)) / 2;

		System.out.println(tot + " eh o maior");
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		media = (n1 * 3.5 + n2 * 7.5)/11;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();

	}

}

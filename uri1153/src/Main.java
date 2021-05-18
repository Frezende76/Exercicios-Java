import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int fat = X;
		
		while (X > 1) {
			fat = fat * (X-1);
			X--;
		}
			System.out.println(fat);
		
		
		sc.close();

	}

}

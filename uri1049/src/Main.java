import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String N1 = sc.nextLine();
		String N2 = sc.nextLine();
		String N3 = sc.nextLine();
		
			
		if (N1.equals("vertebrado")) {
			if(N2.equals("ave")) {
				if (N3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
			}
			else {
				if (N3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
			}
		}
		else {
				if (N2.equals("inseto")) {
					if (N3.equals("hematofago")) {
						System.out.println("pulga");
					}
					else {
						System.out.println("lagarta");
					}
				}
				else {
					 if (N3.equals("hematofago")) {
						 System.out.println("sanguessuga");
					 }
					 else {
						 System.out.println("minhoca");
					 }
				}
			}
		sc.close();

	}
}	

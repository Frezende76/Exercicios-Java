import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		
		
		float media = (2*N1 + 3*N2 + 4*N3 + 1*N4)/10 ;
		System.out.printf("Media: %.1f%n", media);
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			float notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float mediaFinal = (notaExame + media)/2;
		    if (mediaFinal >= 5.0) {
			    System.out.println("Aluno aprovado.");
			 }
		     else {
			    System.out.println("Aluno reprovado.");
			 }
		    System.out.printf("Media final: %.1f%n", mediaFinal);
		}
				
		sc.close();
		
		

	}

}

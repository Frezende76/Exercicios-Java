package uri1046;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hinicio = sc.nextInt();
		int hfim = sc.nextInt();
		
		int duracao;
		
		if (hinicio < hfim) {
			duracao = hfim - hinicio;
		}else {
			duracao = 24 - hinicio + hfim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		sc.close();

	}

}

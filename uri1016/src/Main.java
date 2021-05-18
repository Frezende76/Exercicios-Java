import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int dist, tempo;
		
		dist = sc.nextInt();
		
		tempo = dist * 2;
		
		System.out.println(tempo + " minutos");
		sc.close();
	}

}

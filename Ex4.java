package mamboNumFive;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma nota: ");
		float n1 = entrada.nextFloat();
		System.out.print("Digite uma nota: ");
		float n2 = entrada.nextFloat();
		System.out.print("Digite uma nota: ");
		float n3 = entrada.nextFloat();
		System.out.print("Digite uma nota: ");
		float n4 = entrada.nextFloat();
		
		System.out.print((n1 + n2 + n3 + n4) / 4);
		
		entrada.close();
		
	}
	

}

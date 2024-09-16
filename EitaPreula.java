package mamboNumFive;
import java.util.Scanner;

public class EitaPreula {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);


		System.out.print("Informe um num int: ");

		int num1 = entrada.nextInt();
		
		System.out.print("Informe um num float: ");
		float num2 = entrada.nextFloat();
		
		System.out.print("Informe um num Double ");
		double num3 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Informe uma letra: ");
		char nome = entrada.nextLine().charAt(0);
		
		boolean teste = true;
		
		System.out.print("Informe uma String: ");
		String texto = entrada.nextLine();



		System.out.println("inteiro: " + num1);
		System.out.println("\n Numero Flutante: " + num2);
		System.out.println("\n Double: " + num3);
		System.out.println("\n Letra: " + nome);
		System.out.println("\n Boolean: " + teste);
		System.out.println("\n String: " + texto);

		entrada.close();


	}

}

import java.util.Scanner;
public class Ex11 {

    public static void main(String[] args) {
        float altura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        altura = entrada.nextFloat();

        altura = (72.7f * altura) - 58;

        System.out.printf("Seu peso ideal é: %.2f", altura);

        entrada.close();
    }
    
}

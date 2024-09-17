import java.util.Scanner;

public class Ex12{
    public static void main(String[] args) {
        float h, m;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma altura: ");
        h = entrada.nextFloat();

        m = (62.1f * h) - 44.7f;
        h = (72.7f * h) - 58;

        System.out.printf("O peso ideal de um homem com essa altura é: %.2f", h);
        System.out.printf("\nO peso ideal de uma mulher com essa altura é: %.2f", m);

        entrada.close();
    }
}
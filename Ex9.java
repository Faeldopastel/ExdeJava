import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float celso;

        System.out.print("Digite a temperatura em °F: ");
        celso = entrada.nextFloat();

        System.out.printf("A temperatura em °C é: %.2f \n A temperatura em K é: %.2f ", (5 * ((celso - 32) / 5)), ((celso + 459.67f) / 1.8f));

        entrada.close();
    }
    
}

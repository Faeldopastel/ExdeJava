import java.util.Scanner;

public class Ex7 { 

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dos lados do quadrado: ");
        float lado1 = entrada.nextFloat();

        lado1 *= (float) lado1;

        System.out.printf("A área do quadrado é: %.2f", lado1);

        entrada.close();

    }
    
}

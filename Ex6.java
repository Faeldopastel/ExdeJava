import java.util.Scanner;

public class Ex6{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        float raio = entrada.nextFloat();
        
        float area = 0f;

        area = (raio*raio) * 3.14f;

        System.out.printf("A área do círculo é %.2f", area);

        entrada.close();
    }

}
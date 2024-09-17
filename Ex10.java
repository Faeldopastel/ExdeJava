import java.util.Scanner;
public class Ex10 {

    public static void main(String[] args) {

        int a, b;
        float c;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de a (inteiro): " );
        a = entrada.nextInt();
        System.out.print("Digite o valor de b (inteiro): " );
        b = entrada.nextInt();
        System.out.print("Digite o valor de b (numero ponto flutuante): " );
        c = entrada.nextFloat();



        System.out.printf("1°: %d\n2°: %.2f\n 3°: %.2f", ((2*a)* (b/2)), (float)((3*a) + c), (float)(c*c) );

        entrada.close();

    }
    
}

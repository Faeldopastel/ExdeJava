import java.util.Scanner;
public class Ex8{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float qtd_h, qtd_g;

        System.out.print("Digite o quanto você ganha por hora: ");
        qtd_g = entrada.nextFloat();
        System.out.print("Digite quantas horas você trabalhou: ");
        qtd_h = entrada.nextFloat();

        qtd_g *= qtd_h;
        qtd_g *= 30f;

        System.out.printf("Seu salário mensal é de %.2f ", qtd_g);

        entrada.close();
        
    }
    
}

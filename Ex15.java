import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float tam, tl, valor;

        System.out.println("Digite o tamanho do espaço a ser pintado em metro");
        tam = entrada.nextFloat();

        tam /= 3.00f;
        tl = (int)tam / 18f;
        tl = (float)++tl - (tam / 18f); 
        tam =  tam / 18;
        valor = (int)(tam + tl) * 80.0f;

        System.out.printf("Vão ser necessário %.2f litros de tinta, saindo por um total de R$%.2f", tam, valor);
        

        entrada.close();
    }

}

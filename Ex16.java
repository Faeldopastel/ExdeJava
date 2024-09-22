import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float tam, tl, valor, meia_lata, valorMeia, tam2;

        System.out.println("Digite o tamanho do espaço a ser pintado em metro");
        tam = entrada.nextFloat();

        tam /= 6.00f;

        tam2 = tam; //latas de 3.6 litros
        meia_lata = (int) tam / 3.6f; 
        meia_lata = (float) ++meia_lata - (tam / 3.6f);
        tam2 = tam2 / 3.6f;
        valorMeia = (int)(tam2 + meia_lata) * 25.0f; //valor total das latas de 3.6 litros
        

        tl = (int)tam / 18f; // latas de 18 litros
        tl = (float)++tl - (tam / 18f); 
        tam =  tam / 18;
        valor = (int)(tam + tl) * 80.0f; // valor total de latas de 18 litros

        System.out.printf("Com latas de 18 litros vai ser necessário %.2f litros de tinta, saindo por um total de R$%.2f\n", tam, valor);
        System.out.printf("Com latas de 3,6 litros vai ser necessário %.2f litros de tinta, saindo por um total de R$%.2f", tam2, valorMeia);
        
        

        entrada.close();
    }

}

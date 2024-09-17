import java.util.Scanner;
public class Ex13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float multa,peso, exce;

        System.out.print("Quantos kg de peixe o papo-de-pescador pegou: ");
        peso = entrada.nextFloat();

        exce = peso % 50f;
        

        multa = exce * 4.00f;
        System.out.printf("Tião papo-de-pescador pegou %.2f kg de peixes. Com %.2f excendo.\n Sua multa é de R$%.2f", peso, exce, multa);

        entrada.close();
        
    }
    
}

import java.util.Scanner;
public class Ex38 {
    public static void main(String[] args) {

        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número menor que 1000: ");

        num = entrada.nextInt();
        while(num > 1000){
            System.out.print("Número maior que 1000");
            num = entrada.nextInt();
        }
        System.out.printf("%d centenas", (int) (num / 100));
        System.out.printf("%d dezenas", (int) (num % 100) / 10);
        System.out.printf("%d unidade", (int) ((num % 100) % 10) / 1);


        entrada.close();

    }
    
}

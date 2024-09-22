import java.util.Scanner;
public class Ex37 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dia, mes, ano;

        System.out.print("Digite uma data. Primeiro o dia");
        dia = entrada.nextInt();
        while(dia < 0 || dia > 31){
            System.out.print("\nInválido! Digite novamente: ");
            dia = entrada.nextInt();
        };
        System.out.print("\nO mês");
        mes = entrada.nextInt();

        while(mes < 0 || mes > 12){
            System.out.print("\nInválido! Digite novamente: ");
            mes = entrada.nextInt();
        };

        System.out.print("Digite o ano: ");
        ano = entrada.nextInt();

        while(ano < 0){
            System.out.print("Ano negativo. Não pode: ");
            ano = entrada.nextInt();
        }

        System.out.printf("%d/%d/%d", dia, mes, ano);

        entrada.close();

    }
    
}

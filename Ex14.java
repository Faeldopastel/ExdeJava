import java.util.Scanner;
public class Ex14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float th,tg, inss, sind, desc;

        System.out.print("Digite o quanto você ganha por hora: ");
        tg = entrada.nextFloat();
        System.out.print("\nE a o total de horas trabalhadas: ");
        th = entrada.nextFloat();

        tg *= th * 30;

        inss = tg * 0.08f;
        sind = tg * 0.05f;
        desc = tg * 0.11f;

        th = tg - inss - sind - desc;

        System.out.printf("Salario bruto: %.2f\n", tg);
        System.out.printf("Inss: %.2f\n", inss);
        System.out.printf("sindicato: %.2f\n", sind);
        System.out.printf("IR: %.2f\n", desc);
        System.out.printf("Salário líquido: %.2f\n", th);

        entrada.close();
        
    }
    
}

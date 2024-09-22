import java.util.Scanner;
public class Ex29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float hora, valor_h, ir, inss, fgts, salario_bruto, desc = 0;
        
        System.out.print("Digite as horas que você trabalha no mês: ");
        hora = entrada.nextInt();
        System.out.print("\nQuanto ganha por hora?: ");
        valor_h = entrada.nextInt();

        salario_bruto = hora * valor_h;
        inss = salario_bruto * 0.10f;
        fgts = salario_bruto * 0.11f;

        desc = inss;



        if(salario_bruto < 900f){
            System.out.println("Isento");
        } else if(salario_bruto >= 900f && salario_bruto < 1500f){
            ir = salario_bruto * 0.05f;
            desc += ir;
            System.out.printf("Salario bruto(%.1f * %.0f): %.2f\n", valor_h, hora, salario_bruto);
            System.out.printf("IR(5 per): %.2f\n", ir);
            System.out.printf("INSS(10 per): %.2f\n", inss);
            System.out.printf("FGTS(11 per): %.2f\n", fgts);
            System.out.printf("Total de descontos: %.2f\n", desc);
            System.out.printf("Salário líquido: %.2f\n", salario_bruto - desc);

        } else if(salario_bruto >= 1500f && salario_bruto < 2500f){
            ir = salario_bruto * 0.10f;
            desc += ir;

            System.out.printf("Salario bruto(%.1f * %.0f): %.2f\n", valor_h, hora, salario_bruto);
            System.out.printf("IR(5 per): %.2f\n", ir);
            System.out.printf("INSS(10 per): %.2f\n", inss);
            System.out.printf("FGTS(11 per): %.2f\n", fgts);
            System.out.printf("Total de descontos: %.2f\n", desc);
            System.out.printf("Salário líquido: %.2f\n", salario_bruto - desc);
        } else{
            ir = salario_bruto * 0.20f;
            desc +=  ir;

            System.out.printf("Salario bruto(%.1f * %.0f): %.2f\n", valor_h, hora, salario_bruto);
            System.out.printf("IR(5 per): %.2f\n", ir);
            System.out.printf("INSS(10 per): %.2f\n", inss);
            System.out.printf("FGTS(11 per): %.2f\n", fgts);
            System.out.printf("Total de descontos: %.2f\n", desc);
            System.out.printf("Salário líquido: %.2f\n", salario_bruto - desc);
        }

        entrada.close();
    }
    
}

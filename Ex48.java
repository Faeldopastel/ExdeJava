import java.util.Scanner;
public class Ex48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valor = 0, qtd, desc = 0;
        int tip, fp;

        System.out.print("Digite o tipo de carne que deseja levar\n");
        System.out.println("---------------------");
        System.out.println("1 para filé duplo");
        System.out.println("2 para alcatra");
        System.out.println("1 para picanha");
        System.out.println("---------------------\n");

        tip = entrada.nextInt();

        while(tip < 1 || tip > 3){
            System.out.print("Digite novamente: ");
            tip = entrada.nextInt();
        }

        System.out.print("Digite a quantidade em kg: ");
        qtd = entrada.nextFloat();

        System.out.print("Digite a forma de pagamento\n");
        System.out.println("---------------------");
        System.out.println("1 cartão Tabajara");
        System.out.println("2 Dinheiro");
        System.out.println("3 Pix");
        System.out.println("4 Débito/Crédito");
        System.out.println("---------------------\n");

        fp = entrada.nextInt();
        

        if(tip == 1){

            if(qtd <5){
                valor = qtd * 4.90f;
            } else{
                valor = qtd * 5.80f;
            };

        }else if(tip == 2){
            if(qtd <5){
                valor = qtd * 5.90f;
            } else{
                valor = qtd * 6.80f;
            };

        }else{
            if(qtd <5){
                valor = qtd * 6.90f;
            } else{
                valor = qtd * 7.80f;
            };
        }

        if(fp == 1){
            desc = valor - (valor * 0.05f);
            System.out.println("----CUPOM FISCAL----");
            System.out.println("---------------------------");
            System.out.printf("carne escolhida: %d\n", tip);
            System.out.printf("Total de kg: %.2f\n", qtd);
            System.out.printf("Total de desconto: %.2f\n", valor - desc);
            System.out.println("---------------------------");
            System.out.printf("Total a pagar: %.2f", desc);
        }else{
            
            System.out.println("----CUPOM FISCAL----");
            System.out.println("---------------------------");
            System.out.printf("carne escolhida: %d\n", tip);
            System.out.printf("Total de kg: %.2f\n", qtd);
            System.out.println("---------------------------");
            System.out.printf("Total a pagar: %.2f", valor);
        }




        
        entrada.close();
    }
    
}

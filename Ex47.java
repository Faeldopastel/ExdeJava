import java.util.Scanner;
public class Ex47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valor = 0, kg;
        int esc;

        System.out.print("Escolha a fruta que você deseja levar\n1 para morangos\n2 para maças");
        esc = entrada.nextInt();
        while(esc <1 || esc >2){
            System.out.println("Escolha fora dos padrôes. Digite novamente");
            esc = entrada.nextInt();
        };
        System.out.print("Quantos kg?: ");
        kg = entrada.nextFloat();


        if(esc == 1){

            if(kg <5){
                valor = kg * 2.50f;
            } else{
                valor = kg * 2.20f;
            }

            if(kg > 8 || valor > 25f){
                valor -= (valor * 2.20f) * 0.10f;
            }

        } else{

            if(kg <5){
                valor = kg * 1.80f;
            } else{
                valor = kg * 1.50f;
            }

            if(kg > 8 || valor > 25f){
                valor -= (valor * 1.50f) * 0.10f;
            }
        }
        System.out.printf("Total de kg: %.2f\n", kg);
        System.out.printf("Fruta escolhida: %d\n", esc);
        System.out.printf("Total a pagar: %.2f", valor);





        entrada.close();
    }
    
}

import java.util.Scanner;
public class Ex46 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float litros, valor = 0;
        char comb;

        System.out.print("Digite o tipo de combustível que você deseja. Alcool = A\nGasolina = G: ");
        comb = entrada.nextLine().charAt(0);
        System.out.print("\nDigite o total de litros que você necessita: ");
        litros = entrada.nextFloat();
        
      
        while(litros <= 0){
            System.out.print("Litros negativos ou zero. Digite novamente ");
            litros = entrada.nextFloat();
        };




        if(comb == 'G' || comb == 'g'){

            if (litros < 20){
                valor = (litros * 2.50f) - ((litros * 2.50f) * 0.04f);


            } else{
                valor = (litros * 2.50f) - ((litros * 2.50f) * 0.06f);
            }

        } else{
            if (litros < 20){
                valor = (litros * 1.90f) - ((litros * 1.90f) * 0.03f);


            } else{
                valor = (litros * 1.90f) - ((litros * 1.90f) * 0.05f);
            }

        }

        System.out.printf("Comprando %.2f de %c. Você vai pagar %.2f", litros, comb, valor);

        entrada.close();
        
    }
    
}

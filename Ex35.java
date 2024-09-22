import java.util.Scanner;
public class Ex35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c; 
        Double delta;

        System.out.print("Vamos fazer uma equação de segndo grau.\n Digite o valor de a: ");
        a = entrada.nextInt();
        System.out.print("Valor de b: ");
        b = entrada.nextInt();
        System.out.print("Valor de c: ");
        c = entrada.nextInt();

        delta = (double)((b*b) - (4 * a * c));
        delta =  Math.sqrt(delta);
        System.out.print("\n" + delta);

        if(a == 0){
            System.out.print("A equação não é de segundo grau!");
        } else if(a < 0 && delta < 0){
            System.out.print("A equação não possuí raizes");
        } else{

            if(delta == 0 && a > 0){
                System.out.printf("Existe somente uma solução %.2f", ((-b) + delta)/2 * a);
                
            }else if(delta.isNaN()){
                System.out.print("Não existe raiz");
                
            }else{
                System.out.printf("A equação tem duas raizes %.2f e %.2f", ((-b) + delta) /2 * a, ((-b) - delta)/2 * a);
            };

        }

        entrada.close();
        


    }
    
}

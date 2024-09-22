import java.util.Scanner;
public class Ex43 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num;

        System.out.print("Digite um número: ");
        num = entrada.nextDouble();
        System.out.print(num);
        
        System.out.print("\n" + num);

        if(Math.round(num) != num){
            System.out.print("Decimal");

        } else {
            System.out.print("Inteiro");
        }
        entrada.close();

        
    }
    
}

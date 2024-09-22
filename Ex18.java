import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = entrada.nextInt();

        if(a > 0){
            System.out.print("Positivo");
        } else if( a < 0){
            System.out.print("Negativo");
        } else {
            System.out.print("Zero");
        }

        entrada.close();
        
    }
}
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int a,b;

        System.out.print("Digite um número: ");
        a = entrada.nextInt();
        System.out.print("\nDigite outro número: ");
        b = entrada.nextInt();

        if(a > b){
            System.out.printf("%d é maior que %d", a, b);

        } else{
            System.out.printf("%d é maior que %d", b, a);
        }

        entrada.close();
    }
    
}

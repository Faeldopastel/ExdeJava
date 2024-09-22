import java.util.Scanner;
public class Ex42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int num;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if((num % 2) == 0){
            System.out.println("Numero par");
        } else{
            System.out.println("Impar");
        }
        entrada.close();
        
    }
    
}

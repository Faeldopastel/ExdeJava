import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;

        System.out.print("Digite um número: ");
        a = entrada.nextInt();

        if((a % 2) == 0){
            a++;
            System.out.printf("Seu número par virou um número ímpar -> %d", a);
        } else if((a % 3) == 0){
            a++;
            System.out.printf("Seu número impar virou um número par -> %d", a);
        }

        entrada.close();

        
    }
    
}

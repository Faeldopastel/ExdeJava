import java.util.Scanner;
public class Ex30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String dia[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        
        System.out.print("Digite um número: 1 - 7");
        int a = entrada.nextInt();

        System.out.printf("Seu dia é %s: ", dia[a-1]);

        entrada.close();


    }
    
}

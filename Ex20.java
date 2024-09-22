import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int ano;


        System.out.print("Digite um ano de 4 digitos");
        ano = entrada.nextInt();

        if(((ano % 4) == 0 || (ano % 400) == 0) && (ano % 100) != 0 ){
            System.out.print("Ano bissexto");
        } else {
            System.out.print("Não é ano bissexto");
        }

        entrada.close();
        
    }
    
}

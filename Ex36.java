import java.util.Scanner;
public class Ex36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;

        System.out.print("Digite o ano do final da s=Segunda Guerra Mundial");
        a = entrada.nextInt();

        if(a == 1945){
            System.out.print("Acertou");
            if(((a % 4) == 0 || (a % 400) == 0) && (a % 100) != 0 ){

                System.out.printf("Ano bissexto");

            }else {
                System.out.print("Não é bissexto");
            }
        } else{
            System.out.print("Errou!");
            if(((a % 4) == 0 || (a % 400) == 0) && (a % 100) != 0 ){

                System.out.printf("Ano bissexto");

            }else {
                System.out.print("Não é bissexto");
            }

        }

        entrada.close();
        
    }
    
}

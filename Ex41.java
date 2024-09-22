import java.util.Scanner;
public class Ex41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int v_sac;

        System.out.print("Digite o valor de saque. \nMIN = 10\nMAX = 600: ");
        v_sac = entrada.nextInt();

        while(v_sac < 10 || v_sac > 600){
            System.out.print("Fora do permitido. Digite novamente: ");
            v_sac = entrada.nextInt();
            
        }

        System.out.printf("%d notas de 100\n", (int)(v_sac /100));
        System.out.printf("%d notas de 50\n", (int)(v_sac % 100) / 50);
        System.out.printf("%d notas de 10\n",(int)((v_sac % 100) % 50) / 10);
        System.out.printf("%d notas de 5\n",(int)((((v_sac % 100) % 50) % 10) / 5));
        System.out.printf("%d notas de 1", (int)((((v_sac % 100) % 50) % 10) % 5) / 1);
        entrada.close();
    }
    
}

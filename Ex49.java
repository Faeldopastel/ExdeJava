import java.util.Scanner;
public class Ex49 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        char que[] = {'a', 'a', 'b', 'b', 'c', 'c' ,'d', 'd', 'e', 'e'};
        char[] resp = new char[10];
        
        for(int i = 0 ; i<10; i++){
            System.out.printf("Pergunta %d\n", i + 1);
            System.out.println("Alternativas: ");
            System.out.println("----------");
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
            System.out.println("d");
            System.out.println("e");
            System.out.println("----------");
            System.out.print("Resposta = ");
            resp[i] = entrada.nextLine().charAt(0);

            if(resp[i] == que[i]){
                System.out.printf("Q%d: %c: Correto\n", i+1, resp[i]);
            } else{

                System.out.printf("Q%d: %c: Errada. Resposta certa (%c)\n", i+1, resp[i], que[i]);

            }
        }

        entrada.close();
    }
    
}

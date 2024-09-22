import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        char vogal[] = {'a', 'e', 'i', 'o', 'u'};

        System.out.print("Digite uma letra: ");
        char letra = entrada.nextLine().charAt(0);

        for(int i = 0; i < 5; i++){
            if(letra == vogal[i]){
                System.out.print("Vogal");
                i = 5;
            } else if (letra != vogal[i] && i == 4){
                
                System.out.print("Consoante");
                
            };

            entrada.close();
        }

    }
    
}

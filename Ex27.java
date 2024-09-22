import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String p;

        System.out.print("Digite um Período (Matutino - M; Vespertino - V; Noturno = N): ");
        p = entrada.nextLine();

        if(p == "Matutino" || p.charAt(0) == 'M'){
            System.out.print("Bom dia!");
        } else if(p == "Vespertino" || p.charAt(0) == 'V'){
            System.out.println("Boa tarde!");
        } else if(p == "Noturno" || p.charAt(0) == 'N'){
            System.out.println("Boa Noite!");
        } else{
            System.out.println("Nenhuma das opções selecionadas");
        }

        entrada.close();
        
    }
    
}

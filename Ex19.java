import java.util.Scanner;
public class Ex19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu Sexo (F ou M): ");
        char sex = entrada.nextLine().charAt(0);

        if (sex == 'M'){
            System.out.print("Masculino");
        } else if(sex == 'F'){
            System.out.print("Feminino");
        } else{
            System.out.print("Nenhuma das opções");
        }
        entrada.close();
    }
    
}

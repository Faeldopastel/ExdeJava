import java.util.Scanner;
public class Ex45 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String resp;

        String perguntas[] = {"Telefonou para a vítima?", "Esteve no local do Crime?",
        "Mora perto da vítima?:", "Devia para a vítima?" , "Já trabalhou com a vítima?"};

        int cont = 0;

        for(int i = 0; i< 5; i++){
            System.out.println(perguntas[i]);
            System.out.print("Sim ou não?: ");
            resp = entrada.nextLine();
            resp = resp.toLowerCase();
            

            if(resp.equals("sim") || resp.toLowerCase().charAt(0) == 's'){
                cont++;
                System.out.println(cont);
            };
        };

        if(cont == 2){
            System.out.print("Suspeito(a)");
        }else if(cont == 3 || cont == 4){
            System.out.print("Cúmplice");
        } else if(cont == 5){
            System.out.print("Assasino");
        } else{
            System.out.println("Inocente");
        }


        entrada.close();
        
    }
    
}

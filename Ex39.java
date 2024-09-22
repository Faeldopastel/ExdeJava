import java.util.Scanner;
public class Ex39 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] idades = new int[3];
        int media = 0;


        for(int i = 0; i < 3; i++){
            System.out.printf("Digite a idade do %d° aluno: ", i + 1);
            idades[i] = entrada.nextInt();
            media += idades[i];
        }

        media /= 3;

        if(media > 0 && media <25){
            System.out.print("Turma jovem");
        }
        else if(media >= 25 && media < 40){
            System.out.print("Turma adulta");
        } else {
            System.out.print("Turma idosa");
        }

        entrada.close();
        
    }
    
}

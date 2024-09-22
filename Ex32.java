import java.util.Scanner;
public class Ex32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] nota = new float[2];
        float media = 0;

        for(int i = 0; i < 2; i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            nota[i] = entrada.nextFloat();
            media += nota[i];
        }
        
        media /= 2;

        if(media >= 0 && media < 3 ){
            System.out.print("Reprovado");
        }else if(media >= 3 && media < 7){
            System.out.print("Em Exame");
        } else {
            System.out.print("Aprovado");
        };

        entrada.close();


    }
    
}

import java.util.Scanner;
public class Ex40 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float[] nota = new float[3];
        float media = 0;

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            nota[i] = entrada.nextFloat();
            media += nota[i];
        }
        
        media /= 3;


        if(media < 7){
            System.out.print("Reprovado\n");
        } else if(media >= 7 && media < 10){
            System.out.print("Aprovado\n");
        } else{
            System.out.print("Aprovado com distinção\n");
        }
        System.out.printf("Sua média: %.2f\n", media);
        
        entrada.close();
    }
    
}

import java.util.Scanner;
public class Ex24 {

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

        if(media >= 7){
            System.out.print("Aprovado");
        } else {
            System.out.print("Reprovado");
        };

        entrada.close();


    }
    
}

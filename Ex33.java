import java.util.Scanner;
public class Ex33 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] nota = new float[2];
        float media = 0;
        char conceito;

        for(int i = 0; i < 2; i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            nota[i] = entrada.nextFloat();
            media += nota[i];
        }
        
        media /= 2;

        if(media >= 0 && media < 4 ){
            conceito = 'E';
        }
        if(media >= 4 && media < 6 ){
            conceito = 'D';
            }
        if(media >= 6 && media < 7.5f ){
            conceito = 'C';
        }else if(media >= 7.5f && media < 9){
            conceito = 'B';
        } else {
            conceito = 'A';
        };

        System.out.printf("1° nota: %.2f\n2°nota: %.2f\n", nota[0], nota[1]);
        System.out.printf("Sua média: %.2f\n", media);

        if(conceito == 'A' || conceito == 'B' || conceito == 'C'){
            System.out.print("Aprovado");
        } else{
            System.out.print("Reprovado");
        };

        entrada.close();


    }
}



    


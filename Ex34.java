import java.util.Scanner;
public class Ex34 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        float[] lado = new float[3];
    
        for(int i = 0; i<3; i++){
            System.out.printf("Digite a medida do %d° lado: ", i + 1);
            lado[i] = entrada.nextFloat();
        }

        if(lado[0] != lado[1] && lado[1] != lado[2] && lado[2] != lado[0]){
            System.out.print("Triângulo Escaleno");
        } else if(lado[0] == lado[1] && lado[1] == lado[2] && lado[2] == lado[0]){
            System.out.print("Triângulo Equilátero");
        } else {
            System.out.print("Triângulo Isóceles");
        }

        entrada.close();
    }
    
}

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma distância em metros");
        float metros = entrada.nextFloat();

        System.out.println("A distância em cm é: " + (metros * 100));

        entrada.close();



    }
    
}

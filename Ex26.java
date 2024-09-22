import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, maior, menor;

        System.out.print("Digite um número: ");
        a = entrada.nextInt();
        System.out.print("Digite outro número: ");
        b = entrada.nextInt();
        System.out.print("Digite o ultimo número número: ");
        c = entrada.nextInt();
        
        if(a > b && a > c){
            maior = a;
            if(b < c){
                menor = b;
            } else {
                menor = c;
            };
        } else if(b > a && b > c){
            maior = b;
            if(a < c){
                menor = a;
            } else{
                menor = c;
            }
        } else {
            maior = c;
            if(a < b){
                menor = a;
            } else {
                menor = b;
            }
        }


        System.out.printf("o maior %d\nO menor %d", maior, menor);

        entrada.close();

    }
}

import java.util.Scanner;
public class Ex23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c, aux;

        System.out.print("Digite um número");
        a = entrada.nextInt();
        System.out.print("Digite outro número");
        b = entrada.nextInt();
        System.out.print("Digite o ultimo número número");
        c = entrada.nextInt();

        if( a > b && a > c){
            if(b > c){
                System.out.printf("%d %d %d", a, b, c);
            } else{
                aux = b;
                b = c;
                c = aux;
                System.out.printf("%d %d %d", a, b, c);
            };
            
        } else if(b > a && b > c){
            aux = a;
            a = b;
            b = aux;

            if(b > c){ 
                System.out.printf("%d %d %d", a, b, c);
            }else{
                b = c;
                c = aux;
                System.out.printf("%d %d %d", a, b, c);
            };
            
            
        } else {
            aux = a;
            a = c;
            c = aux;

            if(b > c){
                System.out.printf("%d %d %d", a, b, c);
            } else{
                c = b;
                b = aux;
                System.out.printf("%d %d %d", a, b, c);
            }
        }

        entrada.close();






    }
    
}

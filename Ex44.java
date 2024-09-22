import java.util.Scanner;
public class Ex44 {

    public static void verif(float a){
        if((a % 2) == 0){
            System.out.println("Resultado par");

        }else{
            System.out.println("impar");
        };

        if(a < 0){
            System.out.println("Número negativo");
        } else{
            System.out.println("Número positivo");
        };

        if(Math.round(a) != a){
            System.out.println("Número decimal");
        } else{
            System.out.println("Número inteiro");
        }
        
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Float a, b;
        int esc;

        System.out.print("Digite dois números: ");
        a = entrada.nextFloat();
        b = entrada.nextFloat();

        System.out.println("Selecione o número da operação que deseja realizar");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");

        esc = entrada.nextInt();

        while(esc < 1 || esc > 4){
            System.out.print("Inválido. Digite novamente!: ");
            esc = entrada.nextInt();
        };

        while(b == 0 && esc == 4){
            System.out.print("Não há divisão por 0. Digite Novamente o valor de b");
            b = entrada.nextFloat();
        }

        switch(esc) {
            case 1:
                a+=b;
                
                verif(a);
                
                break;
        
            case 2:
                a-=b;
                verif(a);
                

                break;
            case 3:
                a*=b;
                verif(a);

                break;
            case 4:
                a/=b;
                verif(a);


                break;
        }

        entrada.close();
        
    }
    
}

import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char sexo;
        float altura, a, peso;

        System.out.print("Qual o seu Sexo? M ou F: ");
        sexo = entrada.nextLine().charAt(0);
        System.out.print("\nQual a sua altura?: ");
        altura = entrada.nextFloat();
        System.out.print("\nQual o seu peso: ");
        peso = entrada.nextFloat();
        


        if(sexo == 'M'){
            a = altura;
            altura = (72.7f * altura) - 58;
            System.out.printf("Para um homem (%c) de %.2f. O peso ideal é de %.2fkg ",sexo, a, altura);

            if( peso > altura){
                System.out.print("\nVocê está acima do peso");
            } else{
                System.out.print("\nVocê está abaixo do peso");
            };

        } else{
            sexo = 'F';
            a = altura;
            altura = (62.1f * altura) - 58f;
            System.out.printf("Para uma mulher (%c) de %.2f. O peso ideal é de %.2fkg ",sexo, a, altura);

            if( peso > altura){
                System.out.print("\nVocê está acima do peso");
            } else{
                System.out.print("\nVocê está abaixo do peso");
            };
        }

        entrada.close();
    }
    
}

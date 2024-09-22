import java.util.Scanner;
public class Ex28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salario, aumento;

        System.out.print("Digite o salário do colaborador(a): ");
        salario = entrada.nextFloat();

        if(salario < 280f){
            aumento = (salario * 0.20f);
            System.out.printf("Um salário base de %.2f com um aumento de 20 porcento fica %.2f", salario, (salario + aumento));

        } else if(salario >= 280f && salario < 700f){
            aumento = (salario * 0.15F);
            System.out.printf("Um salário base de %.2f com um aumento de 15 porcento fica %.2f", salario, (salario + aumento));


        } else if(salario >= 700f && salario < 1500f){
            aumento = (salario * 0.10f);
            System.out.printf("Um salário base de %.2f com um aumento de 10 porcento fica %.2f", salario, (salario + aumento));

        } else {
            aumento = (salario * 0.05f);
            System.out.printf("Um salário base de %.2f com um aumento de 5 porcento fica %.2f", salario, (salario + aumento));

        };

        entrada.close();
    }
    
}

import java.util.Scanner;
public class Ex31 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        float preco;
        int codigo;
        String area[] = {"Sul", "Norte", "Leste", "Oeste", "Nordeste", "Nordeste", "Centro-Oeste"};


        System.out.print("Digite o código do produto 1 à 7: ");
        codigo = entrada.nextInt();
        System.out.print("Digite o valor: ");
        preco = entrada.nextFloat();

        if(codigo > 7){
            System.out.printf("Custo: %.2f\n", preco);
            System.out.printf("Origem: Importado");
        } else{
            System.out.printf("Custo: %.2f\n", preco);
            System.out.printf("Origem: %s", area[codigo - 1]);
        }

        entrada.close();
        
    }
    
}

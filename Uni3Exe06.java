
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double precqui = 25;
        double pesopra = 0.75;

        System.out.println("Digite o peso do prato:");
        double peso = scan.nextDouble();

        double preco = (peso - pesopra) * precqui;
        System.out.println("O valor a se pagar é: R$"+preco);

        scan.close();
    }
    
}

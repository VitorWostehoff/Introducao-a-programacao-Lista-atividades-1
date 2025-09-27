import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o preço da gasolina: ");
        double preco = scan.nextDouble();

        System.out.println("Digite o Valor pago: ");
        double pagamento = scan.nextDouble();

        double calc = pagamento/preco;

        System.out.println("Você abasteceu " + calc + " litros");

        scan.close();
    }
}
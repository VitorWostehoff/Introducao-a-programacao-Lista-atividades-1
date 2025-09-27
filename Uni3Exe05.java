
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero de frangos: ");
        int frangos = scan.nextInt();

        double anelchip = 4.00;
        double anel = 3.50*2;

        double calc = anelchip + anel;
        double valor = frangos * calc;

        System.out.println("O gasto para marcar " + frangos + " é R$" + valor);

        scan.close();
    }
}

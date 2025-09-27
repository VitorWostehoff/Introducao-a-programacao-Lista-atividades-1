
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        System.out.println("Escreva o valor do sapato: ");
        double preco = scan.nextDouble();
        double calc = preco * 0.12;

        System.out.println("O preço do desconto é R$" + calc);
        double calc2 = preco - calc;

        System.out.println("o preço do sapato com desconto é R$" + calc2);
        
        scan.close();
    }
}

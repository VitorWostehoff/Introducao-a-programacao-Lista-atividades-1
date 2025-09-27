import java.util.Scanner;

public class Uni3exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite o valor da compra:");
        int valor = scan.nextInt();

        System.out.println("digite o valor dado pelo cliente:");
        int pago = scan.nextInt();

        int troco = pago - valor;
        int centenas = (troco / 100);
        int dezenas = (troco % 100) / 10;
        int unidades = ((troco % 100) % 10);

        if (troco < 100){
            System.out.println("Quantidade de notas de 100: " + centenas);
        }
        
        if (troco < 100){
            System.out.println("Quantidade de notas de 10: " + dezenas);
        }
        if (troco > 10){
            System.out.println("Quantidade de notas de 1: " + unidades);
        }

        scan.close();
    }
}

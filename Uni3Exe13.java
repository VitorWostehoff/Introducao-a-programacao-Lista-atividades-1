import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double estampa = 12.50;
        double metro= estampa * 9;

        System.out.println("Digite qual a altura da parede:");
        double altura = scan.nextDouble();

        System.out.println("Digite qual o comprimento da parede:");
        double comp = scan.nextDouble();

        double metroqua = comp * altura;
        double valor = metroqua * metro;
        
        System.out.println("O valor final é de: R$"+ valor);

        scan.close();
    }
}

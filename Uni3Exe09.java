import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double pi = 3.14;

        System.out.println("Digite qual o raio da lata:");
        double raio = scan.nextDouble();

        System.out.println("Digite qual a altura da lata:");
        double altura = scan.nextDouble();

        double raio2 = raio*raio;
        double volume = pi* raio2 *altura;

        System.out.println("O volume da lata é: " + volume);

        scan.close();
    }
}

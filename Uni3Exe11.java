import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em C°:");
        double cels = scan.nextDouble();
            
        double fah = cels * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit é :" + fah);

        scan.close();
    }
}

import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o comprimento do 1° Cateto:");
        double cateto1 = scan.nextDouble();

        System.out.println("Digite o comprimento do 2° Cateto:");
        double cateto2 = scan.nextDouble();

        double cat1= cateto1 * cateto1;
        double cat2= cateto2* cateto2;

        double hipotenusa = cat1 + cat2;
        double hipo = Math.sqrt(hipotenusa);

        System.out.println("A comprimento da hipotenusa é: " + hipo);

        scan.close();
    }
}

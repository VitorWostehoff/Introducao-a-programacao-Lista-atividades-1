import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double dolar=5.65;
        
        System.out.println("Digite quantos doláres você deseja trocar:");
        double quant = scan.nextDouble();

        double cambio= quant * dolar;
        System.out.println("O atendente deve devolver: R$" + cambio);

        scan.close();
    }
}

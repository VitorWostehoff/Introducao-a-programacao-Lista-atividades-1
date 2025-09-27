import java.util.Scanner;

public class Uni3Exe01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        System.out.println("Digite a 1° dimensão: ");
        int D1 = scan.nextInt();
        
        System.out.println("Digite a 2° dimensão: ");
        int D2 = scan.nextInt();
        
        int calc = D1 * D2;
        System.out.println("A dimensão do terreno é: " + calc);
        
        scan.close();
    }
}
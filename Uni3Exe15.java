import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite um numero: ");
        int num = scan.nextInt();
        
        int centenas = num / 100;
        int dezenas = (num%100) / 10;
        int unidades = ((num%100)%10);

        System.out.println("Centenas:" + centenas + "Dezenas:" + dezenas + "unidades:" + unidades);

        scan.close();        
    }
}
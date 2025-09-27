import java.util.Scanner;


public class Uni3Exe07{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double garrafa1 = 0.35;
        double garrafa2=0.6;
        double garrafa3=2;
        
        System.out.println("Digite quantas garrafas de 350ml você deseja:");
        int quantgarr1 = scan.nextInt();

        System.out.println("Digite quantas garrafas de 600ml você deseja:");
        int quantgarr2 = scan.nextInt();

        System.out.println("Digite quantas garrafas de 2 litros você deseja:");
        int quantgarr3 = scan.nextInt();

        double resultado1= quantgarr1 *garrafa1;
        double resultado2= quantgarr2 *garrafa2;
        double resultado3= quantgarr3 *garrafa3;
        double fim = resultado1 + resultado2+ resultado3;
        System.out.println(resultado1);

        System.out.println("O Cliente comprou ao todo:" + fim + "Litros.");

        scan.close();
    }
}
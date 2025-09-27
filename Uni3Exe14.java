
import java.util.Scanner;


public class Uni3Exe14{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int litro = 12;
    
    System.out.println("Digite a distância percorrida em km:");
    double dist = scan.nextDouble();

    System.out.println("Digite o tempo gasto em horas:");
    double temp= scan.nextDouble();

    double kmh= dist/temp;
    double comb= dist/litro;
    
    System.out.println("A velocidade média foi de:"+ kmh +"km/h. E a quantidade de litros usada foi de:" + comb+ "Litros.");

    scan.close();
}

}
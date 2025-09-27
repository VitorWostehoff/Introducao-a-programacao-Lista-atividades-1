import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1° nota: ");
        double N1 = scan.nextDouble();

        System.out.println("Digite a 2° nota: ");
        double N2 = scan.nextDouble();

        System.out.println("Digite a 3° nota: ");
        double N3 = scan.nextDouble();

        double calc = N1+N2+N3/3;
        
        System.out.println("a nota final do aluno é: " + calc);

        if (calc < 18){
            System.out.println("O aluno não passou de ano :(");
        }
        else{
            System.out.println("O aluno passou de ano!!!!!!!!!!!!");
        }

        scan.close();
    }
}

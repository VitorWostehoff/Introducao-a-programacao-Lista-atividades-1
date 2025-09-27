import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.println("Digite o nome do funcionário:");
         String nome = scan.nextLine();

         System.out.println("Digite a quantidade de horas trabalhadas:");
         double horas = scan.nextDouble();

         System.out.println("Digite o número de dependentes:");
         double dep = scan.nextDouble();

         double calcsal= horas * 10;
         double depen = dep * 60;
         double desconto = 8.5 / 100;
         int desconto1 = 5/100;

         double salariobru = depen + calcsal;

         double salariotrab = salariobru - (desconto1*calcsal);

         double salariotrab1 = salariotrab - (desconto * calcsal);

         System.out.println("O funcionário " + nome + " Possui um salário bruto de R$" + salariobru + " e um salário líquido de R$" + salariotrab1);

         scan.close();
    }
} 

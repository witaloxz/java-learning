
import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();


        double sum = nota1 + nota2;
        double avg = sum / 2;

        System.out.println("Média: " + avg);
        if (avg <= 6) {
            System.out.println("Situação: Reprovado");
            
        } else{
             System.out.println("Situação: Aprovado");
        }
       

        sc.close();
    }

}
